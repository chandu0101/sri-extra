package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement, ReactNode}
import sri.web.all._

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiRadioButton(
                           key: js.UndefOr[String] = js.undefined,
                           ref: js.UndefOr[String] = js.undefined,
                           /* Used internally by `RadioButtonGroup`.
                         Checked if true.*/
                           checked: js.UndefOr[Boolean] = js.undefined,
                           /* Disabled if true.*/
                           disabled: js.UndefOr[Boolean] = js.undefined,
                           /* Overrides the inline-styles of the icon element.*/
                           iconStyle: js.UndefOr[js.Any] = js.undefined,
                           /* Used internally by `RadioButtonGroup`. Use the `labelPosition` property of `RadioButtonGroup` instead.
                         Where the label will be placed next to the radio button.*/
                           labelPosition: js.UndefOr[LeftRight] = js.undefined,
                           /* Overrides the inline-styles of the RadioButton element label.*/
                           labelStyle: js.UndefOr[js.Any] = js.undefined,
                           /* _ function for checked event.*/
                           onCheck: js.UndefOr[(ReactEventH, Boolean) => _] = js.undefined,
                           /* Override the inline-styles of the root element.*/
                           style: js.UndefOr[js.Any] = js.undefined,
                           /* The value of our radio button component.*/
                           value: js.UndefOr[String] = js.undefined,
                           /* The css class name of the root element.
                           (Passed on to EnhancedSwitch)*/
                           className: js.UndefOr[String] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           defaultSwitched: js.UndefOr[Boolean] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           id: js.UndefOr[String] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           inputType: js.UndefOr[String] = js.undefined,
                           /* The text that is displayed beside the radio button.
                           (Passed on to EnhancedSwitch)*/
                           label: js.UndefOr[ReactNode] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           name: js.UndefOr[String] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           onMouseDown: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           onMouseUp: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           onParentShouldUpdate: js.UndefOr[Boolean => _] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           onSwitch: js.UndefOr[(ReactEventI, Boolean) => _] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           onTouchEnd: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           onTouchStart: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           required: js.UndefOr[Boolean] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           rippleColor: js.UndefOr[MuiColor] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           rippleStyle: js.UndefOr[js.Any] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           switchElement: js.UndefOr[ReactElement] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           switched: js.UndefOr[Boolean] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           thumbStyle: js.UndefOr[js.Any] = js.undefined,
                           /* (Passed on to EnhancedSwitch)*/
                           trackStyle: js.UndefOr[js.Any] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiRadioButton](this)
    React.createElement(Mui.RadioButton, props)
  }
}
        
