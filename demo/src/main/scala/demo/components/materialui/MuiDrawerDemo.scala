package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.extra.web.components.materialui.Mui

import scala.scalajs.js.{UndefOr => U, undefined}
import sri.core._
import sri.web.all._
import sri.web.vdom.htmltags._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}

object MuiDrawerDemo {

  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  case class State(
                    selected: String,
                    isOpen: Boolean,
                    isDocked: Boolean,
                    isRight: Boolean
                    )

  case class Choice(id: String, text: String)

  val choices = Seq(
    Choice("1", "First option"),
    Choice("2", "Second option"),
    Choice("3", "Third option"),
    Choice("4", "Fourth option")
  )


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {
    initialState(State(
      selected = "",
      isOpen = false,
      isDocked = false,
      isRight = false
    ))

    def render() = {
      CodeExample(code, "MuiLeftNav")(
        div()(
          MuiDrawer(
            onRequestChange = onRequestChange _,
            openSecondary = state.isRight,
            open = state.isOpen,
            docked = state.isDocked)(
              /* hack in a cheesy centered avatar */
              MuiAvatar(
                size = 112,
                backgroundColor = Mui.Styles.colors.red400,
                style = js.Dynamic.literal(
                  margin = "auto",
                  display = "block",
                  padding = "10px"
                ))(
                  ":D"
                ),
              choices map (c =>
                MuiMenuItem(
                  key = c.text,
                  primaryText = c.text,
                  checked = state.selected == c.id
                  //                  onTouchTap = selectItem(c.id)
                )()
                )
            ),

          MuiToggle(
            toggled = state.isOpen,
            label = "Show Left Nav",
            onToggle = toggleOpen _
          ),
          MuiToggle(
            toggled = state.isDocked,
            label = "Show docked",
            onToggle = toggleDocked _
          ),
          MuiToggle(
            toggled = state.isRight,
            label = "Show on right side",
            onToggle = toggleRight _
          )
        )
      )
    }

    def toggleOpen(e: ReactEventI, value: Boolean) = setState(state.copy(isOpen = !state.isOpen))

    def toggleDocked(e: ReactEventI, value: Boolean) = setState(state.copy(isDocked = !state.isDocked, isOpen = !state.isOpen))

    def toggleRight(e: ReactEventI, value: Boolean) = setState(state.copy(isRight = !state.isRight, isOpen = !state.isOpen))

    def onRequestChange(open: Boolean, reason: String) = {
      println(s"onRequestChange: open: $open, reason: $reason")
      setState(state.copy(isOpen = !state.isOpen))
    }

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])


  // EXAMPLE:END

  def apply() = createElementNoProps(ctor)
}
