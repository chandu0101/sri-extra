package demo
package screens

import demo.components.{LeftNavPage, WithAsyncScript}
import demo.routes.MuiRouteModule
import sri.core.ReactElement
import sri.extra.web.components.materialui.MuiRootComponent
import sri.web.all._
import sri.core._
import sri.universal.components._
import sri.web.all._
import sri.web.vdom.htmltags._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}

object MuiScreen {


  @ScalaJSDefined
  class Component extends ReactComponent[Props, Unit] {
    def render() = WithAsyncScript("assets/material_ui-bundle.js")(
      () => MuiRootComponent()(LeftNavPage(MuiRouteModule.menu, props.selectedRender))
    )
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])


  case class Props(selectedRender: () => ReactElement)

  def apply(selectedRender: () => ReactElement) = createElement(ctor, Props(selectedRender))

}
