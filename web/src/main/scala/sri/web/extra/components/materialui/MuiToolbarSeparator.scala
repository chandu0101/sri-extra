package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.React

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiToolbarSeparator(
                                key: js.UndefOr[String] = js.undefined,
                                ref: js.UndefOr[String] = js.undefined,
                                /* The css class name of the root element.*/
                                className: js.UndefOr[String] = js.undefined,
                                /* Override the inline-styles of the root element.*/
                                style: js.UndefOr[js.Any] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiToolbarSeparator](this)
    React.createElement(Mui.ToolbarSeparator, props)
  }
}
        
