package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiTouchRipple(
                           key: js.UndefOr[String] = js.undefined,
                           ref: js.UndefOr[String] = js.undefined,
                           centerRipple: js.UndefOr[Boolean] = js.undefined,
                           color: js.UndefOr[MuiColor] = js.undefined,
                           /* The material-ui theme applied to this component.*/
                           muiTheme: MuiTheme,
                           opacity: js.UndefOr[Double] = js.undefined,
                           /* Override the inline-styles of the root element.*/
                           style: js.UndefOr[js.Any] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiTouchRipple](this)
    React.createElement(Mui.TouchRipple, props, children: _*)
  }
}
