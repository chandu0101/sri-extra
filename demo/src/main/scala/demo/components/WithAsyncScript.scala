package demo.components

import demo.styles.GlobalStyle
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
import scalacss.Defaults._
import sri.scalacss.Defaults._

object WithAsyncScript {


  case class State(loaded: Set[String])

  @ScalaJSDefined
  class Component extends ReactComponent[Props, State] {

    initialState(State(Set.empty[String]))

    def render() = {
      if (props.scripts == state.loaded) props.children()
      else div(className = GlobalStyle.loading)("Loading scripts ..")
    }


    override def componentDidMount(): Unit = {

      isMounted = true
      load(state.loaded)
    }


    override def componentWillUnmount(): Unit = {
      isMounted = false
    }

    var isMounted: Boolean = false

    def load(alreadyLoaded: Set[String]) = {
      val scripts = dom.document.getElementsByTagName("script").toList.map(_.asInstanceOf[HTMLScriptElement].src)
      val loaded = props.scripts.map { s =>
        val body = dom.document.body
        val script = dom.document.createElement("script").asInstanceOf[HTMLScriptElement]

        script.setAttribute("type", "text/javascript")
        script.setAttribute("src", s)

        if (scripts.exists(_.contains(s)))
          Some(s)
        else {
          script.onload = (e: Event) => {
            dom.window.console.log(s"Loaded $s")
            if (isMounted) setState(state.copy(alreadyLoaded + s))
          }
          body.appendChild(script)
          None
        }
      }

      setState(state.copy(loaded.flatten))
    }

  }

  case class Props(scripts: Set[String], children: () => ReactElement)

  def apply(scripts: String*)(children: () => ReactElement) = makeElement[Component](Props(scripts.toSet, children))
}