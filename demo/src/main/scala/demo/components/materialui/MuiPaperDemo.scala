package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.extra.web.components.materialui.ZDepth
import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js.{UndefOr => U}
import scalacss.Defaults._

object MuiPaperDemo {

  val code = GhPagesMacros.exampleSource

  object Style extends StyleSheet.Inline {

    import dsl._

    val paperContainer = style(display.flex,
      flexWrap.wrap,
      paddingTop(20.px),
      unsafeChild("div")(
        margin(15 px),
        unsafeChild("p")(
          padding(15 px)
        )
      )
    )
  }

  // EXAMPLE:START

  val component = () => {
    CodeExample(code, "MuiPaper")(
      div(className = Style.paperContainer)(
        MuiPaper(zDepth = ZDepth._1)(p()("zDepth = 1")),
        MuiPaper(zDepth = ZDepth._2)(p()("zDepth = 2")),
        MuiPaper(zDepth = ZDepth._3)(p()("zDepth = 3")),
        MuiPaper(zDepth = ZDepth._4)(p()("zDepth = 4")),
        MuiPaper(zDepth = ZDepth._5)(p()("zDepth = 5")),
        MuiPaper(zDepth = ZDepth._1, rounded = false)(p()("rounded = false")),
        MuiPaper(zDepth = ZDepth._2, rounded = false)(p()("rounded = false")),
        MuiPaper(zDepth = ZDepth._3, rounded = false)(p()("rounded = false")),
        MuiPaper(zDepth = ZDepth._4, rounded = false)(p()("rounded = false")),
        MuiPaper(zDepth = ZDepth._5, rounded = false)(p()("rounded = false")),
        MuiPaper(zDepth = ZDepth._1, circle = true)(p()("circle = true")),
        MuiPaper(zDepth = ZDepth._2, circle = true)(p()("circle = true")),
        MuiPaper(zDepth = ZDepth._3, circle = true)(p()("circle = true")),
        MuiPaper(zDepth = ZDepth._4, circle = true)(p()("circle = true")),
        MuiPaper(zDepth = ZDepth._5, circle = true)(p()("circle = true"))
      )
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)

}
