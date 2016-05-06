package demo.components

import org.scalajs.dom
import org.scalajs.dom.Event
import org.scalajs.dom.ext.PimpedNodeList
import org.scalajs.dom.raw.HTMLScriptElement
import sri.core._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}

object WithAsyncScript {


  @ScalaJSDefined
  class Component extends ReactComponent[Props, Set[String]] {

    initialState(Set.empty[String])


    override def componentWillMount(): Unit = {
      load(state)
    }

    def render() = {
      if (props.scripts == state) children
      else div()()
    }

    def load(alreadyLoaded: Set[String]) = {
      val scripts = dom.document.getElementsByTagName("src")

      val loaded = props.scripts.map { s =>
        val body = dom.document.body
        val script = dom.document.createElement("script").asInstanceOf[HTMLScriptElement]

        script.setAttribute("type", "text/javascript")
        script.setAttribute("src", s)

        if (scripts.toList.contains(script))
          Some(s)
        else {
          script.onload = (e: Event) => {
            dom.window.console.log(s"Loaded $s")
            setState(alreadyLoaded + s)
          }
          body.appendChild(script)
          None
        }
      }
      setState(loaded.flatten)

    }

  }

  case class Props(scripts: Set[String])


  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])


  def apply(scripts: String*)(children: ReactElement) = createElementWithChildren(ctor, Props(scripts.toSet))(children)
}