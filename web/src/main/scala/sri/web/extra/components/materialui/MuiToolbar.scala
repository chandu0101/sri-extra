package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiToolbar(
                       key: js.UndefOr[String] = js.undefined,
                       ref: js.UndefOr[String] = js.undefined,
                       /* The css class name of the root element.*/
                       className: js.UndefOr[String] = js.undefined,
                       /* Do not apply `desktopGutter` to the `Toolbar`.*/
                       noGutter: js.UndefOr[Boolean] = js.undefined,
                       /* Override the inline-styles of the root element.*/
                       style: js.UndefOr[js.Any] = js.undefined) {
  /**
   * @param children Can be a `ToolbarGroup` to render a group of related items.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiToolbar](this)
    React.createElement(Mui.Toolbar, props, children: _*)
  }
}
