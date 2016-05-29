package sri.extra.web.components.materialui

import sri.core._
import sri.universal.components._
import sri.web.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}
import scala.scalajs.js.Dynamic.{literal => json}


object MuiRootComponent {

  @ScalaJSDefined
  class Component extends ReactComponent[MuiRawTheme, Unit] {
    def render() = children

    def getChildContext() = {
      json(muiTheme = Mui.Styles.getMuiTheme(props))
    }
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  ctor.childContextTypes = muiContextTypes

  def apply(theme: MuiRawTheme = Mui.Styles.LightRawTheme, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null)(children: ReactNode) = createElementWithChildren(ctor, theme, key = key, ref = ref)(children)

}
