package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement, ReactNode}
import sri.web.extra.api.ReactEventH

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiTabs(
                    key: js.UndefOr[String] = js.undefined,
                    ref: js.UndefOr[String] = js.undefined,
                    /* The css class name of the root element.*/
                    className: js.UndefOr[String] = js.undefined,
                    /* The css class name of the content's container.*/
                    contentContainerClassName: js.UndefOr[String] = js.undefined,
                    /* Override the inline-styles of the content's container.*/
                    contentContainerStyle: js.UndefOr[js.Any] = js.undefined,
                    /* Specify initial visible tab index.
                  Initial selected index is set by default to 0.
                  If initialSelectedIndex is set but larger than the total amount of specified tabs,
                  initialSelectedIndex will revert back to default.*/
                    initialSelectedIndex: js.UndefOr[Int] = js.undefined,
                    /* Override the inline-styles of the InkBar.*/
                    inkBarStyle: js.UndefOr[js.Any] = js.undefined,
                    /* Called when the selected value change.*/
                    onChange: js.UndefOr[(String, ReactEventH, ReactElement) => _] = js.undefined,
                    /* Override the inline-styles of the root element.*/
                    style: js.UndefOr[js.Any] = js.undefined,
                    /* Override the inline-styles of the tab-labels container.*/
                    tabItemContainerStyle: js.UndefOr[js.Any] = js.undefined,
                    /* Override the default tab template used to wrap the content of each tab element.*/
                    tabTemplate: js.UndefOr[js.Any] = js.undefined,
                    /* Makes Tabs controllable and selects the tab whose value prop matches this prop.*/
                    value: js.UndefOr[js.Any] = js.undefined) {
  /**
   * @param children Should be used to pass `Tab` components.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiTabs](this)
    React.createElement(Mui.Tabs, props, children: _*)
  }
}
