package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */
    
case class MuiAppCanvas(
  key:      js.UndefOr[String]    = js.undefined,
  ref:      js.UndefOr[String]    = js.undefined){

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiAppCanvas](this)
    if (children.isEmpty)
      React.createElement(Mui.AppCanvas, props)
    else if (children.size == 1)
      React.createElement(Mui.AppCanvas, props, children.head)
    else
      React.createElement(Mui.AppCanvas, props, children: _*)

  }
}
