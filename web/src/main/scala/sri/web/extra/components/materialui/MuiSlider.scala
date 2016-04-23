package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.web.all._

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiSlider(
                      key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      /* The default value of the slider.*/
                      defaultValue: js.UndefOr[Double] = js.undefined,
                      /* Describe the slider.*/
                      description: js.UndefOr[String] = js.undefined,
                      /* Disables focus ripple if set to true.*/
                      disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                      /* If true, the slider will not be interactable.*/
                      disabled: js.UndefOr[Boolean] = js.undefined,
                      /* An error message for the slider.*/
                      error: js.UndefOr[String] = js.undefined,
                      /* The maximum value the slider can slide to on
                    a scale from 0 to 1 inclusive. Cannot be equal to min.*/
                      max: js.UndefOr[Double] = js.undefined,
                      /* The minimum value the slider can slide to on a scale
                    from 0 to 1 inclusive. Cannot be equal to max.*/
                      min: js.UndefOr[Double] = js.undefined,
                      /* The name of the slider. Behaves like the name attribute
                    of an input element.*/
                      name: js.UndefOr[String] = js.undefined,
                      /* _ function that is fired when the focus has left the slider.*/
                      onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                      /* _ function that is fired when the user changes the slider's value.*/
                      onChange: js.UndefOr[(ReactEventH, Double) => _] = js.undefined,
                      /* _ function that is fired when the slider has begun to move.*/
                      onDragStart: js.UndefOr[ReactDragEventH => _] = js.undefined,
                      /* _ function that is fried when the slide has stopped moving.*/
                      onDragStop: js.UndefOr[ReactDragEventH => _] = js.undefined,
                      /* _ fired when the user has focused on the slider.*/
                      onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                      /* Whether or not the slider is required in a form.*/
                      required: js.UndefOr[Boolean] = js.undefined,
                      /* The granularity the slider can step through values.*/
                      step: js.UndefOr[Double] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined,
                      /* The value of the slider.*/
                      value: js.UndefOr[Double] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiSlider](this)
    React.createElement(Mui.Badge, props)
  }
}
        
