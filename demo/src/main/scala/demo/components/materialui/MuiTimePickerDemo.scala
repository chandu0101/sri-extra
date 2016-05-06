package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.extra.web.components.materialui.Ampm_24hr
import sri.web.all._

object MuiTimePickerDemo {

  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val component = () => {
    CodeExample(code, "MuiTimePicker")(
      MuiTimePicker(format = Ampm_24hr.ampm, hintText = "12 hr format")(),
      MuiTimePicker(format = Ampm_24hr._24hr, hintText = "24 hr format")()
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)
}
