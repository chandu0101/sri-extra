package demo.components.materialui

import demo.components.CodeExample
import demo.macros.GhPagesMacros
import sri.web.all._

import scala.scalajs.js.{UndefOr => U}
import scala.scalajs.js.Dynamic.{literal => json}

object MuiBadgeDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  import sri.extra.web.components.materialui.Mui.SvgIcons

  val component = () => {
    CodeExample(code, "MuiBadge")(
      MuiBadge(badgeContent = 4, primary = true)(SvgIcons.NotificationAdb()()),
      MuiBadge(badgeContent = 20, secondary = true, badgeStyle = json(top = 12, right = 12))(
        MuiIconButton(tooltip = "Notifications")(
          SvgIcons.NotificationAdb()())
      )
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)
}
