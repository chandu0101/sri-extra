package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement, ReactNode}
import sri.web.extra.api.{ReactKeyboardEventH, ReactMouseEventH, ReactTouchEventH}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiListItem(
                        key: js.UndefOr[String] = js.undefined,
                        ref: js.UndefOr[String] = js.undefined,
                        /* Generate a nested list indicator icon when
                      nested list items are detected. Set to false
                      if you do not want an indicator auto-generated.
                      Note that an indicator will not be created if a
                      rightIcon/Button has been specified.*/
                        autoGenerateNestedIndicator: js.UndefOr[Boolean] = js.undefined,
                        /* Does not allow the element to be focused by the keyboard.*/
                        disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
                        /* If true, the list-item will not be clickable
                      and will not display hover affects.
                      This is automatically disabled if leftCheckbox
                      or rightToggle is set.*/
                        disabled: js.UndefOr[Boolean] = js.undefined,
                        /* Controls whether or not the child ListItems are initially displayed.*/
                        initiallyOpen: js.UndefOr[Boolean] = js.undefined,
                        /* Style prop for the innder div element.*/
                        innerDivStyle: js.UndefOr[js.Any] = js.undefined,
                        /* If true, the children will be indented by 72px.
                      Only needed if there is no left avatar or left icon.*/
                        insetChildren: js.UndefOr[Boolean] = js.undefined,
                        /* This is the Avatar element to be displayed on the left side.*/
                        leftAvatar: js.UndefOr[ReactElement] = js.undefined,
                        /* This is the Checkbox element to be displayed on the left side.*/
                        leftCheckbox: js.UndefOr[ReactElement] = js.undefined,
                        /* This is the SvgIcon or FontIcon to be displayed on the left side.*/
                        leftIcon: js.UndefOr[ReactElement] = js.undefined,
                        /* An array of ListItems to nest underneath the current ListItem.*/
                        nestedItems: js.UndefOr[js.Array[ReactElement]] = js.undefined,
                        /* Controls how deep a ListItem appears.
                      This property is automatically managed so modify at your own risk.*/
                        nestedLevel: js.UndefOr[Int] = js.undefined,
                        /* Override the inline-styles of the nestedItems NestedList.*/
                        nestedListStyle: js.UndefOr[js.Any] = js.undefined,
                        /* Called when the ListItem has keyboard focus.*/
                        onKeyboardFocus: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                        /* Called when the mouse is over the ListItem.*/
                        onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                        /* Called when the mouse is no longer over the ListItem.*/
                        onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                        /* Called when the ListItem toggles its nested ListItems.*/
                        onNestedListToggle: js.UndefOr[js.Any => _] = js.undefined,
                        /* Called when touches start.*/
                        onTouchStart: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                        /* Called when a touch tap event occures on the component.*/
                        onTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                        /* This is the block element that contains the primary text.
                      If a string is passed in, a div tag will be rendered.*/
                        primaryText: js.UndefOr[ReactNode] = js.undefined,
                        /* If provided, tapping on the primary text
                      of the item toggles the nested list.*/
                        primaryTogglesNestedList: js.UndefOr[Boolean] = js.undefined,
                        /* This is the avatar element to be displayed on the right side.*/
                        rightAvatar: js.UndefOr[ReactElement] = js.undefined,
                        /* This is the SvgIcon or FontIcon to be displayed on the right side.*/
                        rightIcon: js.UndefOr[ReactElement] = js.undefined,
                        /* This is the IconButton to be displayed on the right side.
                      Hovering over this button will remove the ListItem hover.
                      Also, clicking on this button will not trigger a
                      ListItem ripple. The event will be stopped and prevented
                      from bubbling up to cause a ListItem click.*/
                        rightIconButton: js.UndefOr[ReactElement] = js.undefined,
                        /* This is the Toggle element to display on the right side.*/
                        rightToggle: js.UndefOr[ReactElement] = js.undefined,
                        /* This is the block element that contains the secondary text.
                      If a string is passed in, a div tag will be rendered.*/
                        secondaryText: js.UndefOr[ReactNode] = js.undefined,
                        /* Can be 1 or 2. This is the number of secondary
                      text lines before ellipsis will show.*/
                        secondaryTextLines: js.UndefOr[_1_2] = js.undefined,
                        /* Override the inline-styles of the root element.*/
                        style: js.UndefOr[js.Any] = js.undefined) {
  /**
   * @param children Children passed into the ListItem.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiListItem](this)
    React.createElement(Mui.ListItem, props, children: _*)
  }
}
