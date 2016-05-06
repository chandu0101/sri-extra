package sri.extra.web.components.materialui

import scala.scalajs.js

@js.native
trait MuiColor extends js.Object

@js.native
trait MuiStyles extends js.Object {
  val AutoPrefix: js.Dynamic = js.native
  val Colors: MuiColors = js.native
  val Spacing: MuiSpacings = js.native
  val ThemeManager: ThemeManager = js.native
  val Typography: js.Dynamic = js.native
  val Transitions: js.Dynamic = js.native
  val DarkRawTheme: MuiRawTheme = js.native
  val LightRawTheme: MuiRawTheme = js.native
}

@js.native
trait MuiSpacings extends js.Object {
  val iconSize: Int = js.native
  val desktopGutter: Int = js.native
  val desktopGutterMore: Int = js.native
  val desktopGutterLess: Int = js.native
  val desktopGutterMini: Int = js.native
  val desktopKeylineIncrement: Int = js.native
  val desktopDropDownMenuItemHeight: Int = js.native
  val desktopDropDownMenuFontSize: Int = js.native
  val desktopLeftNavMenuItemHeight: Int = js.native
  val desktopSubheaderHeight: Int = js.native
  val desktopToolbarHeight: Int = js.native
}

object MuiSpacings {
  def apply(iconSize: Int,
            desktopGutter: Int,
            desktopGutterMore: Int,
            desktopGutterLess: Int,
            desktopGutterMini: Int,
            desktopKeylineIncrement: Int,
            desktopDropDownMenuItemHeight: Int,
            desktopDropDownMenuFontSize: Int,
            desktopLeftNavMenuItemHeight: Int,
            desktopSubheaderHeight: Int,
            desktopToolbarHeight: Int) =

    js.Dynamic.literal(
      iconSize = iconSize,
      desktopGutter = desktopGutter,
      desktopGutterMore = desktopGutterMore,
      desktopGutterLess = desktopGutterLess,
      desktopGutterMini = desktopGutterMini,
      desktopKeylineIncrement = desktopKeylineIncrement,
      desktopDropDownMenuItemHeight = desktopDropDownMenuItemHeight,
      desktopDropDownMenuFontSize = desktopDropDownMenuFontSize,
      desktopLeftNavMenuItemHeight = desktopLeftNavMenuItemHeight,
      desktopSubheaderHeight = desktopSubheaderHeight,
      desktopToolbarHeight = desktopToolbarHeight
    ).asInstanceOf[MuiSpacings]

  implicit class MuiSpacingOps(s: MuiSpacings) {
    def copy(iconSize: Int = s.iconSize,
             desktopGutter: Int = s.desktopGutter,
             desktopGutterMore: Int = s.desktopGutterMore,
             desktopGutterLess: Int = s.desktopGutterLess,
             desktopGutterMini: Int = s.desktopGutterMini,
             desktopKeylineIncrement: Int = s.desktopKeylineIncrement,
             desktopDropDownMenuItemHeight: Int = s.desktopDropDownMenuItemHeight,
             desktopDropDownMenuFontSize: Int = s.desktopDropDownMenuFontSize,
             desktopLeftNavMenuItemHeight: Int = s.desktopLeftNavMenuItemHeight,
             desktopSubheaderHeight: Int = s.desktopSubheaderHeight,
             desktopToolbarHeight: Int = s.desktopToolbarHeight) =

      js.Dynamic.literal(
        iconSize = iconSize,
        desktopGutter = desktopGutter,
        desktopGutterMore = desktopGutterMore,
        desktopGutterLess = desktopGutterLess,
        desktopGutterMini = desktopGutterMini,
        desktopKeylineIncrement = desktopKeylineIncrement,
        desktopDropDownMenuItemHeight = desktopDropDownMenuItemHeight,
        desktopDropDownMenuFontSize = desktopDropDownMenuFontSize,
        desktopLeftNavMenuItemHeight = desktopLeftNavMenuItemHeight,
        desktopSubheaderHeight = desktopSubheaderHeight,
        desktopToolbarHeight = desktopToolbarHeight
      ).asInstanceOf[MuiSpacings]
  }

}

@js.native
trait MuiPalette extends js.Object {
  val primary1Color: MuiColor = js.native
  val primary2Color: MuiColor = js.native
  val primary3Color: MuiColor = js.native
  val accent1Color: MuiColor = js.native
  val accent2Color: MuiColor = js.native
  val accent3Color: MuiColor = js.native
  val textColor: MuiColor = js.native
  val alternateTextColor: MuiColor = js.native
  val canvasColor: MuiColor = js.native
  val borderColor: MuiColor = js.native
  val disabledColor: MuiColor = js.native
}

