package sri.extra.web.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.ReactNode

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

class Vertical(val value: String) extends AnyVal

object Vertical {
  val top = new Vertical("top")
  val center = new Vertical("center")
  val bottom = new Vertical("bottom")
  val values = List(top, center, bottom)
}

class Horizontal(val value: String) extends AnyVal

object Horizontal {
  val left = new Horizontal("left")
  val middle = new Horizontal("middle")
  val right = new Horizontal("right")
  val values = List(left, middle, right)
}

case class Origin(vertical: Vertical, horizontal: Horizontal) {
  val toJS = JSMacro[Origin](this)
}

class ZDepth(val value: Int) extends AnyVal

object ZDepth {
  val _0 = new ZDepth(0)
  val _1 = new ZDepth(1)
  val _2 = new ZDepth(2)
  val _3 = new ZDepth(3)
  val _4 = new ZDepth(4)
  val _5 = new ZDepth(5)
}

class Corners(val value: String) extends AnyVal

object Corners {
  val bottom_left = new Corners("bottom-left")
  val bottom_right = new Corners("bottom-right")
  val top_left = new Corners("top-left")
  val top_right = new Corners("top-right")
  val values = List(bottom_left, bottom_right, top_left, top_right)
}

class CornersAndCenter(val value: String) extends AnyVal

object CornersAndCenter {
  val bottom_center = new CornersAndCenter("bottom-center")
  val bottom_left = new CornersAndCenter("bottom-left")
  val bottom_right = new CornersAndCenter("bottom-right")
  val top_center = new CornersAndCenter("top-center")
  val top_left = new CornersAndCenter("top-left")
  val top_right = new CornersAndCenter("top-right")
  val values = List(bottom_center, bottom_left, bottom_right, top_center, top_left, top_right)
}


@js.native
class MuiCheckboxM extends js.Object {
  /* Returns true if the checkbox is currently checked. Returns false otherwise*/
  def isChecked(): Boolean = js.native

  /* Sets the checkbox to the value of newCheckedValue. This method cannot be used while "checked" is defined as a property.*/
  def isChecked(newCheckedValue: Boolean): Unit = js.native
}

@js.native
class MuiDatePickerM extends js.Object {
  /* Returns the current date value.*/
  def getDate(): js.Date = js.native

  /* Sets the date value to d, where d is a date object.*/
  def setDate(d: js.Date): Unit = js.native

  /* Opens the date-picker dialog programmatically. Use this if you want to open the dialog in response to some event other than focus/tap on the input field, such as an external button click.*/
  def openDialog(): Unit = js.native

  /* An alias for the `openDialog()` method to allow more generic use alongside `TextField`.*/
  def focus(): Unit = js.native
}


@js.native
class MuiDialogM extends js.Object {

  /* Get the dialog open state.*/
  def isOpen(): Boolean = js.native
}

@js.native
trait MuiLeftNavM extends js.Object {

}

@js.native
trait MuiMenuItemProps extends js.Object {
  def value: js.UndefOr[String] = js.native
}

@js.native
class MuiRadioButtonGroupM extends js.Object {
  /* Returns the string value of the radio button that is currently selected. If nothing has been selected, an empty string is returned.*/
  def getSelectedValue(): String = js.native

  /* Sets the selected radio button to the radio button whose value matches newSelectionValue*/
  def setSelectedValue(newSelectionValue: String): Unit = js.native

  /* Clears the selected value for the radio button group.*/
  def clearValue(): Unit = js.native
}

@js.native
class MuiSnackbarM extends js.Object {
  /* Hides the snackbar.*/
  def dismiss(): Unit = js.native

  /* Shows the snackbar.*/
  def show(): Unit = js.native
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

@js.native
class MuiTimePickerM extends js.Object {
  /* Returns the current time value.*/
  def getTime(): js.Date = js.native

  /* Sets the time value to t, where t is a date object.*/
  def setTime(d: js.Date): Unit = js.native

  /* Formats the Date object to a current component's time format.*/
  def formatTime(d: js.Date): String = js.native

  /* Opens the time-picker dialog programmatically. Use this if you want to open the dialog in response to some event other than focus/tap on the input field, such as an external button click.*/
  def openDialog(): Unit = js.native

  /* An alias for the `openDialog()` method to allow more generic use alongside `TextField`.*/
  def focus(): Unit = js.native
}

@js.native
class MuiToggleM extends js.Object {
  /* Returns true if the checkbox is currently checked. Returns false otherwise*/
  def isToggled(): Boolean = js.native

  /* Sets the toggle to the value of newToggledValue. This method cannot be used while "checked" is defined as a property.*/
  def setToggled(newToggledValue: Boolean): Unit = js.native
}


@ScalaJSDefined
trait MuiAutoCompleteOption extends js.Object {

  val value: ReactNode

  val text: String

}

object MuiAutoCompleteFilters {

  val caseInsensitiveFilter: (String, String) => Boolean = Mui.AutoComplete.asInstanceOf[js.Dynamic].caseInsensitiveFilter.asInstanceOf[js.Function2[String, String, Boolean]]

  val fuzzyFilter: (String, String) => Boolean = Mui.AutoComplete.asInstanceOf[js.Dynamic].fuzzyFilter.asInstanceOf[js.Function2[String, String, Boolean]]

}

class HorizontalVeritcal(val value: String) extends AnyVal

object HorizontalVeritcal {
  val HORIZONTAL = new HorizontalVeritcal("horizontal")
  val VERTICAL = new HorizontalVeritcal("vertical")
}

@js.native
class TableM extends js.Object {
  def createTableBody(base: js.Any): js.Any = js.native

  def createTableFooter(base: js.Any): js.Any = js.native

  def createTableHeader(base: js.Any): js.Any = js.native

  def isScrollbarVisible(): js.Any = js.native
}
