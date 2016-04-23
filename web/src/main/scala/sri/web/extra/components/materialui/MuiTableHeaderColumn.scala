package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.all._

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiTableHeaderColumn(
                                 key: js.UndefOr[String] = js.undefined,
                                 ref: js.UndefOr[String] = js.undefined,
                                 /* The css class name of the root element.*/
                                 className: js.UndefOr[String] = js.undefined,
                                 /* Number to identify the header row. This property
                               is automatically populated when used with TableHeader.*/
                                 columnNumber: js.UndefOr[Int] = js.undefined,
                                 /* _ function for click event.*/
                                 onClick: js.UndefOr[(ReactEventH, Int) => _] = js.undefined,
                                 /* Override the inline-styles of the root element.*/
                                 style: js.UndefOr[js.Any] = js.undefined,
                                 /* The string to supply to the tooltip. If not
                               string is supplied no tooltip will be shown.*/
                                 tooltip: js.UndefOr[String] = js.undefined,
                                 /* Additional styling that can be applied to the tooltip.*/
                                 tooltipStyle: js.UndefOr[js.Any] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiTableHeaderColumn](this)
    React.createElement(Mui.TableHeaderColumn, props, children: _*)
  }
}
