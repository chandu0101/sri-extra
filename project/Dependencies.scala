import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object Dependencies {


  object Version {
    val scala211 = "2.11.8"
    val sri = "0.5.0-SNAPSHOT"
    val scalaTest = "3.0.0-M15"

  }


  val scalatestJS = libraryDependencies += "org.scalatest" %%% "scalatest" % Version.scalaTest % Test


  val sriUniversal = libraryDependencies += "com.github.chandu0101.sri" %%% "universal" % Version.sri

  val sriMobile = libraryDependencies += "com.github.chandu0101.sri" %%% "mobile" % Version.sri

  val sriWeb = libraryDependencies += "com.github.chandu0101.sri" %%% "web" % Version.sri


  val universalModuleDeps = Seq(
    sriUniversal
  )

  val webModuleDeps = Seq(
    sriWeb
  )

  val mobileModuleDeps = Seq(
    sriMobile
  )

}