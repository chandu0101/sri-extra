package demo
package components


import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}
import scalacss.Defaults._

case class Github(login: String = "", html_url: String = "", avatar_url: String = "", time: Double = 0) {
  override def equals(obj: Any): Boolean = obj match {
    case that: Github => that.login.equalsIgnoreCase(this.login)
    case _ => false
  }
}

object GithubUser {

  object Styles extends StyleSheet.Inline {

    import dsl._

    val userGroup = style(display := "inline-block", textAlign := "center", textDecoration := "none", color := "black")

    val userIcon = style(margin := "10px", display := "block", width := "100px", height := "100px", borderRadius := "50%")

    val userName = style(fontSize := "18px", fontWeight._500)
  }


  val component = (props: Props) => {
    a(className = Styles.userGroup, href = props.user.html_url)(
      img(className = Styles.userIcon, src = props.user.avatar_url),
      span(className = Styles.userName)(props.user.login)
    )
  }

  case class Props(user: Github)

  def apply(user: Github, ref: js.UndefOr[String] = "", key: js.UndefOr[String] = js.undefined) = createStatelessFunctionElement(component, Props(user), key = key)
}
