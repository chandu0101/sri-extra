import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object Dependencies {

    val scalaAsyncVersion = "0.9.2"

  val upickleVersion = "0.3.1"

  val scalatestVersion = "3.0.0-M6"


  val sriVersion = "0.4.0-SNAPSHOT"

  val scalatestJS = libraryDependencies += "org.scalatest" %%% "scalatest" % scalatestVersion % Test


  val sriUniversal = libraryDependencies += "com.github.chandu0101.sri" %%% "universal" % sriVersion

  val sriMobile = libraryDependencies += "com.github.chandu0101.sri" %%% "mobile" % sriVersion

  val sriWeb = libraryDependencies += "com.github.chandu0101.sri" %%% "web" % sriVersion


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