package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js.{UndefOr => U}
import scalacss.Defaults._
import scalacss.internal.mutable.StyleSheet.Inline


object MuiSwitchesDemo {

  object Style extends Inline {

    import dsl._

    val container = style(maxWidth(1024 px))

    val content = style(display.flex,
      padding(30.px),
      flexDirection.column,
      alignItems.center)
  }

  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val component = () => {
    CodeExample(code, "MuiSwitches")(
      div(className = Style.container)(
        h3()("Switches"),
        MuiTabs()(
          MuiTab(label = "Checkbox")(
            div(className = Style.content)(
              MuiCheckbox(name = "checkboxName1",
                value = "checkboxValue1",
                label = "went for a run today"),
              MuiCheckbox(name = "checkboxName2",
                value = "checkboxValue2",
                label = "feed the dog"),
              MuiCheckbox(name = "checkboxName3",
                value = "checkboxValue3",
                label = "built a house on the moon",
                disabled = true
              )
            )
          ),
          MuiTab(label = "RadioButton")(
            div(className = Style.content)(
              MuiRadioButtonGroup(name = "shipspeed", defaultSelected = "not_light")(
                MuiRadioButton(value = "light", label = "prepare for light speed"),
                MuiRadioButton(value = "no_light", label = "light speed too slow"),
                MuiRadioButton(value = "ludicrous", label = "go to ludicrous speed", disabled = true)
              )
            )
          ),
          MuiTab(label = "Toggle")(
            div(className = Style.content)(
              MuiToggle(name = "toggleName1", value = "togglevalue1", label = "active thrusters"),
              MuiToggle(name = "toggleName2", value = "togglevalue2", label = "auto-pilot", defaultToggled = true),
              MuiToggle(name = "toggleName3", value = "togglevalue3", label = "initiate self-destruct sequence", disabled = true)
            )
          )
        )
      )
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)


}
