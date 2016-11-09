package demo
package components
package materialui

import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js.{UndefOr => U}
import scalacss.Defaults._

object MuiInfo {

  object Style extends StyleSheet.Inline {

    import dsl._

    val content = style(textAlign.center,
      fontSize(30.px),
      paddingTop(40.px))
  }

  val component = () => {
    div()(
      h3()("Material-ui "),
      p()("Sri wrapper for ",
        RedLink("material-ui", "http://material-ui.com/#/")
      ),
      div()(
        h4()("Supported Version :"),
        span()("0.16.1")
      ),
      div()(
        h4()("How To Use :"),
        p()("Follow the installation guide from :", RedLink("here", "https://github.com/callemall/material-ui#installation"),
          br(),
          br(),
          "Sri-web-materialui-Template :", RedLink("get here", "https://github.com/chandu0101/sri-web-materialui-template")
        )
      )
    )
  }

  def apply() = createStatelessFunctionElementNoProps(component)
}
