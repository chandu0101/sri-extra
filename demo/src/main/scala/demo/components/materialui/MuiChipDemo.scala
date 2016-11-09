package demo.components.materialui

import demo.components.CodeExample
import demo.macros.GhPagesMacros
import sri.web.all._
import sri.web.styles.WebStyleSheet

import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr => U}

object MuiChipDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val component = () => {
    CodeExample(code, "MuiChip")(
      MuiChip(style = styles.chip)("Text Chip")
    )
  }

  object styles extends WebStyleSheet {
    val chip = style(margin := 4)
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)
}
