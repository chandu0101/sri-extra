package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.extra.web.components.materialui.LeftRight
import sri.web.all._

import scala.scalajs.js.{UndefOr => U, undefined}

object MuiToolbarDemo {

  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val component = () => {
    CodeExample(code, "MuiToolbar")(
      MuiToolbar()(
        MuiToolbarGroup(key = "1", float = LeftRight.left)(
          MuiRaisedButton(label = "Tool Left", secondary = true)()
        ),
        MuiToolbarGroup(key = "2", float = LeftRight.right)(
          MuiToolbarTitle(text = "options"),
          MuiToolbarSeparator(),
          MuiRaisedButton(label = "Create Broadcast", primary = true)()
        )
      )
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)
}
