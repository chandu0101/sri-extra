package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiGridList(
                        key: js.UndefOr[String] = js.undefined,
                        ref: js.UndefOr[String] = js.undefined,
                        /* Number of px for one cell height.*/
                        cellHeight: js.UndefOr[Int] = js.undefined,
                        /* Number of columns.*/
                        cols: js.UndefOr[Int] = js.undefined,
                        /* Number of px for the padding/spacing between items.*/
                        padding: js.UndefOr[Int] = js.undefined,
                        /* Override the inline-styles of the root element.*/
                        style: js.UndefOr[js.Any] = js.undefined) {
  /**
   * @param children Grid Tiles that will be in Grid List.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiGridList](this)
    React.createElement(Mui.GridList, props, children: _*)
  }
}
