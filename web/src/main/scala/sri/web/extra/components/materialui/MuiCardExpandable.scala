package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.React

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiCardExpandable(
                              key: js.UndefOr[String] = js.undefined,
                              ref: js.UndefOr[String] = js.undefined,
                              expanded: js.UndefOr[Boolean] = js.undefined,
                              /* Override the inline-styles of the root element.*/
                              style: js.UndefOr[js.Any] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiCardExpandable](this)
    React.createElement(Mui.CardExpandable, props)
  }
}
        
