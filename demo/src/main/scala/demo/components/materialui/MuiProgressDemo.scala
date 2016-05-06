package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.extra.web.components.materialui.DeterminateIndeterminate
import sri.web.all._

object MuiProgressDemo {

  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START
  val component = () => {
    CodeExample(code, "Progress Bars")(
      MuiCircularProgress(mode = DeterminateIndeterminate.determinate, value = 50),
      MuiCircularProgress(mode = DeterminateIndeterminate.indeterminate),
      MuiCircularProgress(mode = DeterminateIndeterminate.indeterminate, size = 2),
      MuiLinearProgress(mode = DeterminateIndeterminate.indeterminate)
    )
  }
  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)

}
