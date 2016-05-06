package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js.{UndefOr => U, undefined}
import scalacss.Defaults._

object MuiTabsDemo {

  object Style extends StyleSheet.Inline {

    import dsl._

    val tabContent = style(textAlign.center,
      padding(40.px))
  }

  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val component = () => {
    CodeExample(code, "MuiTabs")(
      MuiTabs()(
        MuiTab(label = "Tab1")(
          h3(className = Style.tabContent)("Tab1 Content")
        ),
        MuiTab(label = "Tab2")(
          h3(className = Style.tabContent)("Tab2 Content")
        )
      )
    )
  }
  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)

}
