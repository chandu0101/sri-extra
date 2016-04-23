package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiLeftNav(
                       key: js.UndefOr[String] = js.undefined,
                       ref: js.UndefOr[MuiLeftNavM => Unit] = js.undefined,
                       /* The css class name of the root element.*/
                       className: js.UndefOr[String] = js.undefined,
                       /* Indicates whether swiping sideways when the `LeftNav` is closed should open it.*/
                       disableSwipeToOpen: js.UndefOr[Boolean] = js.undefined,
                       /* Indicates that the `LeftNav` should be docked. In this state, the overlay won't
                     show and clicking on a menu item will not close the `LeftNav`.*/
                       docked: js.UndefOr[Boolean] = js.undefined,
                       /* A react component that will be displayed above all the menu items.
                     Usually, this is used for a logo or a profile image.*/
                       /* Fired when a menu item is clicked that is not the
                     one currently selected. Note that this requires the `injectTapEventPlugin`
                     component. See the "Get Started" section for more detail.*/
                       /* _ function that is fired when the open state of the `LeftNav` is
                     requested to be changed. The provided open argument determines whether
                     the `LeftNav` is requested to be opened or closed. Also, the reason
                     argument states why the `LeftNav` got closed or opend. It can be either
                     `'clickaway'` for menuItem and overlay clicks, `'escape'` for pressing the
                     escape key and 'swipe' for swiping. For opening the reason is always `'swipe'`.*/
                       onRequestChange: js.UndefOr[(Boolean, String) => _] = js.undefined,
                       /* Indicates that the `LeftNav` should be opened, closed or uncontrolled.
                     Providing a boolean will turn the `LeftNav` into a controlled component.*/
                       open: js.UndefOr[Boolean] = js.undefined,
                       /* Positions the `LeftNav` to open from the right side.*/
                       openRight: js.UndefOr[Boolean] = js.undefined,
                       /* The `className` to add to the `Overlay` component that is rendered behind the `LeftNav`.*/
                       overlayClassName: js.UndefOr[String] = js.undefined,
                       /* Overrides the inline-styles of the `Overlay` component that is rendered behind the `LeftNav`.*/
                       overlayStyle: js.UndefOr[js.Any] = js.undefined,
                       /* Override the inline-styles of the root element.*/
                       style: js.UndefOr[js.Any] = js.undefined,
                       /* The width of the left most (or right most) area in pixels where the `LeftNav` can be
                     swiped open from. Setting this to `null` spans that area to the entire page
                     (**CAUTION!** Setting this property to `null` might cause issues with sliders and
                     swipeable `Tabs`, use at your own risk).*/
                       swipeAreaWidth: js.UndefOr[Double] = js.undefined,
                       /* The width of the `LeftNav` in pixels. Defaults to using the values from theme.*/
                       width: js.UndefOr[Double] = js.undefined) {
  /**
   * @param children The contents of the `LeftNav`
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiLeftNav](this)
    React.createElement(Mui.LeftNav, props, children: _*)
  }
}


@js.native
class MuiLeftNavM extends js.Object {

}
