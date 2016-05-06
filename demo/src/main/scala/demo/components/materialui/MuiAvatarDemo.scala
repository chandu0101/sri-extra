package demo.components
package materialui

import demo.macros.GhPagesMacros
import sri.web.all._

import scala.scalajs.js.{UndefOr => U}

object MuiAvatarDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  import sri.extra.web.components.materialui.Mui.Styles.Colors
  import sri.extra.web.components.materialui.Mui.SvgIcons

  val component = () => {
    CodeExample(code, "MuiAvatar")(
      MuiAvatar(backgroundColor = Colors.grey700, color = Colors.deepPurple200, icon = SvgIcons.ActionGrade()())(),
      MuiAvatar(size = 120, backgroundColor = Colors.lime600)("Ø"),
      MuiAvatar()("one"),
      MuiAvatar()("two"),
      MuiAvatar(backgroundColor = Colors.red400)(SvgIcons.ActionFace()())
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)
}
