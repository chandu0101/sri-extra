package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.React

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiToolbarTitle(
                            key: js.UndefOr[String] = js.undefined,
                            ref: js.UndefOr[String] = js.undefined,
                            /* The css class name of the root element.*/
                            className: js.UndefOr[String] = js.undefined,
                            /* Override the inline-styles of the root element.*/
                            style: js.UndefOr[js.Any] = js.undefined,
                            /* The text to be displayed.*/
                            text: js.UndefOr[String] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiToolbarTitle](this)
    React.createElement(Mui.ToolbarTitle, props)
  }
}
        
