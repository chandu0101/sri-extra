package demo
package components
package materialui

import org.scalajs.dom

object MuiSnackbarDemo {
//  val code = GhPagesMacros.exampleSource
//
//  // EXAMPLE:START
//
//  class Backend($: BackendScope[_, Boolean]) {
//    val close = $.setState(false)
//    val open  = $.setState(true)
//
//    val undoAdd: ReactEvent => Callback =
//      e => close >> Callback(dom.window.alert("We removed Event from your calendar"))
//
//    val closeRequested: String => Callback =
//      reason => close >> Callback.info(s"onRequestClose: $reason")
//
//    val toggleSnack: ReactEventH => Callback =
//      e => $.modState(!_)
//
//    def render(isOpen: Boolean) = {
//      CodeExample(code, "MuiSnackBar")(
//        MuiSnackbar(
//          autoHideDuration = 5000,
//          message          = "Event added to your calendar",
//          action           = "undo",
//          onActionTouchTap = undoAdd,
//          onRequestClose   = closeRequested,
//          open             = isOpen
//        )(),
//      !isOpen ?
//        MuiRaisedButton(
//          label      = "Add event to calendar",
//          onTouchTap = toggleSnack
//        )()
//      )
//    }
//  }
//
//  implicit class BooleanNodeX[T](b: Boolean){
//    def ?(n: => ReactNode): ReactNode =
//      if (b) n else null
//  }
//
//  val component = ReactComponentB[Unit]("MuiSnackBar")
//    .initialState(false)
//    .renderBackend[Backend]
//    .buildU
//
//  // EXAMPLE:END
//
//  def apply() = component()
}
