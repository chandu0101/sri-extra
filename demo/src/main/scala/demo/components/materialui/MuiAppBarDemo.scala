package demo
package components
package materialui

import demo.macros.GhPagesMacros

object MuiAppBarDemo {

  val code = GhPagesMacros.exampleSource
  // EXAMPLE:START

  val component = () => {
    CodeExample(code, "MuiAppBar")(
      MuiAppBar(
        title = "Title",
        showMenuIconButton = true
      )()
    )
  }

  // EXAMPLE:END

  def apply() = component()
}
