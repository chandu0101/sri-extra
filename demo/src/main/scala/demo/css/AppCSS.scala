package demo
package css

import demo.components.materialui._
import demo.components._
import demo.screens.HomeScreen
import sri.scalacss.Defaults._

import scalacss.Defaults._
import scalacss.mutable.GlobalRegistry

object AppCSS {

  def load() = {
    GlobalRegistry.register(LeftNav.Style,
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
