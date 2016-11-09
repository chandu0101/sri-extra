package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.core.{ReactNode, _}
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}

object MuiDialogDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  case class State(isOpen: Boolean = false)

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {
    initialState(State())

    def render() = {
      val actions: ReactNode = js.Array(
        MuiFlatButton(key = "1", label = "Cancel", secondary = true, onTouchTap = handleDialogCancel _)(),
        MuiFlatButton(key = "2", label = "Submit", secondary = true, onTouchTap = handleDialogSubmit _)()
      )
      div()(
        CodeExample(code, "MuiDialog")(
          div()(
            MuiDialog(
              title = "Dialog With Actions",
              actions = actions,
              open = state.isOpen
            )(
                "Dialog example with floating buttons"
              ),
            MuiRaisedButton(label = "Dialog", onTouchTap = openDialog _)()
          )
        )
      )
    }

    def handleDialogCancel(e: ReactEventH) = {
      setState(state.copy(isOpen = false))
      println(s"dialog closed")
    }

    def handleDialogSubmit(e: ReactEventH) = {
      setState(state.copy(isOpen = false))
      println(s"dialog submitted")
    }

    def openDialog(e: ReactEventH) = {
      println(s"dialog clicked")
      setState(state.copy(isOpen = true))
      println(s"dialog opened!")
    }
  }


  // EXAMPLE:END

  def apply() = makeElement[Component]

}
