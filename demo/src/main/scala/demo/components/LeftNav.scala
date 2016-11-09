package demo
package components

import demo.routes.LeftRoute
import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.router.WebRouterComponent
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}
import scalacss.Defaults._

object LeftNav {

  object Style extends StyleSheet.Inline {

    import dsl._

    val container = style(display.flex,
      flexDirection.column,
      listStyle := "none",
      padding.`0`
    )

    val menuItem = styleF.bool(selected => styleS(
      lineHeight(48.px),
      padding :=! "0 25px",
      cursor.pointer,
      textDecoration := "none",
      mixinIfElse(selected)(color.red,
        fontWeight._500)
        (color.black,
            &.hover(color(c"#555555"),
              backgroundColor(c"#ecf0f1")))
    ))
  }


  @ScalaJSDefined
  class Component extends WebRouterComponent[Props, Unit] {
    def render() = {
      val c = currentRoute.page
      ul(className = Style.container)(
        props.menus.map(item => li(key = item.name,
          onClick = (e: ReactEventH) => navigateTo(item.page),
          className = Style.menuItem(item.page == c))(
            item.name))
      )
    }
  }


  case class Props(menus: List[LeftRoute])

  js.constructorOf[Component].contextTypes = sri.web.router.routerContextTypes

  def apply(menus: List[LeftRoute]) = makeElement[Component](Props(menus))
}
