import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object Dependencies {


  object Version {
    val scala211 = "2.11.8"
    val scala212 = "2.12.0"
    val sri = "0.6.0"
    val scalaTest = "3.0.0"
    val sriScalaCss = "2016.11.0"

  }


  val scalatestJS = libraryDependencies += "org.scalatest" %%% "scalatest" % Version.scalaTest % Test


  val sriUniversal = libraryDependencies += "com.github.chandu0101" %%% "sri-universal" % Version.sri

  val sriMobile = libraryDependencies += "com.github.chandu0101" %%% "sri-mobile" % Version.sri

  val sriWeb = libraryDependencies += "com.github.chandu0101" %%% "sri-web" % Version.sri

  val sriScalaCss = libraryDependencies += "com.github.chandu0101" %%% "sri-scalacss" % Version.sriScalaCss


  val universalModuleDeps = Seq(
    sriUniversal
  )

  val webModuleDeps = Seq(
    sriWeb
  )

  val mobileModuleDeps = Seq(
    sriMobile
  )

  val demoModuleDeps = Seq(
    sriScalaCss
  )

}