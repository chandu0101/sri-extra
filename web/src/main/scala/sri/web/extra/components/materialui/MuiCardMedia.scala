package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiCardMedia(
                         key: js.UndefOr[String] = js.undefined,
                         ref: js.UndefOr[String] = js.undefined,
                         /* Whether a click on this card component expands the card. Can be set on any child of the Card component.*/
                         actAsExpander: js.UndefOr[Boolean] = js.undefined,
                         /* Whether this card component is expandable. Can be set on any child of the Card component.*/
                         expandable: js.UndefOr[Boolean] = js.undefined,
                         mediaStyle: js.UndefOr[js.Any] = js.undefined,
                         overlay: js.UndefOr[ReactNode] = js.undefined,
                         overlayContainerStyle: js.UndefOr[js.Any] = js.undefined,
                         overlayContentStyle: js.UndefOr[js.Any] = js.undefined,
                         overlayStyle: js.UndefOr[js.Any] = js.undefined,
                         /* Override the inline-styles of the root element.*/
                         style: js.UndefOr[js.Any] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiCardMedia](this)
    if (children.isEmpty)
      React.createElement(Mui.CardMedia, props)
    else if (children.size == 1)
      React.createElement(Mui.CardMedia, props, children.head)
    else
      React.createElement(Mui.CardMedia, props, children: _*)
  }
}
