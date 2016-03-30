package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.extra.api.ReactEventI

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiDropDownMenu(
                            key: js.UndefOr[String] = js.undefined,
                            ref: js.UndefOr[String] = js.undefined,
                            /* The width will automatically be set according to the items inside the menu.
                          To control this width in css instead, set this prop to false.*/
                            autoWidth: js.UndefOr[Boolean] = js.undefined,
                            /* The css class name of the root element.*/
                            className: js.UndefOr[String] = js.undefined,
                            /* Disables the menu.*/
                            disabled: js.UndefOr[Boolean] = js.undefined,
                            /* `DropDownMenu` will use this member to display
                          the name of the item.*/
                            /* Overrides the styles of icon element.*/
                            iconStyle: js.UndefOr[js.Any] = js.undefined,
                            /* `DropDownMenu` will use this member to display
                          the name of the item on the label.*/
                            /* Overrides the styles of label when the `DropDownMenu` is inactive.*/
                            labelStyle: js.UndefOr[js.Any] = js.undefined,
                            /* The maximum height of the `Menu` when it is displayed.*/
                            maxHeight: js.UndefOr[Int] = js.undefined,
                            /* JSON data representing all menu items in the dropdown.*/
                            /* Overrides the styles of `Menu` when the `DropDownMenu` is displayed.*/
                            menuStyle: js.UndefOr[js.Any] = js.undefined,
                            /* Fired when a menu item is clicked that is not the one currently selected.*/
                            onChange: js.UndefOr[(ReactEventI, Int, js.Any) => _] = js.undefined,
                            /* Set to true to have the `DropDownMenu` automatically open on mount.*/
                            openImmediately: js.UndefOr[Boolean] = js.undefined,
                            /* Index of the item selected.*/
                            /* Override the inline-styles of the root element.*/
                            style: js.UndefOr[js.Any] = js.undefined,
                            /* Overrides the inline-styles of the underline.*/
                            underlineStyle: js.UndefOr[js.Any] = js.undefined,
                            /* The value that is currently selected.*/
                            value: js.UndefOr[js.Any] = js.undefined,
                            /* Two-way binding link.*/
                            @deprecated("It\'s deprecated by React too.")
                            valueLink: js.UndefOr[js.Any] = js.undefined,
                            /* `DropDownMenu` will use this member as the value representing an item.*/
                            @deprecated("Instead, use composability.")
                            valueMember: js.UndefOr[String] = js.undefined) {
  /**
   * @param children The `MenuItem`s to populate the `Menu` with. If the `MenuItems` have the
prop `label` that value will be used to render the representation of that
item within the field.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiDropDownMenu](this)
    if (children.isEmpty)
      React.createElement(Mui.DropDownMenu, props)
    else if (children.size == 1)
      React.createElement(Mui.DropDownMenu, props, children.head)
    else
      React.createElement(Mui.DropDownMenu, props, children: _*)
  }
}

case class MuiDropDownMenuItem(payload: String, text: String) {
  val toJS = JSMacro[MuiDropDownMenuItem](this)
}

object DropDownMenuItem {
  def fromJson(obj: js.Dynamic) =
    MuiDropDownMenuItem(text = obj.text.toString, payload = obj.payload.toString)
}
      
