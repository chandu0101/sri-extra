package demo
package components


import sri.core._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js.{UndefOr => U}
import scalacss.Defaults._


object InfoTemplate {

  object Style extends StyleSheet.Inline {

    import dsl._

    val content = style(textAlign.center,
      fontSize(30.px),
      paddingTop(40.px))
  }


  val component = (props: Props, children: ReactElement) => {
    div(className = "info-template")(
      div(className = "component-info")(children),
      props.scalacss ?= div()(
        h4()("Style :"),
        a(href = "#scalacss")("scalacss")
      ),
      props.browsersTested.nonEmpty ?= div()(
        h4()("Tested Browsers List :"),
        ul()(props.browsersTested.map(s => li()(s)))
      ),
      div()(
        ComponentCredits(filePath = s"core/src/main/scala/chandu0101/scalajs/react/components/${props.componentFilePath}")
      )
    )
  }

  case class Props(browsersTested: List[String], componentFilePath: String, scalacss: Boolean)

  def apply(componentFilePath: String, scalacss: Boolean = false, browsersTested: List[String] = List())(children: ReactNode*) = createStatelessFunctionElementWithChildren(component, Props(browsersTested, componentFilePath, scalacss))(children: _*)

}
