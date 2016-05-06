package demo
package components

import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js.{UndefOr => U, undefined}

object RedLink {


  val component = (props: Props) => {
    a(href = props.url,
      target = "_blank"
    )(props.name)
  }

  case class Props(name: String, url: String)

  def apply(name: String, url: String) = createStatelessFunctionElement(component, Props(name, url))
}
