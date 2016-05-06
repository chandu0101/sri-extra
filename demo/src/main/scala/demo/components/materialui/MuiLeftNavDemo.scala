package demo
package components
package materialui

import scala.scalajs.js.{UndefOr => U, undefined}

object MuiLeftNavDemo {
//
//  val code = GhPagesMacros.exampleSource
//
//  // EXAMPLE:START
//
//  case class State(
//                    selected: js.UndefOr[String],
//                    isOpen: Boolean,
//                    isDocked: Boolean,
//                    isRight: Boolean
//                    )
//
//  case class Choice(id: String, text: String)
//
//  val choices = Seq(
//    Choice("1", "First option"),
//    Choice("2", "Second option"),
//    Choice("3", "Third option"),
//    Choice("4", "Fourth option")
//  )
//
//
//  @ScalaJSDefined
//  class Component extends ReactComponent[Unit, State] {
//    initialState(State(
//      selected = js.undefined,
//      isOpen = false,
//      isDocked = false,
//      isRight = false
//    ))
//
//    def render() = {
//      CodeExample(code, "MuiLeftNav")(
//        div()(
//          MuiLeftNav(
//            onRequestChange = onRequestChange,
//            openRight = state.isRight,
//            open = state.isOpen,
//            docked = state.isDocked)(
//              /* hack in a cheesy centered avatar */
//              MuiAvatar(
//                size = 112,
//                backgroundColor = Mui.Styles.Colors.red400,
//                style = js.Dynamic.literal(
//                  margin = "auto",
//                  display = "block",
//                  padding = "10px"
//                ))(
//                  ":D"
//                ),
//              choices map (c =>
//                MuiMenuItem(
//                  primaryText = c.text,
//                  checked = state.selected == c.id,
//                  onTouchTap = selectItem(c.id)
//                )()
//                )
//            ),
//
//          MuiToggle(
//            toggled = state.isOpen,
//            label = "Show Left Nav",
//            onToggle = toggleOpen
//          ),
//          MuiToggle(
//            toggled = state.isDocked,
//            label = "Show docked",
//            onToggle = toggleDocked
//          ),
//          MuiToggle(
//            toggled = state.isRight,
//            label = "Show on right side",
//            onToggle = toggleRight
//          )
//        )
//      )
//    }
//
//    val toggleOpenCb: Callback =
//      $.modState(s => state.copy(isOpen = !state.isOpen))
//
//    val toggleOpen: (ReactEventI, Boolean) => Callback =
//      (e, b) => toggleOpenCb
//
//    val toggleDocked: (ReactEventI, Boolean) => Callback =
//      (e, b) => $.modState(s => state.copy(isDocked = !state.isDocked))
//
//    val toggleRight: (ReactEventI, Boolean) => Callback =
//      (e, b) => $.modState(s => state.copy(isRight = !state.isRight))
//
//    def onRequestChange(open: Boolean, reason: String) = {
//      println(s"onRequestChange: open: $open, reason: $reason")
//      setState(state.copy(isOpen = !state.isOpen))
//    }
//
//    val selectItem: String => ReactTouchEventH => Callback =
//      id => e => $.modState(s => state.copy(selected = id))
//
//  }
//
//  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])
//
//
//  // EXAMPLE:END
//
//  def apply() = createElementNoProps(ctor)
}
