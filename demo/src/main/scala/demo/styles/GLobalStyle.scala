package demo.styles

import scalacss.Defaults._
import sri.scalacss.Defaults._

object GlobalStyle extends StyleSheet.Inline {

  import dsl._

  val footer = style(textAlign.center)

  val loading = style(paddingTop(140.px),
    paddingLeft(200.px),
    height(300.px),
    fontWeight._500,
    fontSize(1.5.rem)
  )
}
