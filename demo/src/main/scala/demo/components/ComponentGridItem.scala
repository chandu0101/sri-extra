package demo
package components

import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.router.{WebRouterComponent, WebStaticPage}
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined}
import scalacss.Defaults._

object ComponentGridItem {

  object Style extends StyleSheet.Inline {

    import dsl._

    val item = style(margin := "30px",
      maxWidth :=! "250px",
      cursor.pointer,
      boxShadow := "0 1px 3px rgba(85, 89, 88, 0.24)",
      &.hover(
        boxShadow := "0 10px 18px rgba(16, 208, 194, 0.24)"
      )
    )

    val itemTitle = style(backgroundColor :=! "#eeeeee",
      color :=! "rgba(0, 0, 0, 0.87)",
      fontSize :=! "18px",
      fontWeight :=! "500",
      letterSpacing :=! "0",
      lineHeight :=! "54px",
      margin :=! "0",
      padding :=! "0",
      textAlign.center)

    val itemImage = style(maxHeight :=! "250px",
      maxWidth :=! "250px",
      minHeight :=! "100px",
      minWidth :=! "120px")

    val itemHover = style()

  }

  @ScalaJSDefined
  class Component extends WebRouterComponent[Props, Unit] {
    def render() = {
      div(className = Style.item, onClick = (e: ReactEventH) => navigateTo(props.route))(
        h3(
          className = Style.itemTitle,
          key = props.heading
        )(props.heading),
        img(
          src = props.img,
          className = Style.itemImage,
          key = "alink"
        )
      )
    }
  }


  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  ctor.contextTypes = sri.web.router.routerContextTypes

  case class Props(heading: String, route: WebStaticPage, img: String)

  def apply(heading: String, route: WebStaticPage, img: String, key: U[String] = js.undefined) = createElement(ctor, Props(heading, route, img), key = key)
}
