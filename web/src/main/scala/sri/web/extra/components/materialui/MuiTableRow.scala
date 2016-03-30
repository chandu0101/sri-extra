package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.extra.api.ReactEventH

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiTableRow(
                        key: js.UndefOr[String] = js.undefined,
                        ref: js.UndefOr[String] = js.undefined,
                        /* The css class name of the root element.*/
                        className: js.UndefOr[String] = js.undefined,
                        /* If true, row border will be displayed for the row.
                      If false, no border will be drawn.*/
                        displayBorder: js.UndefOr[Boolean] = js.undefined,
                        /* Controls whether or not the row reponseds to hover events.*/
                        hoverable: js.UndefOr[Boolean] = js.undefined,
                        /* Called when a row cell is clicked.
                      rowNumber is the row number and columnId is
                      the column number or the column key.*/
                        onCellClick: js.UndefOr[(Int, Int) => _] = js.undefined,
                        /* Called when a table cell is hovered.
                      rowNumber is the row number of the hovered row
                      and columnId is the column number or the column key of the cell.*/
                        onCellHover: js.UndefOr[(Int, Int) => _] = js.undefined,
                        /* Called when a table cell is no longer hovered.
                      rowNumber is the row number of the row and columnId
                      is the column number or the column key of the cell.*/
                        onCellHoverExit: js.UndefOr[(Int, Int) => _] = js.undefined,
                        /* Called when row is clicked.*/
                        onRowClick: js.UndefOr[(ReactEventH, Int) => _] = js.undefined,
                        /* Called when a table row is hovered.
                      rowNumber is the row number of the hovered row.*/
                        onRowHover: js.UndefOr[Int => _] = js.undefined,
                        /* Called when a table row is no longer hovered.
                      rowNumber is the row number of the row that is no longer hovered.*/
                        onRowHoverExit: js.UndefOr[Int => _] = js.undefined,
                        /* Number to identify the row. This property is
                      automatically populated when used with the TableBody component.*/
                        rowNumber: js.UndefOr[Int] = js.undefined,
                        /* If true, table rows can be selected. If multiple row
                      selection is desired, enable multiSelectable.
                      The default value is true.*/
                        selectable: js.UndefOr[Boolean] = js.undefined,
                        /* Indicates that a particular row is selected.
                      This property can be used to programmatically select rows.*/
                        selected: js.UndefOr[Boolean] = js.undefined,
                        /* Indicates whether or not the row is striped.*/
                        striped: js.UndefOr[Boolean] = js.undefined,
                        /* Override the inline-styles of the root element.*/
                        style: js.UndefOr[js.Any] = js.undefined) {
  /**
   * @param children Children passed to table row.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiTableRow](this)
    React.createElement(Mui.TableRow, props, children: _*)
  }
}
