package demo
package components
package materialui

import demo.macros.GhPagesMacros
import org.scalajs.dom
import sri.core._
import sri.extra.web.components.materialui.{Corners, MuiMenuItemProps}
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}

object MuiMenuDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  case class State(isOpen: Boolean, multiple: Set[String]) {
    def touched(us: js.UndefOr[String]) = us.fold(this) {
      case s if multiple contains s =>
        copy(multiple = multiple - s)
      case s =>
        copy(multiple = multiple + s)
    }
  }


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {
    initialState(State(isOpen = false, Set.empty))

    def render() = {
      CodeExample(code, "MuiMenu")(
        if (state.isOpen) renderOpen(state) else renderClosed(state)
      )
    }

    def toggleOpen(e: ReactKeyboardEventH) =
      setState(state.copy(isOpen = !state.isOpen))

    def toggleOpen2(e: ReactTouchEventH) =
      setState(state.copy(isOpen = !state.isOpen))

    def onTouchTap(e: ReactUIEventH, elem: ReactElementM[MuiMenuItemProps, _],index : Int) =
    {
       dom.window.console.log(s"Item ", elem)
      setState(state.touched(elem.props.value))
    }

    def renderOpen(S: State) =
      div()(
        MuiFlatButton(
          label = "Close menu",
          onTouchTap = toggleOpen2 _
        )(),
        MuiMenu(
          desktop = true,
          width = 320,
          value = S.multiple.toJSArray,
          multiple = true,
          openDirection = "bottom-left",
          onItemTouchTap = onTouchTap _,
          onEscKeyDown = toggleOpen _
        )(
            MuiMenuItem(value = "bold", secondaryText = "⌘B", checked = true)("Bold"),
            MuiMenuItem(value = "italic", secondaryText = "⌘I")("Italic"),
            MuiMenuItem(value = "under", secondaryText = "⌘U")("Underline"),
            MuiMenuItem(value = "strike", secondaryText = "Alt+Shift+5")("Strikethrough"),
            MuiMenuItem(value = "super", secondaryText = "⌘.")("Superscript"),
            MuiMenuItem(value = "sub", secondaryText = "⌘,")("Subscript"),
            MuiDivider(),
            MuiMenuItem(value = "align")("Align")
          )
      )

    def renderClosed(S: State) =
      MuiFlatButton(
        label = "open menu",
        onTouchTap = toggleOpen2 _
      )()

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  // EXAMPLE:END

  def apply() = createElementNoProps(ctor)
}
