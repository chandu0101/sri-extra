package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js.{UndefOr => U}

object MuiTextFieldDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val component = () => {

    CodeExample(code, "MuiTextField")(
      div()(
        MuiTextField(hintText = "Hint Text")(),
        MuiTextField(hintText = "Hint Text", floatingLabelText = "Floating Label Text")(),
        MuiTextField(hintText = "Multi Line Text", multiLine = true)(),
        MuiTextField(hintText = "Multi Line Text", multiLine = true, floatingLabelText = "Multi Line Floating Label Text")(),
        MuiTextField(hintText = "Disabled Hint text", disabled = true)()
      )
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)
}
