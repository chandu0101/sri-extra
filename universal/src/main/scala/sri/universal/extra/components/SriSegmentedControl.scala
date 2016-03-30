package sri.universal.extra.components

import sri.core._
import sri.universal.all._
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U}


object SriSegmentedControl {

  object SegmentCell {

    val Component = (props: Props) => {
      val selected = props.value == props.selectedValue
      val separatorStyle = if (props.index > 0) props.style.separator else null
      val segmentStyle = if (selected) UniversalStyleSheet.styleE(props.style.segmentSelected, separatorStyle)()
      else UniversalStyleSheet.styleE(props.style.segment, separatorStyle)()

      TouchableWithoutFeedback(onPress = props.onValueChange)(
        View(style = segmentStyle)(
          Text(style = if (selected) props.style.textSelected else props.style.text)(props.value)
        )
      )
    }


    case class Props(index: Int, selectedValue: String, value: String, onValueChange: () => Unit, style: Style)

    def apply(index: Int, selectedValue: String, value: String, onValueChange: () => Unit, style: Style, key: String) = createStatelessFunctionElement(Component, Props(index, selectedValue, value, onValueChange, style), key)
  }


  val Component = (props: Props) => {
    View(style = props.style.container)(
      props.values.zipWithIndex.map {
        case (v, i) => SegmentCell(index = i, selectedValue = props.selectedValue, value = v, onValueChange = () => onValueChange(v, props), props.style, i.toString)
      }
    )
  }

  def onValueChange(value: String, props: Props) = {
    if (props.selectedValue != value) props.onValueChange(value)
  }


  trait Style extends UniversalStyleSheet {
    val segmentTintColor = "#5fbaac"

    def container = style(
      height := 25,
      borderWidth := 1,
      alignSelf.stretch,
      borderColor := segmentTintColor,
      backgroundColor := "white",
      borderRadius := 5,
      justifyContent.spaceBetween,
      overflow.hidden,
      flexDirection.row
    )

    def segment = style(flexOne,
      justifyContent.center)

    def separator = style(borderLeftWidth := 1,
      borderLeftColor := segmentTintColor)

    def segmentSelected = styleE(segment)(
      backgroundColor := segmentTintColor
    )

    def text = style(fontWeight._500,
      textAlign.center,
      color := "black")

    def textSelected = styleE(text)(
      color := "white")
  }

  trait VerticalStyle extends Style {

   override  val segmentTintColor = "#5fbaac"

  override  def container = style(
      borderWidth := 1,
      alignSelf.stretch,
      borderColor := segmentTintColor,
      backgroundColor := "transparent",
      borderRadius := 5,
      overflow.hidden
    )

  override  def segment = style(
      justifyContent.center,
      height := 35)

  override  def separator = style(borderTopWidth := 1,
      borderTopColor := segmentTintColor)

  override  def segmentSelected = styleE(segment)(
      backgroundColor := segmentTintColor
    )

  override  def text = style(fontWeight._500,
      textAlign.center,
      color := "black")

  override  def textSelected = styleE(text)(
      color := "white")
  }

  object DefaultTheme extends Style {

  }

  object YellowTheme extends Style {

    override val segmentTintColor = "#f7ae40"
  }

  object RedTheme extends Style {

    override val segmentTintColor = "#e35354"
  }

  object BlueTheme extends Style {
    override val segmentTintColor = "#8d74c0"
  }

  object DefaultVerticalTheme extends VerticalStyle {

  }

  object YellowVerticalTheme extends VerticalStyle {

    override val segmentTintColor = "#f7ae40"
  }

  object RedVerticalTheme extends VerticalStyle {

    override val segmentTintColor = "#e35354"
  }

  object BlueVerticalTheme extends VerticalStyle {
    override val segmentTintColor = "#8d74c0"
  }


  case class Props(values: Set[String], selectedValue: String, onValueChange: String => Unit, style: Style)


  def apply(values: Set[String], selectedValue: String = "", onValueChange: String => Unit, style: Style  = DefaultTheme, key: U[String] = js.undefined) = createStatelessFunctionElement(Component, Props(values, selectedValue, onValueChange, style), key = key)

}