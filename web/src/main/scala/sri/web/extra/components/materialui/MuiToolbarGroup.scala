package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiToolbarGroup(
                            key: js.UndefOr[String] = js.undefined,
                            ref: js.UndefOr[String] = js.undefined,
                            /* The css class name of the root element.*/
                            className: js.UndefOr[String] = js.undefined,
                            /* Set this to true for if the `ToolbarGroup` is the first child of `Toolbar`
                          to prevent setting the left gap.*/
                            firstChild: js.UndefOr[Boolean] = js.undefined,
                            /* Determines the side the `ToolbarGroup` will snap to. Either 'left' or 'right'.*/
                            float: js.UndefOr[LeftRight] = js.undefined,
                            /* Set this to true for if the `ToolbarGroup` is the last child of `Toolbar`
                          to prevent setting the right gap.*/
                            lastChild: js.UndefOr[Boolean] = js.undefined,
                            /* Override the inline-styles of the root element.*/
                            style: js.UndefOr[js.Any] = js.undefined) {
  /**
   * @param children Can be any node or number of nodes.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiToolbarGroup](this)
    React.createElement(Mui.ToolbarGroup, props, children: _*)
  }
}
