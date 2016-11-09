package demo
package components


import org.scalajs.dom.ext.Ajax
import sri.core._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{Date, Function1, JSON, UndefOr}


object ComponentCredits {

  case class State(users: List[Github] = List())


  @ScalaJSDefined
  class Component extends ReactComponent[Props, State] {
    initialState(State())

    def render() = {
      if (state.users.isEmpty) div()("Loading Credits ...")
      else
        div()(
          h4()("Author: "),
          GithubUser(state.users.head),
          h4()("Contributors: "),
          div()(state.users.tail.map(u => GithubUser(user = u, key = u.login)))
        )
    }

    override def componentDidMount(): Unit = {
      val url = s"https://api.github.com/repos/chandu0101/sri-extra/commits?path=${props.filePath}"
      Ajax.get(url).onSuccess {
        case xhr =>
          if (xhr.status == 200) {
            val rawUsers = JSON.parse(xhr.responseText).asInstanceOf[js.Array[js.Dynamic]]
            val users = rawUsers.map(
              u => Github(
                login = u.author.login.toString,
                html_url = u.author.html_url.toString,
                avatar_url = u.author.avatar_url.toString,
                time = new Date(u.commit.author.date.toString).getTime()
              )
            ).toList.groupBy(_.login).map {
              case (id, objlist) => objlist.minBy(_.time)
            }.toSet.toList
            setState(state.copy(users = users.sortBy(_.time)))
          }
      }
    }

  }

  case class Props(filePath: String)

  def apply(filePath: String, key: UndefOr[String] = js.undefined, ref: Function1[Component, Unit] = null) = makeElement[Component](Props(filePath), key = key, ref = ref)


}
