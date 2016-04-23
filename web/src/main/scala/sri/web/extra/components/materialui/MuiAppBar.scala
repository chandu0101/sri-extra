package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement, ReactNode}
import sri.web.all._
import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiAppBar(
                      key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      /* Applied to the app bar's root element.*/
                      className: js.UndefOr[String] = js.undefined,
                      /* The classname of the icon on the left of the app bar.
                    If you are using a stylesheet for your icons, enter the class name for the icon to be used here.*/
                      iconClassNameLeft: js.UndefOr[String] = js.undefined,
                      /* Similiar to the iconClassNameLeft prop except that
                    it applies to the icon displayed on the right of the app bar.*/
                      iconClassNameRight: js.UndefOr[String] = js.undefined,
                      /* The custom element to be displayed on the left side of the
                    app bar such as an SvgIcon.*/
                      iconElementLeft: js.UndefOr[ReactElement] = js.undefined,
                      /* Similiar to the iconElementLeft prop except that this element is displayed on the right of the app bar.*/
                      iconElementRight: js.UndefOr[ReactElement] = js.undefined,
                      /* Override the inline-styles of the element displayed on the right side of the app bar.*/
                      iconStyleRight: js.UndefOr[js.Any] = js.undefined,
                      /* _ function for when the left icon is selected via a touch tap.*/
                      onLeftIconButtonTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                      /* _ function for when the right icon is selected via a touch tap.*/
                      onRightIconButtonTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                      /* _ function for when the title text is selected via a touch tap.*/
                      onTitleTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                      /* Determines whether or not to display the Menu icon next to the title.
                    Setting this prop to false will hide the icon.*/
                      showMenuIconButton: js.UndefOr[Boolean] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined,
                      /* The title to display on the app bar.*/
                      title: js.UndefOr[ReactNode] = js.undefined,
                      /* Override the inline-styles of the app bar's title element.*/
                      titleStyle: js.UndefOr[js.Any] = js.undefined,
                      /* The zDepth of the component.
                    The shadow of the app bar is also dependent on this property.*/
                      zDepth: js.UndefOr[ZDepth] = js.undefined) {
  /**
   * @param children Can be used to render a tab inside an app bar for instance.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiAppBar](this)
    if (children.isEmpty)
      React.createElement(Mui.AppBar, props)
    else if (children.size == 1)
      React.createElement(Mui.AppBar, props, children.head)
    else
      React.createElement(Mui.AppBar, props, children: _*)

  }
}
