package demo
package styles

import demo.components.materialui._
import demo.components._
import demo.screens.HomeScreen
import scalacss.Defaults._
import scalacss.internal.mutable.GlobalRegistry

object AppStyles {

  def load() = {
    GlobalRegistry.register(
      GlobalStyle,
      LeftNav.Style,
      LeftNavPage.Style,
      MuiButtonsDemo.Style,
      MuiPaperDemo.Style,
      MuiSwitchesDemo.Style,
      AppHeader.Style,
      HomeScreen.Style,
      MobileTearSheet.Style,
      MuiInfo.Style,
      CodeExample.Style,
      ScalaCSSTutorial.Style,
      GithubUser.Styles,
      ComponentGridItem.Style,
      InfoTemplate.Style,
      MuiTabsDemo.Style)
    GlobalRegistry.addToDocumentOnRegistration()
  }
}
