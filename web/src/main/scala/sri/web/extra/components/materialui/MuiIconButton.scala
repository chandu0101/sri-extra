package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.extra.api.{ReactEventH, ReactFocusEventH, ReactKeyboardEventH, ReactMouseEventH}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiIconButton(
                          key: js.UndefOr[String] = js.undefined,
                          ref: js.UndefOr[String] = js.undefined,
                          /* The css class name of the root element.*/
                          className: js.UndefOr[String] = js.undefined,
                          /* Disables the icon button.*/
                          disabled: js.UndefOr[Boolean] = js.undefined,
                          /* If you are using a stylesheet for your
                        icons, enter the class name for the icon to be used here.*/
                          iconClassName: js.UndefOr[String] = js.undefined,
                          /* Overrides the inline-styles of the icon element.*/
                          iconStyle: js.UndefOr[js.Any] = js.undefined,
                          /* _ function for when the component loses focus.*/
                          onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                          /* _ function for when the component gains focus.*/
                          onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                          /* _ function for when the component
                        receives keyboard focus.*/
                          onKeyboardFocus: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                          /* _ function for when mouse enters element.*/
                          onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                          /* _ function for when mouse leaves element.*/
                          onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                          /* Override the inline-styles of the root element.*/
                          style: js.UndefOr[js.Any] = js.undefined,
                          /* The tooltip text to show.*/
                          tooltip: js.UndefOr[ReactNode] = js.undefined,
                          /* Allows the tooltip to be viewed with different
                        alignments: "bottom-center", "top-center",
                        "bottom-right", "top-right", "bottom-left" and "top-left".*/
                          tooltipPosition: js.UndefOr[CornersAndCenter] = js.undefined,
                          /* Styles prop passed down to the tooltip.*/
                          tooltipStyles: js.UndefOr[js.Any] = js.undefined,
                          /* Prop for tooltip to make it larger for mobile.*/
                          touch: js.UndefOr[Boolean] = js.undefined) {
  /**
   * @param children Can be used to pass a font icon as the icon for the button.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiIconButton](this)
    React.createElement(Mui.Badge, props, children: _*)
  }
}
