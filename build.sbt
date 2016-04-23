import LauncherConfigs._
import CommonUtils._
import PublicationDetails._
import Dependencies._



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


// workaround http://stackoverflow.com/questions/20931217/deprecation-and-feature-warnings-for-sbt-project-definition-files

scalacOptions ++= Seq("-unchecked", "-deprecation")