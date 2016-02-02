import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt.{Build, _}

object SriExtra extends Build {

  import Dependencies._
  import LauncherConfigs._
  import PublicationDetails._

  val Scala211 = "2.11.7"

  lazy val commonSettings =
    Seq(
      organization := "com.github.chandu0101.sri-extra",
      version := "0.4.0-SNAPSHOT",
      homepage := Some(url("https://github.com/chandu0101/sri-extra")),
      licenses +=("Apache-2.0", url("http://opensource.org/licenses/Apache-2.0")),
      scalaVersion := Scala211,
      scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature",
        "-language:postfixOps", "-language:implicitConversions",
        "-language:higherKinds", "-language:existentials"))


  def DefProject(name: String, id: String = "") = {
    Project(if (id.isEmpty) name else id, file(name))
      .settings(commonSettings: _*)
      .enablePlugins(ScalaJSPlugin)
  }


  /** ===================  Test frameworks settings   */

  val scalatestJSSettings = Seq(scalatestJS,
    scalaJSStage in Global := FastOptStage,
    jsDependencies += RuntimeDOM,
    jsDependencies += ProvidedJS / "test-bundle.js" % Test
    //    jsEnv in Test := new PhantomJS2Env(scalaJSPhantomJSClassLoader.value, addArgs = Seq("--web-security=no"))
    //    jsEnv in Test := new NodeJSEnv()
  )


  // ================================ Module definitions  ================================ //
  lazy val Sri = DefProject(".", "root")
    .aggregate(universal, web, mobile)
    .configure(addCommandAliases(
    "wt" -> "; test:compile ; web/test",
    "tt" -> "; test:compile ; test/test",
    "T" -> "; clean ;t",
    "TT" -> ";+clean ;tt"))
    .settings(preventPublication)

  lazy val universal = DefProject("universal")
    .settings(universalModuleDeps)
    .settings(publicationSettings)


  lazy val web = DefProject("web")
    .dependsOn(universal)
    .settings(webModuleDeps)
    .settings(publicationSettings)


  lazy val mobile = DefProject("mobile")
    .dependsOn(universal)
    .settings(mobileModuleDeps)
    .settings(publicationSettings)


}
