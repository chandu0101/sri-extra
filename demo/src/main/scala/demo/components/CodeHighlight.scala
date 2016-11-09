package demo
package components

import org.scalajs.dom
import org.scalajs.dom.ext.PimpedNodeList
import sri.core._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scala.scalajs.js.annotation.{ExposedJSMember, JSName, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U, undefined}

object CodeHighlight {


  @ScalaJSDefined
  class Component extends ReactComponent[String, Unit] {
    def render() = {
      code(className = "scala")(props)
    }

    override def componentDidMount(): Unit = {
      applySyntaxHighlight
    }

    @JSName("sComponentDidUpdate")
    override def componentDidUpdate(prevProps: => String, prevState: => Unit): Unit = {
      applySyntaxHighlight
    }

    def applySyntaxHighlight = {
      import scala.scalajs.js.Dynamic.{global => g}
      val nodeList = dom.document.querySelectorAll("code").toArray
      nodeList.foreach(n => g.hljs.highlightBlock(n))
    }
  }


  def apply(code: String, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElement[Component](code, key = key, ref = ref)

}
