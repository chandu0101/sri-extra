package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.scalacss.Defaults._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js.{UndefOr => U}
import scalacss.Defaults._
import scalacss.mutable.StyleSheet.Inline

object MuiButtonsDemo {

  val code = GhPagesMacros.exampleSource

  object Style extends Inline {

    import dsl._

    val container = style(maxWidth(1024 px))

    val content = style(display.flex,
      padding(30.px),
      flexDirection.column,
      alignItems.center)
  }

  // EXAMPLE:START

  import sri.extra.web.components.materialui.Mui.SvgIcons.ActionGrade

  val component = () => {
    CodeExample(code, "MuiButtons")(
      div(className = Style.container)(
        h3()("Buttons"),
        MuiTabs()(
          MuiTab(label = "Flat Buttons")(
            div(className = Style.content)(
              MuiFlatButton(label = "Default")(),
              MuiFlatButton(label = "Primary", primary = true)(),
              MuiFlatButton(label = "Secondary", secondary = true)(),
              MuiFlatButton(label = "Disabled", disabled = true)()
            )
          ),
          MuiTab(label = "Raised Buttons")(
            div(className = Style.content)(
              MuiRaisedButton(label = "Default")(),
              MuiRaisedButton(label = "Primary", primary = true)(),
              MuiRaisedButton(label = "Secondary", secondary = true)(),
              MuiRaisedButton(label = "Disabled", disabled = true)()
            )
          ),
          MuiTab(label = "Floating Action Buttons")(
            div(className = Style.content)(
              MuiFloatingActionButton()(ActionGrade()()),
              MuiFloatingActionButton(mini = true)(ActionGrade()()),
              MuiFloatingActionButton(secondary = true)(ActionGrade()()),
              MuiFloatingActionButton(secondary = true, mini = true)(ActionGrade()())
            )
          ),
          MuiTab(label = "Icon Buttons")(
            div(className = Style.content)(
              MuiIconButton()(ActionGrade()())
            )
          )
        )
      )
    )
  }
  // EXAMPLE:END

  def apply() = component()
}
