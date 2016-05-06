package demo
package components
package materialui

import demo.macros.GhPagesMacros

object MuiAppBarDemo {

  val code = GhPagesMacros.exampleSource
  // EXAMPLE:START

  val component = () => {
    CodeExample(code, "MuiAppBar")(
      MuiAppBar(
        title = "Title",
//        onLeftIconButtonTouchTap  = DummyEvents.f1("onLeftIconButtonTouchTap"),
//        onRightIconButtonTouchTap = DummyEvents.f1("onRightIconButtonTouchTap"),
//        onTitleTouchTap           = DummyEvents.f1("onTitleTouchTap"),
        showMenuIconButton = true
      )()
    )
  }

  // EXAMPLE:END

  def apply() = component()
}
