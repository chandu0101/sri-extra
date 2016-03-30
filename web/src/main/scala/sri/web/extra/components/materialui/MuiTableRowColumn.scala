package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.extra.api.ReactEventH

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiTableRowColumn(
                              key: js.UndefOr[String] = js.undefined,
                              ref: js.UndefOr[String] = js.undefined,
                              /* The css class name of the root element.*/
                              className: js.UndefOr[String] = js.undefined,
                              /* Number to identify the header row. This property
                            is automatically populated when used with TableHeader.*/
                              columnNumber: js.UndefOr[Int] = js.undefined,
                              /* If true, this column responds to hover events.*/
                              hoverable: js.UndefOr[Boolean] = js.undefined,
                              /* _ function for click event.*/
                              onClick: js.UndefOr[(ReactEventH, Int) => _] = js.undefined,
                              /* _ function for hover event.*/
                              onHover: js.UndefOr[(ReactEventH, Int) => _] = js.undefined,
                              /* _ function for hover exit event.*/
                              onHoverExit: js.UndefOr[(ReactEventH, Int) => _] = js.undefined,
                              /* Override the inline-styles of the root element.*/
                              style: js.UndefOr[js.Any] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiTableRowColumn](this)
    React.createElement(Mui.TableRowColumn, props, children: _*)
  }
}
