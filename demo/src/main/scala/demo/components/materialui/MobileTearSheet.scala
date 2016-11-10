package demo
package components
package materialui

import sri.core.{ReactElement, _}
import sri.scalacss.Defaults._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scalacss.Defaults._
import scalacss.internal.mutable.StyleSheet.Inline

object MobileTearSheet {

  object Style extends Inline {

    import dsl._

    val root = style(
      marginBottom(24 px),
      marginRight(24 px),
      width(360 px)
    )

    val container = style(
      border :=! "solid 1px #d9d9d9",
      height :=! "500px",
      overflow.hidden
    )

    val bottomTear = style(display.block,
      position.relative,
      marginTop :=! "-10px",
      width(360 px)
    )
  }

  val component = (children: ReactElement) => {
    div(className = Style.root)(
      div(className = Style.container)(
        children
      ),
      img(className = Style.bottomTear, src = js.Dynamic.global.bottomTearImage.toString)
    )
  }

  def apply(children: ReactNode*) = createStatelessFunctionElementNoPropsWithChildren(component)(children: _*)
}
