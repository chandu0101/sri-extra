package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiTooltip(
                       key: js.UndefOr[String] = js.undefined,
                       ref: js.UndefOr[String] = js.undefined,
                       /* The css class name of the root element.*/
                       className: js.UndefOr[String] = js.undefined,
                       horizontalPosition: js.UndefOr[LeftRightCenter] = js.undefined,
                       label: ReactNode,
                       show: js.UndefOr[Boolean] = js.undefined,
                       /* Override the inline-styles of the root element.*/
                       style: js.UndefOr[js.Any] = js.undefined,
                       touch: js.UndefOr[Boolean] = js.undefined,
                       verticalPosition: js.UndefOr[TopBottom] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiTooltip](this)
    React.createElement(Mui.Tooltip, props)
  }
}
        
