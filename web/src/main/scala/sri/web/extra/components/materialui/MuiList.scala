package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiList(
                    key: js.UndefOr[String] = js.undefined,
                    ref: js.UndefOr[String] = js.undefined,
                    /* If true, the subheader will be indented by 72px.*/
                    insetSubheader: js.UndefOr[Boolean] = js.undefined,
                    /* Override the inline-styles of the root element.*/
                    style: js.UndefOr[js.Any] = js.undefined,
                    /* The subheader string that will be displayed at the top of the list.*/
                    subheader: js.UndefOr[ReactNode] = js.undefined,
                    /* The style object to override subheader styles.*/
                    subheaderStyle: js.UndefOr[js.Any] = js.undefined,
                    /* The zDepth prop passed to the Paper element inside list.*/
                    zDepth: js.UndefOr[ZDepth] = js.undefined) {
  /**
   * @param children These are usually ListItems that are passed to
be part of the list.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiList](this)
    React.createElement(Mui.List, props, children: _*)
  }
}
