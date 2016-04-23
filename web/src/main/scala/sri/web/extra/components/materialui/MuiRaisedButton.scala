package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement, ReactNode}
import sri.web.all._

import scala.scalajs.js
import scala.scalajs.js.`|`

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiRaisedButton(
                            key: js.UndefOr[String] = js.undefined,
                            ref: js.UndefOr[String] = js.undefined,
                            /* Override the background color. Always takes precedence unless the button is disabled.*/
                            backgroundColor: js.UndefOr[MuiColor] = js.undefined,
                            /* The css class name of the root element.*/
                            className: js.UndefOr[String] = js.undefined,
                            /* Disables the button if set to true.*/
                            disabled: js.UndefOr[Boolean] = js.undefined,
                            /* Override the background color if the button is disabled.*/
                            disabledBackgroundColor: js.UndefOr[MuiColor] = js.undefined,
                            /* Color of the label if disabled is true.*/
                            disabledLabelColor: js.UndefOr[MuiColor] = js.undefined,
                            /* If true, then the button will take up the full
                          width of its container.*/
                            fullWidth: js.UndefOr[Boolean] = js.undefined,
                            /* URL to link to when button clicked if `linkButton` is set to true.*/
                            href: js.UndefOr[String] = js.undefined,
                            /* Use this property to display an icon.*/
                            icon: js.UndefOr[ReactNode] = js.undefined,
                            /* The label for the button.*/
                            label: js.UndefOr[String] = js.undefined,
                            /* The color of the label for the button.*/
                            labelColor: js.UndefOr[MuiColor] = js.undefined,
                            /* Place label before or after the passed children.*/
                            labelPosition: js.UndefOr[BeforeAfter] = js.undefined,
                            /* Override the inline-styles of the button's label element.*/
                            labelStyle: js.UndefOr[js.Any] = js.undefined,
                            /* Enables use of `href` property to provide a URL to link to if set to true.*/
                            linkButton: js.UndefOr[Boolean] = js.undefined,
                            /* _ function for when the mouse is pressed down inside this element.*/
                            onMouseDown: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                            /* _ function for when the mouse enters this element.*/
                            onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                            /* _ function for when the mouse leaves this element.*/
                            onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                            /* _ function for when the mouse is realeased
                          above this element.*/
                            onMouseUp: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                            /* _ function for when a touchTap event ends.*/
                            onTouchEnd: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                            /* _ function for when a touchTap event starts.*/
                            onTouchStart: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                            /* If true, colors button according to
                          primaryTextColor from the Theme.*/
                            primary: js.UndefOr[Boolean] = js.undefined,
                            /* If true, colors button according to secondaryTextColor from the theme.
                          The primary prop has precendent if set to true.*/
                            secondary: js.UndefOr[Boolean] = js.undefined,
                            /* Override the inline-styles of the root element.*/
                            style: js.UndefOr[js.Any] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            centerRipple: js.UndefOr[Boolean] = js.undefined,
                            /* default: button: This component will render a button element by default and an anchor element if linkButton is set to true. However, you can override this behavior by passing in a string or another react element into this prop. This is useful for generating link buttons with the react router link element.
                            (Passed on to EnhancedButton)*/
                            containerElement: js.UndefOr[ReactNode] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            focusRippleColor: js.UndefOr[MuiColor] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            focusRippleOpacity: js.UndefOr[Double] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            keyboardFocused: js.UndefOr[Boolean] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            onKeyDown: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            onKeyUp: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            onKeyboardFocus: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            onTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            tabIndex: js.UndefOr[Double] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            touchRippleColor: js.UndefOr[MuiColor] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            touchRippleOpacity: js.UndefOr[Double] = js.undefined,
                            /* (Passed on to EnhancedButton)*/
                            `type`: js.UndefOr[String] = js.undefined) {
  /**
   * @param children This is what will be displayed inside the button.
If a label is specified, the text within the label prop will
be displayed. Otherwise, the component will expect children
which will then be displayed (in our example,
we are nesting an <input type="file" />and a span
that acts as our label to be displayed.) This only
applies to flat and raised buttons.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiRaisedButton](this)
    React.createElement(Mui.RaisedButton, props, children: _*)
  }
}
