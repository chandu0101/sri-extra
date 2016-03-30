package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiCardActions(
                           key: js.UndefOr[String] = js.undefined,
                           ref: js.UndefOr[String] = js.undefined,
                           /* Whether a click on this card component expands the card. Can be set on any child of the Card component.*/
                           actAsExpander: js.UndefOr[Boolean] = js.undefined,
                           /* Whether this card component is expandable. Can be set on any child of the Card component.*/
                           expandable: js.UndefOr[Boolean] = js.undefined,
                           /* Whether this card component include a button to expand the card. CardTitle, CardHeader and CardActions implement showExpandableButton. Any child component of Card can implements showExpandableButton or forwards the property to a child component supporting it.*/
                           showExpandableButton: js.UndefOr[Boolean] = js.undefined,
                           /* Override the inline-styles of the root element.*/
                           style: js.UndefOr[js.Any] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiCardActions](this)
    if (children.isEmpty)
      React.createElement(Mui.CardActions, props)
    else if (children.size == 1)
      React.createElement(Mui.CardActions, props, children.head)
    else
      React.createElement(Mui.CardActions, props, children: _*)
  }
}
