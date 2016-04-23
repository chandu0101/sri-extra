package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.all._

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiRadioButtonGroup(
                                key: js.UndefOr[String] = js.undefined,
                                ref: js.UndefOr[MuiRadioButtonGroupM => Unit] = js.undefined,
                                /* The css class name of the root element.*/
                                className: js.UndefOr[String] = js.undefined,
                                /* Sets the default radio button to be the one whose
                              value matches defaultSelected (case-sensitive).
                              This will override any individual radio button with
                              the defaultChecked or checked property stated.*/
                                defaultSelected: js.UndefOr[String] = js.undefined,
                                /* Where the label will be placed for all radio buttons.
                              This will override any labelPosition properties defined
                              for an individual radio button.*/
                                labelPosition: js.UndefOr[LeftRight] = js.undefined,
                                /* The name that will be applied to all radio buttons inside it.*/
                                name: String,
                                /* _ function that is fired when a radio button has
                              been clicked. Returns the event and the value of the radio
                              button that has been selected.*/
                                onChange: js.UndefOr[(ReactEventI, String) => _] = js.undefined,
                                /* Override the inline-styles of the root element.*/
                                style: js.UndefOr[js.Any] = js.undefined,
                                /* The value of the currently selected radio button.*/
                                valueSelected: js.UndefOr[String] = js.undefined) {
  /**
   * @param children Should be used to pass `RadioButton` components.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiRadioButtonGroup](this)
    React.createElement(Mui.RadioButtonGroup, props, children: _*)
  }
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
