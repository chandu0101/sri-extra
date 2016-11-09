package demo.components.materialui

import demo.components.CodeExample
import demo.macros.GhPagesMacros
import sri.core.{ReactComponent, ReactElement}
import sri.extra.web.components.materialui.ZDepth
import sri.web.all._

import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}

object MuiBottomNavigationDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  import sri.extra.web.components.materialui.Mui.SvgIcons


  case class State(selectedIndex: Int = 0)

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    override def render(): ReactElement = CodeExample(code, "MuiBottomNavigation")(
      MuiPaper(zDepth = ZDepth._1)(
        MuiBottomNavigation(selectedIndex = state.selectedIndex)(
          MuiBottomNavigationItem(label = "Recents",icon = SvgIcons.ActionReceipt()(),onTouchTap = (e:ReactEventH) => setState(state.copy(selectedIndex = 0))),
          MuiBottomNavigationItem(label = "Favorites",icon = SvgIcons.ActionFavorite()(),onTouchTap = (e:ReactEventH) => setState(state.copy(selectedIndex = 1))),
          MuiBottomNavigationItem(label = "Nearby",icon = SvgIcons.CommunicationLocationOn()(),onTouchTap = (e:ReactEventH) => setState(state.copy(selectedIndex = 2)))
        )
      )
    )
  }

  // EXAMPLE:END

  def apply() = makeElement[Component]
}
