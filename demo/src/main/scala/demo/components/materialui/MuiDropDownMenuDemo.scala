package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.core._
import sri.web.all._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}

object MuiDropDownMenuDemo {

  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val items = Seq(
    ("1", "Never"),
    ("2", "Every Night"),
    ("3", "Weeknights"),
    ("4", "Weekends"),
    ("5", "Weekly")
  )

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, js.Any] {
    initialState(items.head._1)

    def render() = {
      CodeExample(code, "MuiDropDownMenu")(
        MuiDropDownMenu(
          onChange = choose _, value = state)(
            items map {
              case (value, text) => MuiMenuItem(value = value.asInstanceOf[js.Any], primaryText = text)()
            }
          )
      )
    }

    def choose(e: ReactEventI, i: Int, value: js.Any) = {
      setState(value)
      println(s"idx: $i, value: $value")
    }

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  // EXAMPLE:END

  def apply() = createElementNoProps(ctor)
}
