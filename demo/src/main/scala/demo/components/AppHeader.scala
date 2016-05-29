package demo
package components

import sri.core.{ReactElement, ReactNode}
import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scalacss.Defaults._

object AppHeader {


  val Component = () => {
    header(className = Style.headerStyle)(
      nav(className = Style.menuNav)(
        a(className = Style.logo, href = "#")("S R I x"),
        div()(
          a(
            target = "_blank",
            className = Style.menuItem,
            href = "https://github.com/chandu0101/sri-extra")("Github")
        )
      )
    )
  }

  object Style extends StyleSheet.Inline {

    import dsl._

    val headerStyle = style(
      background := "#2255B1",
      fontSize :=! "1.5em",
      padding :=! "0",
      margin :=! "0",
      position :=! "fixed",
      width :=! "100%",
      zIndex :=! "5"
    )

    val menuNav = style(
      alignItems.center,
      display.flex,
      justifyContent.spaceBetween,
      height :=! "64px",
      lineHeight :=! "64px",
      margin :=! "0 3rem"
    )

    val logo = style(
      color :=! "rgb(244, 233, 233)",
      textDecoration := "none",
      width :=! "150px"
    )

    val menuItem = style(
      padding :=! "20px",
      color :=! "rgb(244, 233, 233)",
      textDecoration := "none")

    val menuItemHover = style(background := "#f1453e")

  }


  def apply() = createStatelessFunctionElementNoProps(Component)

}
