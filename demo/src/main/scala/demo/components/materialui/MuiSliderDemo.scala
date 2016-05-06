package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.web.all._

object MuiSliderDemo {

  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START
  val component = () => {
    CodeExample(code, "MuiSlider")(
      MuiSlider(name = "slider1"),
      MuiSlider(name = "slider2", defaultValue = 0.5),
      MuiSlider(name = "slider1", value = 0.3, disabled = true)
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)

}
