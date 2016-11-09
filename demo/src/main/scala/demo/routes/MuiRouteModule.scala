package demo
package routes

import demo.components.materialui._
import demo.screens.MuiScreen
import sri.web.router.{WebRoute, WebRouterModuleConfig, WebStaticPage}

object MuiRouteModule extends WebRouterModuleConfig("materialui") {

  object InfoPage extends WebStaticPage

  object UpdatesPage extends WebStaticPage

  object AppBarPage extends WebStaticPage

  object AutoCompletePage extends WebStaticPage

  object AvatarPage extends WebStaticPage

  object BadgePage extends WebStaticPage

  object CardPage extends WebStaticPage

  object ChipPage extends WebStaticPage

  object TabsPage extends WebStaticPage

  object ButtonsPage extends WebStaticPage

  object DatePickerPage extends WebStaticPage

  object DialogPage extends WebStaticPage

  object DropDownMenuPage extends WebStaticPage

  object DrawerPage extends WebStaticPage

  object PaperPage extends WebStaticPage

  object PopoverPage extends WebStaticPage

  object TextFieldPage extends WebStaticPage

  object ProgressPage extends WebStaticPage

  object SelectFieldPage extends WebStaticPage

  object SnackBarPage extends WebStaticPage

  object SliderPage extends WebStaticPage

  object SvgIconPage extends WebStaticPage

  object TimePickerPage extends WebStaticPage

  object SwitchesPage extends WebStaticPage

  object ToolbarPage extends WebStaticPage


  object MenuPage extends WebStaticPage

  object MListPage extends WebStaticPage

  object TablePage extends WebStaticPage

  val menu = List(
    LeftRoute(name = "Info", page = InfoPage, component = () => MuiInfo()),
    LeftRoute(name = "AppBar", page = AppBarPage, component = () => MuiAppBarDemo()),
    LeftRoute(name = "AutoComplete", page = AutoCompletePage, component = () => MuiAutoCompleteDemo()),
    LeftRoute(name = "Avatar", page = AvatarPage, component = () => MuiAvatarDemo()),
    LeftRoute(name = "Badge", page = BadgePage, component = () => MuiBadgeDemo()),
    LeftRoute(name = "Card", page = CardPage, component = () => MuiCardDemo()),
    LeftRoute(name = "Chip", page = ChipPage, component = () => MuiChipDemo()),
    LeftRoute(name = "Buttons", page = ButtonsPage, component = () => MuiButtonsDemo()),
    LeftRoute(name = "DatePicker", page = DatePickerPage, component = () => MuiDatePickerDemo()),
    LeftRoute(name = "Dialog", page = DialogPage, component = () => MuiDialogDemo()),
    LeftRoute(name = "DropDown Menu", page = DropDownMenuPage, component = () => MuiDropDownMenuDemo()),
    LeftRoute(name = "Drawer", page = DrawerPage, component = () => MuiDrawerDemo()),
    LeftRoute(name = "Paper", page = PaperPage, component = () => MuiPaperDemo()),
    //    LeftRoute(name = "Popover", page = PopoverPage, component =  () => MuiPopoverDemo()),
    LeftRoute(name = "Text Field", page = TextFieldPage, component = () => MuiTextFieldDemo()),
    LeftRoute(name = "Progress Bars", page = ProgressPage, component = () => MuiProgressDemo()),
    //    LeftRoute(name = "Select Field", page = SelectFieldPage, component =  () => MuiSelectFieldDemo()),
    //    LeftRoute(name = "SnackBar", page = SnackBarPage, component = () => MuiSnackbarDemo()),
    LeftRoute(name = "Slider", page = SliderPage, component = () => MuiSliderDemo()),
    //    LeftRoute(name = "Svg Icons", page = SvgIconPage, component =  () => MuiSvgIconDemo()),
    LeftRoute(name = "Time Picker", page = TimePickerPage, component = () => MuiTimePickerDemo()),
    LeftRoute(name = "Tabs", page = TabsPage, component = () => MuiTabsDemo()),
    LeftRoute(name = "Switches", page = SwitchesPage, component = () => MuiSwitchesDemo()),
    LeftRoute(name = "Toolbar", page = ToolbarPage, component = () => MuiToolbarDemo()),
    LeftRoute(name = "Menus", page = MenuPage, component = () => MuiMenuDemo()),
    LeftRoute(name = "List", page = MListPage, component = () => MuiListDemo()),
    LeftRoute(name = "Table", page = TablePage, component = () => MuiTableDemo())
  )


  menu.map(r => staticRoute(page = r.page, path = r.name.toLowerCase.replaceAll(" ", ""), component = (route: WebRoute) => MuiScreen(r.component)))

}
