package demo
package components

import sri.core._
import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}
import scalacss.Defaults._

object CodeExample {

  object Style extends StyleSheet.Inline {

    import dsl._

    val pageBodyContent = style(
      borderRadius := "2px",
      boxShadow := "0 1px 4px rgba(223, 228, 228, 0.79)",
      maxWidth :=! "1024px")

    val contentDemo = style(
      padding :=! "30px")

    val contentCode = style(
      borderTop :=! "solid 1px #e0e0e0"
    )

    val title = style(
      paddingBottom :=! "15px")

  }

  val component = (props: Props, children: ReactElement) => {
    div()(
      props.title.nonEmpty ?= h3(className = Style.title)(props.title),
      div(className = Style.pageBodyContent)(
        div(className = Style.contentDemo, key = "dan")(
          children
        ),
        pre(className = Style.contentCode, key = "code")(
          CodeHighlight(props.code)
        )
      )
    )
  }

  case class Props(code: String, title: String)

  def apply(code: String,
            title: String,
            ref: js.UndefOr[String] = "",
            key: js.Any = {})
           (children: ReactNode*) = createStatelessFunctionElementWithChildren(component,Props(code,title))(children: _*)

}