object MuiPalette {
  def apply(primary1Color: MuiColor,
            primary2Color: MuiColor,
            primary3Color: MuiColor,
            accent1Color: MuiColor,
            accent2Color: MuiColor,
            accent3Color: MuiColor,
            textColor: MuiColor,
            alternateTextColor: MuiColor,
            canvasColor: MuiColor,
            borderColor: MuiColor,
            disabledColor: MuiColor): MuiPalette = {
    js.Dynamic.literal(
      primary1Color = primary1Color,
      primary2Color = primary2Color,
      primary3Color = primary3Color,
      accent1Color = accent1Color,
      accent2Color = accent2Color,
      accent3Color = accent3Color,
      textColor = textColor,
      alternateTextColor = alternateTextColor,
      canvasColor = canvasColor,
      borderColor = borderColor,
      disabledColor = disabledColor).asInstanceOf[MuiPalette]
  }

  implicit class MuiPaletteOps(p: MuiPalette) {
    def copy(primary1Color: MuiColor = p.primary1Color,
             primary2Color: MuiColor = p.primary2Color,
             primary3Color: MuiColor = p.primary3Color,
             accent1Color: MuiColor = p.accent1Color,
             accent2Color: MuiColor = p.accent2Color,
             accent3Color: MuiColor = p.accent3Color,
             textColor: MuiColor = p.textColor,
             alternateTextColor: MuiColor = p.alternateTextColor,
             canvasColor: MuiColor = p.canvasColor,
             borderColor: MuiColor = p.borderColor,
             disabledColor: MuiColor = p.disabledColor): MuiPalette =
      js.Dynamic.literal(
        primary1Color = primary1Color,
        primary2Color = primary2Color,
        primary3Color = primary3Color,
        accent1Color = accent1Color,
        accent2Color = accent2Color,
        accent3Color = accent3Color,
        textColor = textColor,
        alternateTextColor = alternateTextColor,
        canvasColor = canvasColor,
        borderColor = borderColor,
        disabledColor = disabledColor
      ).asInstanceOf[MuiPalette]
  }

}

@js.native
trait MuiRawTheme extends js.Object {
  val spacing: MuiSpacings = js.native
  val fontFamily: String = js.native
  val palette: MuiPalette = js.native
}

object MuiRawTheme {
  def apply(spacing: MuiSpacings, fontFamily: String, palette: MuiPalette): MuiRawTheme = {
    js.Dynamic.literal(spacing = spacing, fontFamily = fontFamily, palette = palette).asInstanceOf[MuiRawTheme]
  }
}

@js.native
trait MuiTheme extends js.Object

@js.native
trait ThemeManager extends js.Object {
  def getMuiTheme(r: MuiRawTheme): MuiTheme = js.native

  def modifyRawThemeSpacing(muiTheme: MuiTheme, newSpacing: Int): MuiTheme = js.native

  def modifyRawThemePalette(muiTheme: MuiTheme, newPaletteKeys: js.Dynamic): MuiTheme = js.native

  def modifyRawThemeFontFamily(muiTheme: MuiTheme, newFontFamily: String): MuiTheme = js.native
}

@js.native
trait ThemeDecorator extends js.Object {
  def getMuiTheme(r: MuiRawTheme): MuiTheme = js.native

  def modifyRawThemeSpacing(muiTheme: MuiTheme, newSpacing: Int): MuiTheme = js.native

  def modifyRawThemePalette(muiTheme: MuiTheme, newPaletteKeys: js.Dynamic): MuiTheme = js.native

  def modifyRawThemeFontFamily(muiTheme: MuiTheme, newFontFamily: String): MuiTheme = js.native
}

object ThemeInstaller {
  //  def installMuiContext[P, S, B, N <: TopNode](rawThemeOpt: js.UndefOr[MuiRawTheme] = js.undefined): ReactComponentSpec[P, S, B, N] => _ =
  //    spec => _ {
  //      if (Mui != js.undefined && Mui.Styles != js.undefined) {
  //        val rawTheme = rawThemeOpt getOrElse Mui.Styles.LightRawTheme
  //        val theme = Mui.Styles.ThemeManager.getMuiTheme(rawTheme)
  //        val t = spec.asInstanceOf[js.Dynamic]
  //        t.updateDynamic("childContextTypes")(js.Dynamic.literal("muiTheme" -> React.asInstanceOf[js.Dynamic].PropTypes.`object`): js.Object)
  //        t.updateDynamic("getChildContext")(((any: js.Object) => js.Dynamic.literal("muiTheme" -> theme)): js.Function)
  //      }
  //    }
}
