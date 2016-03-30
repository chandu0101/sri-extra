package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiTableFooter(
                           key: js.UndefOr[String] = js.undefined,
                           ref: js.UndefOr[String] = js.undefined,
                           /* Controls whether or not header rows should be adjusted
                         for a checkbox column. If the select all checkbox is true,
                         this property will not influence the number of columns.
                         This is mainly useful for "super header" rows so that
                         the checkbox column does not create an offset that needs
                         to be accounted for manually.*/
                           adjustForCheckbox: js.UndefOr[Boolean] = js.undefined,
                           /* The css class name of the root element.*/
                           className: js.UndefOr[String] = js.undefined,
                           /* Override the inline-styles of the root element.*/
                           style: js.UndefOr[js.Any] = js.undefined) {
  /**
   * @param children Children passed to table footer.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiTableFooter](this)
    React.createElement(Mui.TableFooter, props, children: _*)
  }
}
