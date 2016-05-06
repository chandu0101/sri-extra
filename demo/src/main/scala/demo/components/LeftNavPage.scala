package demo
package components

import demo.routes.LeftRoute
import sri.core._
import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scalacss.Defaults._

object LeftNavPage {

  object Style extends StyleSheet.Inline {

    import dsl._

    val container = style(
      display.flex,
      minHeight(600.px),
      paddingTop(64 px))

    val nav = style(width(190.px))

    val content = style(padding(30.px),
      borderLeft :=! "1px solid rgb(223, 220, 220)",
      flex := "1")
  }


  val component = (props: Props) => {
    div(className = Style.container)(
      div(className = Style.nav)(LeftNav(props.menu)),
      div(className = Style.content)(props.selectedRender())
    )
  }

  case class Props(menu: List[LeftRoute], selectedRender: () => ReactElement)

  def apply(menu: List[LeftRoute], selectedRender: () => ReactElement) = createStatelessFunctionElement(component, Props(menu, selectedRender))
}
