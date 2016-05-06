package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.extra.web.components.materialui.PortraitLandscape
import sri.web.all._

import scala.scalajs.js.{UndefOr => U}

object MuiDatePickerDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val component = () => {
    CodeExample(code, "MuiDatePicker")(
      MuiDatePicker(hintText = "Portrait Dialog"),
      MuiDatePicker(
        hintText = "Landscape Dialog",
        mode = PortraitLandscape.landscape
      )
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)
}
