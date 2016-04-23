package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.all._

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiDropDownIcon(
                            key: js.UndefOr[String] = js.undefined,
                            ref: js.UndefOr[String] = js.undefined,
                            closeOnMenuItemTouchTap: js.UndefOr[Boolean] = js.undefined,
                            iconClassName: js.UndefOr[String] = js.undefined,
                            iconLigature: js.UndefOr[String] = js.undefined,
                            iconStyle: js.UndefOr[js.Any] = js.undefined,
                            onChange: js.UndefOr[(ReactEventI, Int, js.Any) => _] = js.undefined,
                            /* Override the inline-styles of the root element.*/
                            style: js.UndefOr[js.Any] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiDropDownIcon](this)
    if (children.isEmpty)
      React.createElement(Mui.DropDownIcon, props)
    else if (children.size == 1)
      React.createElement(Mui.DropDownIcon, props, children.head)
    else
      React.createElement(Mui.DropDownIcon, props, children: _*)
  }
}
