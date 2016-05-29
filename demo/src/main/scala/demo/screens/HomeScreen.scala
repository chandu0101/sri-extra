package demo
package screens

import demo.components.ComponentGridItem
import demo.routes.AppRouter
import sri.core._
import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.router.WebStaticPage
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{Function1, UndefOr => U, undefined}
import scalacss.Defaults._

object HomeScreen {

  case class ComponentInfo(name: String, imagePath: String, route: WebStaticPage, tags: Stream[String])

  object Style extends StyleSheet.Inline {

    import dsl._

    val info = style(
      alignItems := "center",
      backgroundColor := "#eeeeee",
      display.flex,
      flexDirection := "column",
      fontSize := "18px",
      fontWeight := "500",
      paddingBottom := "45px",
      paddingTop(85.px))

    val infoContent = style(
      fontWeight._500,
      fontSize(18.px))

    val infoLink = style(
      color := "#ff4081",
      padding := "0 5px",
      textDecoration := "none")

    val searchSection = style(
      display.flex,
      margin(50.px),
      marginBottom(15.px))

    val componentsGrid = style(
      display.flex,
      flexWrap.wrap,
      margin(30.px))

  }

  case class State(filterText: String = "", results: Vector[ComponentInfo] = AppRouter.homePageMenu)


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {
    initialState(State())

    def render() = {
      div()(
        div(className = Style.info, key = "info")(
          h3(className = Style.infoContent)("Reusable ",
            a(href = "https://github.com/chandu0101/sri", className = Style.infoLink, target = "_blank")("Sri"),
            " Components. ")
        ),
        div(className = Style.searchSection)(
          //          ReactSearchBox(onTextChange = onTextChange),
          !state.filterText.isEmpty ?= strong()(s"Results: ${state.results.length}")
        ),
        div(className = Style.componentsGrid)(
          state.results.map(c => ComponentGridItem(c.name, c.route, c.imagePath,key = c.name))
        )
      )
    }

    def onTextChange(text: String) = {
      val results = AppRouter.homePageMenu.filter(c => c.tags.exists(s => s.contains(text)))
      setState(state.copy(results = results, filterText = text))
    }
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])


  def apply(key: U[String] = js.undefined, ref: Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)

}
