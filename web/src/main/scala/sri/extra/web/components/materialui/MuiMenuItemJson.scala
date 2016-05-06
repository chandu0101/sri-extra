package sri.extra.web.components.materialui

import chandu0101.macros.tojs.JSMacro

import scala.scalajs.js

class MuiMenuItemType private(val value: String) extends AnyVal

object MuiMenuItemType {

  val SUBHEADER = new MuiMenuItemType("SUBHEADER")
  val LINK = new MuiMenuItemType("LINK")
  val NESTED = new MuiMenuItemType("NESTED")

  def newType(name: String) = new MuiMenuItemType(name)

}