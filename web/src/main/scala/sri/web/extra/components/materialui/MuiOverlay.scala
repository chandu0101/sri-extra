package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.React

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiOverlay(
                       key: js.UndefOr[String] = js.undefined,
                       ref: js.UndefOr[String] = js.undefined,
                       autoLockScrolling: js.UndefOr[Boolean] = js.undefined,
                       show: Boolean,
                       /* Override the inline-styles of the root element.*/
                       style: js.UndefOr[js.Any] = js.undefined,
                       transitionEnabled: js.UndefOr[Boolean] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiOverlay](this)
    React.createElement(Mui.Overlay, props)
  }
}
        
