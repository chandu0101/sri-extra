package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiCardText(
                        key: js.UndefOr[String] = js.undefined,
                        ref: js.UndefOr[String] = js.undefined,
                        /* Whether a click on this card component expands the card. Can be set on any child of the Card component.*/
                        actAsExpander: js.UndefOr[Boolean] = js.undefined,
                        color: js.UndefOr[MuiColor] = js.undefined,
                        /* Whether this card component is expandable. Can be set on any child of the Card component.*/
                        expandable: js.UndefOr[Boolean] = js.undefined,
                        /* Override the inline-styles of the root element.*/
                        style: js.UndefOr[js.Any] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiCardText](this)
    if (children.isEmpty)
      React.createElement(Mui.CardText, props)
    else if (children.size == 1)
      React.createElement(Mui.CardText, props, children.head)
    else
      React.createElement(Mui.CardText, props, children: _*)
  }
}
