package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.React

import scala.scalajs.js
import scala.scalajs.js.`|`

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiAutoComplete(
                            key: js.UndefOr[String] = js.undefined,
                            ref: js.UndefOr[String] = js.undefined,
                            /* Location of the anchor for the auto complete.*/
                            anchorOrigin: js.UndefOr[Origin] = js.undefined,
                            /* Whether or not the auto complete is animated as it is toggled.*/
                            animated: js.UndefOr[Boolean] = js.undefined,
                            /* Array of strings or nodes used to populate the list.*/
                            dataSource: js.UndefOr[js.Array[js.Any]] = js.undefined,
                            /* Disables focus ripple when true.*/
                            disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                            /* Override style prop for error.*/
                            errorStyle: js.UndefOr[js.Any] = js.undefined,
                            /* The error content to display.*/
                            errorText: js.UndefOr[String] = js.undefined,
                            /* Function used to filter the auto complete.*/
                            filter: js.UndefOr[(String, String, js.UndefOr[js.Any]) => _] = js.undefined,
                            /* The content to use for adding floating label element.*/
                            floatingLabelText: js.UndefOr[String] = js.undefined,
                            /* If true, the field receives the property `width: 100%`.*/
                            fullWidth: js.UndefOr[Boolean] = js.undefined,
                            /* The hint content to display.*/
                            hintText: js.UndefOr[String] = js.undefined,
                            /* Override style for list.*/
                            listStyle: js.UndefOr[js.Any] = js.undefined,
                            /* Delay for closing time of the menu.*/
                            menuCloseDelay: js.UndefOr[Double] = js.undefined,
                            /* Props to be passed to menu.*/
                            menuProps: js.UndefOr[js.Any] = js.undefined,
                            /* Override style for menu.*/
                            menuStyle: js.UndefOr[js.Any] = js.undefined,
                            /* Gets called when list item is clicked or pressed enter.*/
                            onNewRequest: js.UndefOr[(js.Any, Int, js.Array[js.Any] | js.Any) => _] = js.undefined,
                            /* Gets called each time the user updates the text field.*/
                            onUpdateInput: js.UndefOr[(String, js.Array[js.Any] | js.Any) => _] = js.undefined,
                            /* Auto complete menu is open if true.*/
                            open: js.UndefOr[Boolean] = js.undefined,
                            /* Text being input to auto complete.*/
                            searchText: js.UndefOr[String] = js.undefined,
                            /* Override the inline-styles of the root element.*/
                            style: js.UndefOr[js.Any] = js.undefined,
                            /* Origin for location of target.*/
                            targetOrigin: js.UndefOr[Origin] = js.undefined,
                            /* Delay for touch tap event closing of auto complete.*/
                            touchTapCloseDelay: js.UndefOr[Int] = js.undefined,
                            /* If true, will update when focus event triggers.*/
                            triggerUpdateOnFocus: js.UndefOr[Boolean] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiAutoComplete](this)
    React.createElement(Mui.AutoComplete, props)
  }
}
        
