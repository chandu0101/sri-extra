package demo.components.materialui

import demo.components.CodeExample
import demo.macros.GhPagesMacros
import sri.web.all._

import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr => U}

object MuiCardDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  import sri.extra.web.components.materialui.Mui.SvgIcons

  val component = () => {
    CodeExample(code, "MuiCard")(
      MuiCard()(
       MuiCardHeader(title ="Without Avatar",subtitle = "Subtitle",actAsExpander = true,showExpandableButton = true)(),
       MuiCardText(expandable = true)("Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n      Donec mattis pretium massa. Aliquam erat volutpat. Nulla facilisi.\n      Donec vulputate interdum sollicitudin. Nunc lacinia auctor quam sed pellentesque.\n      Aliquam dui mauris, mattis quis lacus id, pellentesque lobortis odio."),
       MuiCardActions(expandable = true)(
        MuiFlatButton(label = "Action1")(),
        MuiFlatButton(label = "Action2")()
       )
      )
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)
}
