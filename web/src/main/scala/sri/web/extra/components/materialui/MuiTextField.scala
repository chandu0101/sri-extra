package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.extra.api.{ReactEventI, ReactFocusEventH, ReactKeyboardEventH, ReactKeyboardEventI}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiTextField(
                         key: js.UndefOr[String] = js.undefined,
                         ref: js.UndefOr[MuiTextFieldM => Unit] = js.undefined,
                         /* The css class name of the root element.*/
                         className: js.UndefOr[String] = js.undefined,
                         /* The text string to use for the default value.*/
                         defaultValue: js.UndefOr[String] = js.undefined,
                         /* Disables the text field if set to true.*/
                         disabled: js.UndefOr[Boolean] = js.undefined,
                         /* The style object to use to override error styles.*/
                         errorStyle: js.UndefOr[js.Any] = js.undefined,
                         /* The error content to display.*/
                         errorText: js.UndefOr[ReactNode] = js.undefined,
                         /* The style object to use to override floating label styles.*/
                         floatingLabelStyle: js.UndefOr[js.Any] = js.undefined,
                         /* The content to use for the floating label element.*/
                         floatingLabelText: js.UndefOr[ReactNode] = js.undefined,
                         /* If true, the field receives the property width 100%.*/
                         fullWidth: js.UndefOr[Boolean] = js.undefined,
                         /* Override the inline-styles of the TextField's hint text element.*/
                         hintStyle: js.UndefOr[js.Any] = js.undefined,
                         /* The hint content to display.*/
                         hintText: js.UndefOr[ReactNode] = js.undefined,
                         /* The id prop for the text field.*/
                         id: js.UndefOr[String] = js.undefined,
                         /* Override the inline-styles of the TextField's input element.*/
                         inputStyle: js.UndefOr[js.Any] = js.undefined,
                         /* If true, a textarea element will be rendered.
                       The textarea also grows and shrinks according to the number of lines.*/
                         multiLine: js.UndefOr[Boolean] = js.undefined,
                         /* _ function that is fired when the textfield loses focus.*/
                         onBlur: js.UndefOr[ReactEventI => _] = js.undefined,
                         /* _ function that is fired when the textfield's value changes.*/
                         onChange: js.UndefOr[ReactEventI => _] = js.undefined,
                         /* The function to call when the user presses the Enter key.*/
                         onEnterKeyDown: js.UndefOr[ReactKeyboardEventI => _] = js.undefined,
                         /* _ function that is fired when the textfield gains focus.*/
                         onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                         /* _ function fired when key is pressed down.*/
                         onKeyDown: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                         /* Number of rows to display when multiLine option is set to true.*/
                         rows: js.UndefOr[Int] = js.undefined,
                         /* Maximum number of rows to display when
                       multiLine option is set to true.*/
                         rowsMax: js.UndefOr[Int] = js.undefined,
                         /* Override the inline-styles of the root element.*/
                         style: js.UndefOr[js.Any] = js.undefined,
                         /* Specifies the type of input to display
                       such as "password" or "text".*/
                         `type`: js.UndefOr[String] = js.undefined,
                         /* Override the inline-styles of the
                       TextField's underline element when disabled.*/
                         underlineDisabledStyle: js.UndefOr[js.Any] = js.undefined,
                         /* Override the inline-styles of the TextField's
                       underline element when focussed.*/
                         underlineFocusStyle: js.UndefOr[js.Any] = js.undefined,
                         /* If true, shows the underline for the text field.*/
                         underlineShow: js.UndefOr[Boolean] = js.undefined,
                         /* Override the inline-styles of the TextField's underline element.*/
                         underlineStyle: js.UndefOr[js.Any] = js.undefined,
                         /* The value of the text field.*/
                         value: js.UndefOr[String] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiTextField](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.TextField)
    React.createElement(Mui.TextField, props, children: _*)
  }
}


@js.native
class MuiTextFieldM extends js.Object {
  /* Removes focus on the input element.*/
  def blur(): Unit = js.native

  /* Clears the value on the input element.*/
  def clearValue(): Unit = js.native

  /* Sets the focus on the input element.*/
  def focus(): Unit = js.native

  /* Returns the value of the input.*/
  def getValue(): String = js.native

  /* Sets the error text on the input element.*/
  def setErrorText(newErrorText: String): Unit = js.native

  /* Sets the value of the input element.*/
  def setValue(newValue: String): Unit = js.native
}
