package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.web.extra.api.ReactMouseEventH

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiFontIcon(
                        key: js.UndefOr[String] = js.undefined,
                        ref: js.UndefOr[String] = js.undefined,
                        /* This is the font color of the font icon. If not specified,
                      this component will default to muiTheme.palette.textColor.*/
                        color: js.UndefOr[MuiColor] = js.undefined,
                        /* This is the icon color when the mouse hovers over the icon.*/
                        hoverColor: js.UndefOr[MuiColor] = js.undefined,
                        /* Function called when mouse enters this element.*/
                        onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                        /* Function called when mouse leaves this element.*/
                        onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                        /* Override the inline-styles of the root element.*/
                        style: js.UndefOr[js.Any] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiFontIcon](this)
    React.createElement(Mui.FontIcon, props)
  }
}
        
