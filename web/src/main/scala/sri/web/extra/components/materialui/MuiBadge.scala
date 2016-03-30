package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiBadge(
                     key: js.UndefOr[String] = js.undefined,
                     ref: js.UndefOr[String] = js.undefined,
                     /* This is the content rendered within the badge.*/
                     badgeContent: ReactNode,
                     /* Override the inline-styles of the badge element.*/
                     badgeStyle: js.UndefOr[js.Any] = js.undefined,
                     /* The css class name of the root element.*/
                     className: js.UndefOr[String] = js.undefined,
                     /* If true, the badge will use the primary badge colors.*/
                     primary: js.UndefOr[Boolean] = js.undefined,
                     /* If true, the badge will use the secondary badge colors.*/
                     secondary: js.UndefOr[Boolean] = js.undefined,
                     /* Override the inline-styles of the root element.*/
                     style: js.UndefOr[js.Any] = js.undefined) {
  /**
   * @param children The badge will be added relativelty to this node.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiBadge](this)
    if (children.isEmpty)
      React.createElement(Mui.Badge, props)
    else if (children.size == 1)
      React.createElement(Mui.Badge, props, children.head)
    else
      React.createElement(Mui.Badge, props, children: _*)
  }
}
