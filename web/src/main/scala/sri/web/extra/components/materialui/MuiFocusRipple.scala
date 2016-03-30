package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.React

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiFocusRipple(
                           key: js.UndefOr[String] = js.undefined,
                           ref: js.UndefOr[String] = js.undefined,
                           color: js.UndefOr[MuiColor] = js.undefined,
                           innerStyle: js.UndefOr[js.Any] = js.undefined,
                           /* The material-ui theme applied to this component.*/
                           muiTheme: MuiTheme,
                           opacity: js.UndefOr[Double] = js.undefined,
                           show: js.UndefOr[Boolean] = js.undefined,
                           /* Override the inline-styles of the root element.*/
                           style: js.UndefOr[js.Any] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiFocusRipple](this)
    React.createElement(Mui.FocusRipple, props)
  }
}
        
