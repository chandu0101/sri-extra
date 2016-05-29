package sri.extra.web.components
package materialui

import chandu0101.macros.tojs.{FunctionMacro, JSMacro}
import sri.core._
import sri.web.all._

import scala.scalajs.js
import scala.scalajs.js.`|`

trait MuiComponents {

  type RowId = Int

  type ColumnId = Int | String

  def MuiAppBar(
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
                 zDepth: js.UndefOr[ZDepth] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.AppBar, props, children: _*)
  }


  def MuiAutoComplete(
                       key: js.UndefOr[String] = js.undefined,
                       ref: js.UndefOr[String] = js.undefined,
                       /* Location of the anchor for the auto complete.*/
                       anchorOrigin: js.UndefOr[Origin] = js.undefined,
                       /* Whether or not the auto complete is animated as it is toggled.*/
                       animated: js.UndefOr[Boolean] = js.undefined,
                       /* Array of strings or nodes used to populate the list.*/
                       dataSource: js.UndefOr[js.Array[String] | js.Array[MuiAutoCompleteOption]] = js.undefined,
                       /* Disables focus ripple when true.*/
                       disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                       /* Override style prop for error.*/
                       errorStyle: js.UndefOr[js.Any] = js.undefined,
                       /* The error content to display.*/
                       errorText: js.UndefOr[String] = js.undefined,
                       /* Function used to filter the auto complete.*/
                       filter: js.UndefOr[(String, String) => Boolean] = js.undefined,
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
                       onNewRequest: js.UndefOr[(String, Int) => _] = js.undefined,
                       /* Gets called each time the user updates the text field.*/
                       onUpdateInput: js.UndefOr[(String, js.Array[String] | js.Array[MuiAutoCompleteOption]) => _] = js.undefined,
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
                       triggerUpdateOnFocus: js.UndefOr[Boolean] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.AutoComplete, props)
  }

  def MuiAvatar(
                 key: js.UndefOr[String] = js.undefined,
                 ref: js.UndefOr[String] = js.undefined,
                 /* The backgroundColor of the avatar. Does not apply to image avatars.*/
                 backgroundColor: js.UndefOr[MuiColor] = js.undefined,
                 /* The css class name of the root `div` or `img` element.*/
                 className: js.UndefOr[String] = js.undefined,
                 /* The icon or letter's color.*/
                 color: js.UndefOr[MuiColor] = js.undefined,
                 /* This is the SvgIcon or FontIcon to be used inside the avatar.*/
                 icon: js.UndefOr[ReactElement] = js.undefined,
                 /* This is the size of the avatar in pixels.*/
                 size: js.UndefOr[Int] = js.undefined,
                 /* If passed in, this component will render an img element. Otherwise, a div will be rendered.*/
                 src: js.UndefOr[String] = js.undefined,
                 /* Override the inline-styles of the root element.*/
                 style: js.UndefOr[js.Any] = js.undefined)(children: js.UndefOr[ReactNode] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    if (children.isDefined) React.createElement(Mui.Avatar, props, children.get)
    else React.createElement(Mui.Avatar, props)
  }


  def MuiBadge(
                key: js.UndefOr[String] = js.undefined,
                ref: js.UndefOr[String] = js.undefined,
                /* This is the content rendered within the badge.*/
                badgeContent: ReactNode,
                /* Override the inline-styles of the badge element.*/
                badgeStyle: js.UndefOr[js.Any] = js.undefined,
                /* The css class name of the root element.*/
                className: js.UndefOr[String] = js.undefined,
                /* If true, the badge will use the primary badge colors.*/
                primary: js.UndefOr[Boolean] = js.undefined,
                /* If true, the badge will use the secondary badge colors.*/
                secondary: js.UndefOr[Boolean] = js.undefined,
                /* Override the inline-styles of the root element.*/
                style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Badge, props, children: _*)
  }

  def MuiBeforeAfterWrapper(
                             key: js.UndefOr[String] = js.undefined,
                             ref: js.UndefOr[String] = js.undefined,
                             afterElementType: js.UndefOr[String] = js.undefined,
                             afterStyle: js.UndefOr[js.Any] = js.undefined,
                             beforeElementType: js.UndefOr[String] = js.undefined,
                             beforeStyle: js.UndefOr[js.Any] = js.undefined,
                             elementType: js.UndefOr[String] = js.undefined,
                             /* Override the inline-styles of the root element.*/
                             style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.BeforeAfterWrapper, props, children: _*)
  }


  def MuiCard(
               key: js.UndefOr[String] = js.undefined,
               ref: js.UndefOr[String] = js.undefined,
               /* Whether a click on this card component expands the card. Can be set on any child of the Card component.*/
               actAsExpander: js.UndefOr[Boolean] = js.undefined,
               /* Whether this card component is expandable. Can be set on any child of the Card component.*/
               containerStyle: js.UndefOr[js.Any] = js.undefined,
               expandable: js.UndefOr[Boolean] = js.undefined,
               expanded: js.UndefOr[Boolean] = js.undefined,
               /* Whether this card is initially expanded.*/
               initiallyExpanded: js.UndefOr[Boolean] = js.undefined,
               /* Fired when the expandable state changes.*/
               onExpandChange: js.UndefOr[Boolean => _] = js.undefined,
               /* Whether this card component include a button to expand the card. CardTitle,
             CardHeader and CardActions implement showExpandableButton. Any child component
             of Card can implements showExpandableButton or forwards the property to a child
             component supporting it.*/
               showExpandableButton: js.UndefOr[Boolean] = js.undefined,
               /* Override the inline-styles of the root element.*/
               style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()

    React.createElement(Mui.Card, props, children: _*)
  }

  def MuiCardActions(
                      key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      /* Whether a click on this card component expands the card. Can be set on any child of the Card component.*/
                      actAsExpander: js.UndefOr[Boolean] = js.undefined,
                      /* Whether this card component is expandable. Can be set on any child of the Card component.*/
                      expandable: js.UndefOr[Boolean] = js.undefined,
                      /* Whether this card component include a button to expand the card. CardTitle, CardHeader and CardActions implement showExpandableButton. Any child component of Card can implements showExpandableButton or forwards the property to a child component supporting it.*/
                      showExpandableButton: js.UndefOr[Boolean] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.CardActions, props, children: _*)
  }

  def MuiCardExpandable(
                         key: js.UndefOr[String] = js.undefined,
                         ref: js.UndefOr[String] = js.undefined,
                         expanded: js.UndefOr[Boolean] = js.undefined,
                         /* Override the inline-styles of the root element.*/
                         style: js.UndefOr[js.Any] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.CardExpandable, props)
  }


  def MuiCardHeader(
                     key: js.UndefOr[String] = js.undefined,
                     ref: js.UndefOr[String] = js.undefined,
                     /* Whether a click on this card component expands the card. Can be set on any child of the Card component.*/
                     actAsExpander: js.UndefOr[Boolean] = js.undefined,
                     avatar: js.UndefOr[ReactNode] = js.undefined,
                     /* Whether this card component is expandable. Can be set on any child of the Card component.*/
                     expandable: js.UndefOr[Boolean] = js.undefined,
                     /* Whether this card component include a button to expand the card. CardTitle, CardHeader and CardActions implement showExpandableButton. Any child component of Card can implements showExpandableButton or forwards the property to a child component supporting it.*/
                     showExpandableButton: js.UndefOr[Boolean] = js.undefined,
                     /* Override the inline-styles of the root element.*/
                     style: js.UndefOr[js.Any] = js.undefined,
                     subtitle: js.UndefOr[ReactNode] = js.undefined,
                     subtitleColor: js.UndefOr[MuiColor] = js.undefined,
                     subtitleStyle: js.UndefOr[js.Any] = js.undefined,
                     textStyle: js.UndefOr[js.Any] = js.undefined,
                     title: js.UndefOr[ReactNode] = js.undefined,
                     titleColor: js.UndefOr[MuiColor] = js.undefined,
                     titleStyle: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.CardHeader, props, children: _*)
  }

  def MuiCardMedia(
                    key: js.UndefOr[String] = js.undefined,
                    ref: js.UndefOr[String] = js.undefined,
                    /* Whether a click on this card component expands the card. Can be set on any child of the Card component.*/
                    actAsExpander: js.UndefOr[Boolean] = js.undefined,
                    /* Whether this card component is expandable. Can be set on any child of the Card component.*/
                    expandable: js.UndefOr[Boolean] = js.undefined,
                    mediaStyle: js.UndefOr[js.Any] = js.undefined,
                    overlay: js.UndefOr[ReactNode] = js.undefined,
                    overlayContainerStyle: js.UndefOr[js.Any] = js.undefined,
                    overlayContentStyle: js.UndefOr[js.Any] = js.undefined,
                    overlayStyle: js.UndefOr[js.Any] = js.undefined,
                    /* Override the inline-styles of the root element.*/
                    style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.CardMedia, props, children: _*)
  }


  def MuiCardText(
                   key: js.UndefOr[String] = js.undefined,
                   ref: js.UndefOr[String] = js.undefined,
                   /* Whether a click on this card component expands the card. Can be set on any child of the Card component.*/
                   actAsExpander: js.UndefOr[Boolean] = js.undefined,
                   color: js.UndefOr[MuiColor] = js.undefined,
                   /* Whether this card component is expandable. Can be set on any child of the Card component.*/
                   expandable: js.UndefOr[Boolean] = js.undefined,
                   /* Override the inline-styles of the root element.*/
                   style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.CardText, props, children: _*)
  }

  def MuiCardTitle(
                    key: js.UndefOr[String] = js.undefined,
                    ref: js.UndefOr[String] = js.undefined,
                    /* Whether a click on this card component expands the card. Can be set on any child of the Card component.*/
                    actAsExpander: js.UndefOr[Boolean] = js.undefined,
                    /* Whether this card component is expandable. Can be set on any child of the Card component.*/
                    expandable: js.UndefOr[Boolean] = js.undefined,
                    /* Whether this card component include a button to expand the card. CardTitle, CardHeader and CardActions implement showExpandableButton. Any child component of Card can implements showExpandableButton or forwards the property to a child component supporting it.*/
                    showExpandableButton: js.UndefOr[Boolean] = js.undefined,
                    /* Override the inline-styles of the root element.*/
                    style: js.UndefOr[js.Any] = js.undefined,
                    subtitle: js.UndefOr[ReactNode] = js.undefined,
                    subtitleColor: js.UndefOr[String] = js.undefined,
                    subtitleStyle: js.UndefOr[js.Any] = js.undefined,
                    title: js.UndefOr[ReactNode] = js.undefined,
                    titleColor: js.UndefOr[String] = js.undefined,
                    titleStyle: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.CardTitle, props, children: _*)
  }

  def MuiCheckbox(
                   key: js.UndefOr[String] = js.undefined,
                   ref: js.UndefOr[MuiCheckboxM => Unit] = js.undefined,
                   /* Checkbox is checked if true.*/
                   checked: js.UndefOr[Boolean] = js.undefined,
                   /* The SvgIcon to use for the checked state.
                 This is useful to create icon toggles.*/
                   checkedIcon: js.UndefOr[ReactElement] = js.undefined,
                   /* The default state of our checkbox component.*/
                   defaultChecked: js.UndefOr[Boolean] = js.undefined,
                   /* Disabled if true.*/
                   disabled: js.UndefOr[Boolean] = js.undefined,
                   /* Overrides the inline-styles of the icon element.*/
                   iconStyle: js.UndefOr[js.Any] = js.undefined,
                   inputStyle: js.UndefOr[js.Any] = js.undefined,
                   /* Where the label will be placed next to the checkbox.*/
                   labelPosition: js.UndefOr[LeftRight] = js.undefined,
                   /* Overrides the inline-styles of the Checkbox element label.*/
                   labelStyle: js.UndefOr[js.Any] = js.undefined,
                   /* _ function that is fired when the checkbox is checked.*/
                   onCheck: js.UndefOr[(ReactEventH, Boolean) => _] = js.undefined,
                   /* Override the inline-styles of the root element.*/
                   style: js.UndefOr[js.Any] = js.undefined,
                   /* The SvgIcon to use for the unchecked state.
                 This is useful to create icon toggles.*/
                   uncheckedIcon: js.UndefOr[ReactElement] = js.undefined,
                   /* ValueLink for when using controlled checkbox.*/
                   valueLink: js.UndefOr[js.Any] = js.undefined,
                   /* The css class name of the root element.
                   (Passed on to EnhancedSwitch)*/
                   className: js.UndefOr[String] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   defaultSwitched: js.UndefOr[Boolean] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   id: js.UndefOr[String] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   inputType: js.UndefOr[String] = js.undefined,
                   /* The text that is displayed beside the checkbox.
                   (Passed on to EnhancedSwitch)*/
                   label: js.UndefOr[ReactNode] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   name: js.UndefOr[String] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   onMouseDown: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   onMouseUp: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   onParentShouldUpdate: js.UndefOr[Boolean => _] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   onSwitch: js.UndefOr[(ReactEventI, Boolean) => _] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   onTouchEnd: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   onTouchStart: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   required: js.UndefOr[Boolean] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   rippleColor: js.UndefOr[MuiColor] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   rippleStyle: js.UndefOr[js.Any] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   switchElement: js.UndefOr[ReactElement] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   switched: js.UndefOr[Boolean] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   thumbStyle: js.UndefOr[js.Any] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   trackStyle: js.UndefOr[js.Any] = js.undefined,
                   /* (Passed on to EnhancedSwitch)*/
                   value: js.UndefOr[String] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Checkbox, props)
  }


  def MuiCircleRipple(key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      color: js.UndefOr[MuiColor] = js.undefined,
                      /* The material-ui theme applied to this component.*/
                      muiTheme: MuiTheme,
                      opacity: js.UndefOr[Double] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.CircleRipple, props)
  }

  def MuiCircularProgress(
                           key: js.UndefOr[String] = js.undefined,
                           ref: js.UndefOr[String] = js.undefined,
                           /* Override the progress's color.*/
                           color: js.UndefOr[MuiColor] = js.undefined,
                           /* Style for inner wrapper div.*/
                           innerStyle: js.UndefOr[js.Any] = js.undefined,
                           /* The max value of progress, only works in determinate mode.*/
                           max: js.UndefOr[Double] = js.undefined,
                           /* The min value of progress, only works in determinate mode.*/
                           min: js.UndefOr[Double] = js.undefined,
                           /* The mode of show your progress, indeterminate
                         for when there is no value for progress.*/
                           mode: js.UndefOr[DeterminateIndeterminate] = js.undefined,
                           /* The size of the progress.*/
                           size: js.UndefOr[Int] = js.undefined,
                           /* Override the inline-styles of the root element.*/
                           style: js.UndefOr[js.Any] = js.undefined,
                           /* The value of progress, only works in determinate mode.*/
                           value: js.UndefOr[Double] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.CircularProgress, props)
  }

  def MuiDatePicker(
                     key: js.UndefOr[String] = js.undefined,
                     ref: js.UndefOr[MuiDatePickerM => Unit] = js.undefined,
                     /* Constructor for time formatting.
                   Follow this specificaction: ECMAScript Internationalization API 1.0 (ECMA-402).*/
                     DateTimeFormat: js.UndefOr[js.Function] = js.undefined,
                     /* If true, automatically accept and close the picker on select a date.*/
                     autoOk: js.UndefOr[Boolean] = js.undefined,
                     /* Used to control how the DatePicker will be displayed when a user tries to set a date.
                   `dialog` (default) displays the DatePicker as a dialog with a modal.
                   `inline` displays the DatePicker below the input field (similar to auto complete).*/
                     container: js.UndefOr[DialogInline] = js.undefined,
                     cancelLabel: js.UndefOr[ReactNode] = js.undefined,
                     /* This is the initial date value of the component.
                   If either `value` or `valueLink` is provided they will override this
                   prop with `value` taking precedence.*/
                     defaultDate: js.UndefOr[js.Date] = js.undefined,
                     /* Disables the year selection in the date picker.*/
                     disableYearSelection: js.UndefOr[Boolean] = js.undefined,
                     disabled: js.UndefOr[Boolean] = js.undefined,
                     /* Used to change the first day of week. It drastically varies from
                   Saturday to Monday (could even be Friday) between different locales.
                   The allowed range is 0 (Sunday) to 6 (Saturday).*/
                     firstDayOfWeek: js.UndefOr[Double] = js.undefined,
                     /* This function is called to format the date to display in the input box.
                   By default, date objects are formatted to MM/DD/YYYY.*/
                     formatDate: js.UndefOr[js.Date => String] = js.undefined,
                     /* Locale used for formatting date. If you are not using the default value, you
                   have to provide a DateTimeFormat that supports it. You can use Intl.DateTimeFormat
                   if it's supported by your environment.
                   https:github.com/andyearnshaw/Intl.js is a good polyfill.*/
                     locale: js.UndefOr[String] = js.undefined,
                     /* The ending of a range of valid dates. The range includes the endDate.
                   The default value is current date + 100 years.*/
                     maxDate: js.UndefOr[js.Date] = js.undefined,
                     /* The beginning of a range of valid dates. The range includes the startDate.
                   The default value is current date - 100 years.*/
                     minDate: js.UndefOr[js.Date] = js.undefined,
                     /* Tells the component to display the picker in portrait or landscape mode.*/
                     mode: js.UndefOr[PortraitLandscape] = js.undefined,
                     okLabel: js.UndefOr[ReactNode] = js.undefined,
                     /* _ function that is fired when the date value changes. Since there
                   is no particular event associated with the change the first argument
                   will always be null and the second argument will be the new Date instance.*/
                     onChange: js.UndefOr[(js.UndefOr[Nothing], js.Date) => _] = js.undefined,
                     /* Fired when the datepicker dialog is dismissed.*/
                     onDismiss: js.UndefOr[() => _] = js.undefined,
                     /* _ function that is fired when the datepicker field gains focus.*/
                     onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                     /* Fired when the datepicker dialog is shown.*/
                     onShow: js.UndefOr[() => _] = js.undefined,
                     /* Called when touch tap event occurs on text-field.*/
                     onTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                     /* Called during render time of a given day. If this method returns
                   false the day is disabled otherwise it is displayed normally.*/
                     shouldDisableDate: js.UndefOr[js.Date => Boolean] = js.undefined,
                     /* Override the inline-styles of the root element.*/
                     style: js.UndefOr[js.Any] = js.undefined,
                     /* Override the inline-styles of DatePicker's TextField element.*/
                     textFieldStyle: js.UndefOr[js.Any] = js.undefined,
                     /* Sets the date for the Date Picker programmatically.*/
                     value: js.UndefOr[js.Date] = js.undefined,
                     /* Creates a ValueLink with the value of date picker.*/
                     /* Wordings used inside the button of the dialog.*/
                     /* The text string to use for the default value.
                     (Passed on to TextField)*/
                     /* Disables the text field if set to true.
                     (Passed on to TextField)*/
                     /* The style object to use to override error styles.
                     (Passed on to TextField)*/
                     errorStyle: js.UndefOr[js.Any] = js.undefined,
                     /* The error content to display.
                     (Passed on to TextField)*/
                     errorText: js.UndefOr[ReactNode] = js.undefined,
                     /* The style object to use to override floating label styles.
                     (Passed on to TextField)*/
                     floatingLabelStyle: js.UndefOr[js.Any] = js.undefined,
                     /* The content to use for the floating label element.
                     (Passed on to TextField)*/
                     floatingLabelText: js.UndefOr[ReactNode] = js.undefined,
                     /* If true, the field receives the property width 100%.
                     (Passed on to TextField)*/
                     fullWidth: js.UndefOr[Boolean] = js.undefined,
                     /* Override the inline-styles of the TextField's hint text element.
                     (Passed on to TextField)*/
                     hintStyle: js.UndefOr[js.Any] = js.undefined,
                     /* The hint content to display.
                     (Passed on to TextField)*/
                     hintText: js.UndefOr[ReactNode] = js.undefined,
                     /* _ function that is fired when the textfield loses focus.
                     (Passed on to TextField)*/
                     onBlur: js.UndefOr[ReactEventI => _] = js.undefined,
                     /* The function to call when the user presses the Enter key.
                     (Passed on to TextField)*/
                     onEnterKeyDown: js.UndefOr[ReactKeyboardEventI => _] = js.undefined,
                     /* _ function fired when key is pressed down.
                     (Passed on to TextField)*/
                     onKeyDown: js.UndefOr[ReactKeyboardEventH => _] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.DatePicker, props)
  }

  case class Wordings(ok: String, cancel: String) {
    val toJS = JSMacro[Wordings](this)
  }


  def MuiDialog(
                 key: js.UndefOr[String] = js.undefined,
                 ref: js.UndefOr[MuiDialogM => Unit] = js.undefined,
                 /* This prop can be either a JSON object containing the actions to render (This is **DEPRECATED**),
               a react elements, or an array of react elements.*/
                 actions: js.UndefOr[ReactNode] = js.undefined,
                 /* The `className` to add to the actions container's root element.*/
                 actionsContainerClassName: js.UndefOr[String] = js.undefined,
                 /* Overrides the inline-styles of the actions container's root element.*/
                 actionsContainerStyle: js.UndefOr[js.Any] = js.undefined,
                 /* If set to true, the height of the `Dialog` will be auto detected. A max height
               will be enforced so that the content does not extend beyond the viewport.*/
                 autoDetectWindowHeight: js.UndefOr[Boolean] = js.undefined,
                 /* If set to true, the body content of the `Dialog` will be scrollable.*/
                 autoScrollBodyContent: js.UndefOr[Boolean] = js.undefined,
                 /* The `className` to add to the content's root element under the title.*/
                 bodyClassName: js.UndefOr[String] = js.undefined,
                 /* Overrides the inline-styles of the content's root element under the title.*/
                 bodyStyle: js.UndefOr[js.Any] = js.undefined,
                 /* The css class name of the root element.*/
                 className: js.UndefOr[String] = js.undefined,
                 /* The `className` to add to the content container.*/
                 contentClassName: js.UndefOr[String] = js.undefined,
                 /* Overrides the inline-styles of the content container.*/
                 contentStyle: js.UndefOr[js.Any] = js.undefined,
                 /* Force the user to use one of the actions in the `Dialog`.
               Clicking outside the `Dialog` will not trigger the `onRequestClose`.*/
                 modal: js.UndefOr[Boolean] = js.undefined,
                 /* Fired when the `Dialog` is requested to be closed by a click outside the `Dialog` or on the buttons.
               @param {bool} buttonClicked Determines whether a button click triggered this request.*/
                 onRequestClose: js.UndefOr[Boolean => _] = js.undefined,
                 /* Controls whether the Dialog is opened or not.*/
                 open: Boolean,
                 /* The `className` to add to the `Overlay` component that is rendered behind the `Dialog`.*/
                 overlayClassName: js.UndefOr[String] = js.undefined,
                 /* Overrides the inline-styles of the `Overlay` component that is rendered behind the `Dialog`.*/
                 overlayStyle: js.UndefOr[js.Any] = js.undefined,
                 /* Determines whether the `Dialog` should be repositioned when it's contents are updated.*/
                 repositionOnUpdate: js.UndefOr[Boolean] = js.undefined,
                 /* Override the inline-styles of the root element.*/
                 style: js.UndefOr[js.Any] = js.undefined,
                 /* The title to display on the `Dialog`. Could be number, string, element or an array containing these types.*/
                 title: js.UndefOr[ReactNode] = js.undefined,
                 /* The `className` to add to the title's root container element.*/
                 titleClassName: js.UndefOr[String] = js.undefined,
                 /* Overrides the inline-styles of the title's root container element.*/
                 titleStyle: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Dialog, props, children: _*)
  }


  def MuiDivider(
                  key: js.UndefOr[String] = js.undefined,
                  ref: js.UndefOr[String] = js.undefined,

                  /**
                   * CSS class that will be added to the divider's root element
                   */
                  className: js.UndefOr[String] = js.undefined,

                  /**
                   * If true, the divider will be indented 72px
                   */
                  inset: js.UndefOr[Boolean] = js.undefined,

                  /**
                   * Override the inline-styles of the list divider's root element
                   */
                  style: js.UndefOr[js.Any] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Divider, props)
  }

  def MuiDropDownIcon(
                       key: js.UndefOr[String] = js.undefined,
                       ref: js.UndefOr[String] = js.undefined,
                       closeOnMenuItemTouchTap: js.UndefOr[Boolean] = js.undefined,
                       iconClassName: js.UndefOr[String] = js.undefined,
                       iconLigature: js.UndefOr[String] = js.undefined,
                       iconStyle: js.UndefOr[js.Any] = js.undefined,
                       onChange: js.UndefOr[(ReactEventI, Int, js.Any) => _] = js.undefined,
                       /* Override the inline-styles of the root element.*/
                       style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.DropDownIcon, props, children: _*)
  }

  def MuiDropDownMenu(
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
                       listStyle: js.UndefOr[js.Any] = js.undefined,
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
                       value: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.DropDownMenu, props, children: _*)
  }

  case class MuiDropDownMenuItem(payload: String, text: String) {
    val toJS = JSMacro[MuiDropDownMenuItem](this)
  }

  object DropDownMenuItem {
    def fromJson(obj: js.Dynamic) =
      MuiDropDownMenuItem(text = obj.text.toString, payload = obj.payload.toString)
  }


  def MuiDrawer(
                 key: js.UndefOr[String] = js.undefined,
                 ref: js.UndefOr[MuiLeftNavM => Unit] = js.undefined,
                 /* The css class name of the root element.*/
                 className: js.UndefOr[String] = js.undefined,
                 containerClassName: js.UndefOr[String] = js.undefined,
                 containerStyle: js.UndefOr[js.Any] = js.undefined,
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
                 openSecondary: js.UndefOr[Boolean] = js.undefined,
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
                 width: js.UndefOr[Double] = js.undefined,
                 zDepth: js.UndefOr[Int] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Drawer, props, children: _*)
  }

  def MuiFlatButton(
                     key: js.UndefOr[String] = js.undefined,
                     ref: js.UndefOr[String] = js.undefined,
                     /* Color of button when mouse is not hovering over it.*/
                     backgroundColor: js.UndefOr[MuiColor] = js.undefined,
                     /* Disables the button if set to true.*/
                     disabled: js.UndefOr[Boolean] = js.undefined,
                     /* Color of button when mouse hovers over.*/
                     hoverColor: js.UndefOr[MuiColor] = js.undefined,
                     /* URL to link to when button clicked if `linkButton` is set to true.*/
                     href: js.UndefOr[String] = js.undefined,
                     /* Use this property to display an icon.*/
                     icon: js.UndefOr[ReactNode] = js.undefined,
                     /* Label for the button.*/
                     label: js.UndefOr[String] = js.undefined,
                     /* Place label before or after the passed children.*/
                     labelPosition: js.UndefOr[BeforeAfter] = js.undefined,
                     /* Override the inline-styles of the button's label element.*/
                     labelStyle: js.UndefOr[js.Any] = js.undefined,
                     /* Enables use of `href` property to provide a URL to link to if set to true.*/
                     linkButton: js.UndefOr[Boolean] = js.undefined,
                     /* Called when element is focused by the keyboard.*/
                     onKeyboardFocus: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                     /* Called when the mouse enters the element.*/
                     onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                     /* Called when the mouse leaves the element.*/
                     onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                     /* Called when a touch event is started inside the element.*/
                     onTouchStart: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                     /* If true, colors button according to
                   primaryTextColor from the Theme.*/
                     primary: js.UndefOr[Boolean] = js.undefined,
                     /* Color for the ripple after button is clicked.*/
                     rippleColor: js.UndefOr[MuiColor] = js.undefined,
                     /* If true, colors button according to secondaryTextColor from the theme.
                   The primary prop has precendent if set to true.*/
                     secondary: js.UndefOr[Boolean] = js.undefined,
                     /* Override the inline-styles of the root element.*/
                     style: js.UndefOr[js.Any] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     centerRipple: js.UndefOr[Boolean] = js.undefined,
                     /* default: button: This component will render a button element by default and an anchor element if linkButton is set to true. However, you can override this behavior by passing in a string or another react element into this prop. This is useful for generating link buttons with the react router link element.
                     (Passed on to EnhancedButton)*/
                     containerElement: js.UndefOr[String | ReactElement] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     focusRippleColor: js.UndefOr[MuiColor] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     focusRippleOpacity: js.UndefOr[Double] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     keyboardFocused: js.UndefOr[Boolean] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     onKeyDown: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     onKeyUp: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     onTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     tabIndex: js.UndefOr[Double] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     touchRippleColor: js.UndefOr[MuiColor] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     touchRippleOpacity: js.UndefOr[Double] = js.undefined,
                     /* (Passed on to EnhancedButton)*/
                     `type`: js.UndefOr[String] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.FlatButton, props, children: _*)
  }

  def MuiFloatingActionButton(
                               key: js.UndefOr[String] = js.undefined,
                               ref: js.UndefOr[String] = js.undefined,
                               /* This value will override the default background color for the button.
                             However it will not override the default disabled background color.
                             This has to be set separately using the disabledColor attribute.*/
                               backgroundColor: js.UndefOr[MuiColor] = js.undefined,
                               /* Disables the button if set to true.*/
                               disabled: js.UndefOr[Boolean] = js.undefined,
                               /* This value will override the default background color for the button when it is disabled.*/
                               disabledColor: js.UndefOr[MuiColor] = js.undefined,
                               /* URL to link to when button clicked if `linkButton` is set to true.*/
                               href: js.UndefOr[String] = js.undefined,
                               /* The icon within the FloatingActionButton is a FontIcon component.
                             This property is the classname of the icon to be displayed inside the button.
                             An alternative to adding an iconClassName would be to manually insert a
                             FontIcon component or custom SvgIcon component or as a child of FloatingActionButton.*/
                               iconClassName: js.UndefOr[String] = js.undefined,
                               /* This is the equivalent to iconClassName except that it is used for
                             overriding the inline-styles of the FontIcon component.*/
                               iconStyle: js.UndefOr[js.Any] = js.undefined,
                               /* Enables use of `href` property to provide a URL to link to if set to true.*/
                               linkButton: js.UndefOr[Boolean] = js.undefined,
                               /* If true, the button will be a small floating action button.*/
                               mini: js.UndefOr[Boolean] = js.undefined,
                               /* Called when mouse down event occurs on the button.*/
                               onMouseDown: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                               /* Called when mouse enter event occurs on the button.*/
                               onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                               /* Called when mouse leave event occurs on the button.*/
                               onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                               /* Called when mouse up event occurs on the button.*/
                               onMouseUp: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                               /* Called when touch end event occurs on the button.*/
                               onTouchEnd: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                               /* Called when touch start event occurs on the button.*/
                               onTouchStart: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                               /* If true, the button will use the secondary button colors.*/
                               secondary: js.UndefOr[Boolean] = js.undefined,
                               /* Override the inline-styles of the root element.*/
                               style: js.UndefOr[js.Any] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               centerRipple: js.UndefOr[Boolean] = js.undefined,
                               /* default: button: This component will render a button element by default and an anchor element
                             if linkButton is set to true.
                             However, you can override this behavior by passing in a string or another react element into this prop.
                             This is useful for generating link buttons with the react router link element.
                               (Passed on to EnhancedButton)*/
                               containerElement: js.UndefOr[ReactNode] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               focusRippleColor: js.UndefOr[MuiColor] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               focusRippleOpacity: js.UndefOr[Double] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               keyboardFocused: js.UndefOr[Boolean] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               onKeyDown: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               onKeyUp: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               onKeyboardFocus: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               onTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               tabIndex: js.UndefOr[Double] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               touchRippleColor: js.UndefOr[MuiColor] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               touchRippleOpacity: js.UndefOr[Double] = js.undefined,
                               /* (Passed on to EnhancedButton)*/
                               `type`: js.UndefOr[String] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.FloatingActionButton, props, children: _*)
  }

  def MuiFocusRipple(
                      key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      color: js.UndefOr[MuiColor] = js.undefined,
                      innerStyle: js.UndefOr[js.Any] = js.undefined,
                      /* The material-ui theme applied to this component.*/
                      muiTheme: MuiTheme,
                      opacity: js.UndefOr[Double] = js.undefined,
                      show: js.UndefOr[Boolean] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.FocusRipple, props)
  }

  def MuiFontIcon(
                   key: js.UndefOr[String] = js.undefined,
                   ref: js.UndefOr[String] = js.undefined,
                   /* This is the font color of the font icon. If not specified,
                 this component will default to muiTheme.palette.textColor.*/
                   color: js.UndefOr[MuiColor] = js.undefined,
                   /* This is the icon color when the mouse hovers over the icon.*/
                   hoverColor: js.UndefOr[MuiColor] = js.undefined,
                   /* Function called when mouse enters this element.*/
                   onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* Function called when mouse leaves this element.*/
                   onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* Override the inline-styles of the root element.*/
                   style: js.UndefOr[js.Any] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.FontIcon, props)
  }

  def MuiGridList(
                   key: js.UndefOr[String] = js.undefined,
                   ref: js.UndefOr[String] = js.undefined,
                   /* Number of px for one cell height.*/
                   cellHeight: js.UndefOr[Int] = js.undefined,
                   /* Number of columns.*/
                   cols: js.UndefOr[Int] = js.undefined,
                   /* Number of px for the padding/spacing between items.*/
                   padding: js.UndefOr[Int] = js.undefined,
                   /* Override the inline-styles of the root element.*/
                   style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.GridList, props, children: _*)
  }

  def MuiGridTile(
                   key: js.UndefOr[String] = js.undefined,
                   ref: js.UndefOr[String] = js.undefined,
                   /* An IconButton element to be used as secondary action target
                 (primary action target is the tile itself).*/
                   actionIcon: js.UndefOr[ReactElement] = js.undefined,
                   /* Position of secondary action IconButton.*/
                   actionPosition: js.UndefOr[LeftRight] = js.undefined,
                   /* Width of the tile in number of grid cells.*/
                   cols: js.UndefOr[Int] = js.undefined,
                   /* Either a string used as tag name for the tile root element, or a ReactComponent.
                 This is useful when you have, for example, a custom implementation of
                 a navigation link (that knowsabout your routes) and you want to use it as primary tile action.
                 In case you pass a ReactComponent, please make sure that it passes all props,
                 accepts styles overrides and render it's children.*/
                   containerElement: js.UndefOr[String | js.Any] = js.undefined,
                   /* Height of the tile in number of grid cells.*/
                   rows: js.UndefOr[Int] = js.undefined,
                   /* Override the inline-styles of the root element.*/
                   style: js.UndefOr[js.Any] = js.undefined,
                   /* String or element serving as subtitle (support text).*/
                   subtitle: js.UndefOr[ReactNode] = js.undefined,
                   /* Title to be displayed on tile.*/
                   title: js.UndefOr[ReactNode] = js.undefined,
                   /* Style used for title bar background.
                 Useful for setting custom gradients for example*/
                   titleBackground: js.UndefOr[String] = js.undefined,
                   /* Position of the title bar (container of title, subtitle and action icon).*/
                   titlePosition: js.UndefOr[TopBottom] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.GridTile, props, children: _*)
  }


  def MuiIconButton(
                     key: js.UndefOr[String] = js.undefined,
                     ref: js.UndefOr[String] = js.undefined,
                     /* The css class name of the root element.*/
                     className: js.UndefOr[String] = js.undefined,
                     /* Disables the icon button.*/
                     disabled: js.UndefOr[Boolean] = js.undefined,
                     /* If you are using a stylesheet for your
                   icons, enter the class name for the icon to be used here.*/
                     iconClassName: js.UndefOr[String] = js.undefined,
                     /* Overrides the inline-styles of the icon element.*/
                     iconStyle: js.UndefOr[js.Any] = js.undefined,
                     /* _ function for when the component loses focus.*/
                     onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                     /* _ function for when the component gains focus.*/
                     onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                     /* _ function for when the component
                   receives keyboard focus.*/
                     onKeyboardFocus: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                     /* _ function for when mouse enters element.*/
                     onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                     /* _ function for when mouse leaves element.*/
                     onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                     /* Override the inline-styles of the root element.*/
                     style: js.UndefOr[js.Any] = js.undefined,
                     /* The tooltip text to show.*/
                     tooltip: js.UndefOr[ReactNode] = js.undefined,
                     /* Allows the tooltip to be viewed with different
                   alignments: "bottom-center", "top-center",
                   "bottom-right", "top-right", "bottom-left" and "top-left".*/
                     tooltipPosition: js.UndefOr[CornersAndCenter] = js.undefined,
                     /* Styles prop passed down to the tooltip.*/
                     tooltipStyles: js.UndefOr[js.Any] = js.undefined,
                     /* Prop for tooltip to make it larger for mobile.*/
                     touch: js.UndefOr[Boolean] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.IconButton, props, children: _*)
  }

  def MuiIconMenu(
                   key: js.UndefOr[String] = js.undefined,
                   ref: js.UndefOr[String] = js.undefined,
                   /* This is the point on the icon where the menu
                 targetOrigin will stick to.
                 Options:
                 vertical: [top, middle, bottom]
                 horizontal: [left, center, right].*/
                   anchorOrigin: js.UndefOr[Origin] = js.undefined,
                   /* The css class name of the root element.*/
                   className: js.UndefOr[String] = js.undefined,
                   /* This is the IconButton to render. This button will open the menu.*/
                   iconButtonElement: ReactElement,
                   /* The style object to use to override underlying icon style.*/
                   iconStyle: js.UndefOr[js.Any] = js.undefined,
                   /* The style object to use to override underlying menu style.*/
                   menuStyle: js.UndefOr[js.Any] = js.undefined,
                   multiple: js.UndefOr[Boolean] = js.undefined,
                   /* Fired when a menu item is touchTapped.*/
                   onItemTouchTap: js.UndefOr[(ReactTouchEventH, ReactElement) => _] = js.undefined,
                   /* Fired when keyobard focuses on element.*/
                   onKeyboardFocus: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                   /* Fired when mouse is pressed on element.*/
                   onMouseDown: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* Fired when mouse enters the element.*/
                   onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* Fired when mouse leaves the element.*/
                   onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* Fired when mouse is lifted inside the element.*/
                   onMouseUp: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* _ function that is fired when the open state
                 of the menu is requested to be changed. The provided
                 open argument determines whether the menu is requested
                 to be opened or closed. Also, the reason argument states
                 why the menu got closed or opened. It can be 'keyboard',
                 'iconTap' for open action and 'enter', 'escape', 'itemTap',
                 'clickAway' for close action.*/
                   onRequestChange: js.UndefOr[(Boolean, String) => _] = js.undefined,
                   /* Fired when element is touch tapped.*/
                   onTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                   /* Controls whether the IconMenu is opened or not.*/
                   open: js.UndefOr[Boolean] = js.undefined,
                   /* Override the inline-styles of the root element.*/
                   style: js.UndefOr[js.Any] = js.undefined,
                   /* This is the point on the menu which will stick to the menu
                 origin.
                 Options:
                 vertical: [top, middle, bottom]
                 horizontal: [left, center, right].*/
                   targetOrigin: js.UndefOr[Origin] = js.undefined,
                   useLayerForClickAway: js.UndefOr[Boolean] = js.undefined,
                   /* Sets the delay in milliseconds before closing the
                 menu when an item is clicked.*/
                   touchTapCloseDelay: js.UndefOr[Int] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.IconMenu, props, children: _*)
  }


  def MuiLinearProgress(
                         key: js.UndefOr[String] = js.undefined,
                         ref: js.UndefOr[String] = js.undefined,
                         /* The mode of show your progress, indeterminate for
                       when there is no value for progress.*/
                         color: js.UndefOr[MuiColor] = js.undefined,
                         /* The max value of progress, only works in determinate mode.*/
                         max: js.UndefOr[Double] = js.undefined,
                         /* The min value of progress, only works in determinate mode.*/
                         min: js.UndefOr[Double] = js.undefined,
                         /* The mode of show your progress, indeterminate for when
                       there is no value for progress.*/
                         mode: js.UndefOr[DeterminateIndeterminate] = js.undefined,
                         /* Override the inline-styles of the root element.*/
                         style: js.UndefOr[js.Any] = js.undefined,
                         /* The value of progress, only works in determinate mode.*/
                         value: js.UndefOr[Double] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.LinearProgress, props)
  }

  def MuiList(
               key: js.UndefOr[String] = js.undefined,
               ref: js.UndefOr[String] = js.undefined,
               /* Override the inline-styles of the root element.*/
               style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.List, props, children: _*)
  }

  def MuiListItem(
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
                   style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.ListItem, props, children: _*)
  }

  def MuiMenu(
               key: js.UndefOr[String] = js.undefined,
               ref: js.UndefOr[String] = js.undefined,
               /* If true, the width will automatically be
             set according to the items inside the menu
             using the proper keyline increment.*/
               autoWidth: js.UndefOr[Boolean] = js.undefined,
               /* Indicates if the menu should render with compact desktop styles.*/
               desktop: js.UndefOr[Boolean] = js.undefined,
               /* True if this item should be focused by the keyboard initially.*/
               initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined,
               /* The style object to use to override underlying list style.*/
               listStyle: js.UndefOr[js.Any] = js.undefined,
               /* The maxHeight of the menu in pixels. If
             specified, the menu will scroll if larger than the maxHeight.*/
               maxHeight: js.UndefOr[Int] = js.undefined,
               /* If true, the value can an array and allow the menu to be a multi-select.*/
               multiple: js.UndefOr[Boolean] = js.undefined,
               /* Fired when a menu item is touchTapped and the menu item
             value is not equal to the current menu value.*/
               onChange: js.UndefOr[(ReactEventH, js.Any) => _] = js.undefined,
               /* Fired when an Esc key is keyed down.*/
               onEscKeyDown: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
               /* Fired when a menu item is touchTapped.*/
               onItemTouchTap: js.UndefOr[(ReactUIEventH, ReactElementM[MuiMenuItemProps, _], Int) => _] = js.undefined,
               /* Fired when a key is pressed.*/
               onKeyDown: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
               /* This is the placement of the menu relative to the IconButton.*/
               openDirection: js.UndefOr[String] = js.undefined,
               /* Style for the selected Menu Item.*/
               selectedMenuItemStyle: js.UndefOr[js.Any] = js.undefined,
               /* Override the inline-styles of the root element.*/
               style: js.UndefOr[js.Any] = js.undefined,
               /* The value of the selected menu item. If passed in,
             this will make the menu a controlled component.
             This component also supports valueLink.*/
               value: js.UndefOr[String | js.Array[String]] = js.undefined,
               /* ValueLink for this component when controlled.*/
               valueLink: js.UndefOr[js.Any] = js.undefined,
               /* Sets the width of the menu. If not specified, the menu
             width will be dictated by its children. The rendered
             width will always be a keyline increment
             (64px for desktop, 56px otherwise).*/
               width: js.UndefOr[String | Double] = js.undefined,
               /* Sets the width of the menu. If not specified,
             the menu width will be dictated by its children.
             The rendered width will always be a keyline increment
             (64px for desktop, 56px otherwise).*/
               zDepth: js.UndefOr[ZDepth] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Menu, props, children: _*)
  }


  def MuiMenuItem(
                   key: js.UndefOr[String] = js.undefined,
                   ref: js.UndefOr[String] = js.undefined,
                   /* If true, a left check mark will be rendered.*/
                   checked: js.UndefOr[Boolean] = js.undefined,
                   /* Disables a menu item.*/
                   disabled: js.UndefOr[Boolean] = js.undefined,
                   /* Prop passed down to ListItem that tells it what kind of focus it has.*/
                   focusState: js.UndefOr[NoneFocusedKeyboard_focused] = js.undefined,
                   /* Style overrides for the inner div.*/
                   innerDivStyle: js.UndefOr[js.Any] = js.undefined,
                   /* If true, the children will be indented.
                 Only needed when there is no leftIcon.*/
                   insetChildren: js.UndefOr[Boolean] = js.undefined,
                   /* This is the SvgIcon or FontIcon to be displayed on the left side.*/
                   leftIcon: js.UndefOr[ReactElement] = js.undefined,
                   /* Nested MenuItems for this MenuItem. Used to make nested menus.*/
                   menuItems: js.UndefOr[ReactNode] = js.undefined,
                   /* Fired when the element is touchTapped.*/
                   onTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                   /* This is the SvgIcon or FontIcon to be displayed on the right side.*/
                   rightIcon: js.UndefOr[ReactElement] = js.undefined,
                   /* This is the block element that contains the secondary text.
                 If a string is passed in, a div tag will be rendered.*/
                   secondaryText: js.UndefOr[ReactNode] = js.undefined,
                   /* Override the inline-styles of the root element.*/
                   style: js.UndefOr[js.Any] = js.undefined,
                   /* The value of the menu item.*/
                   value: js.UndefOr[js.Any] = js.undefined,
                   /* Generate a nested list indicator icon when
                 nested list items are detected. Set to false
                 if you do not want an indicator auto-generated.
                 Note that an indicator will not be created if a
                 rightIcon/Button has been specified.
                   (Passed on to ListItem)*/
                   autoGenerateNestedIndicator: js.UndefOr[Boolean] = js.undefined,
                   /* Does not allow the element to be focused by the keyboard.
                   (Passed on to ListItem)*/
                   disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
                   /* Controls whether or not the child ListItems are initially displayed.
                   (Passed on to ListItem)*/
                   initiallyOpen: js.UndefOr[Boolean] = js.undefined,
                   /* This is the Avatar element to be displayed on the left side.
                   (Passed on to ListItem)*/
                   leftAvatar: js.UndefOr[ReactElement] = js.undefined,
                   /* This is the Checkbox element to be displayed on the left side.
                   (Passed on to ListItem)*/
                   leftCheckbox: js.UndefOr[ReactElement] = js.undefined,
                   /* An array of ListItems to nest underneath the current ListItem.
                   (Passed on to ListItem)*/
                   nestedItems: js.UndefOr[js.Array[ReactElement]] = js.undefined,
                   /* Controls how deep a ListItem appears.
                 This property is automatically managed so modify at your own risk.
                   (Passed on to ListItem)*/
                   nestedLevel: js.UndefOr[Int] = js.undefined,
                   /* Override the inline-styles of the nestedItems NestedList.
                   (Passed on to ListItem)*/
                   nestedListStyle: js.UndefOr[js.Any] = js.undefined,
                   /* Called when the ListItem has keyboard focus.
                   (Passed on to ListItem)*/
                   onKeyboardFocus: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                   /* Called when the mouse is over the ListItem.
                   (Passed on to ListItem)*/
                   onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* Called when the mouse is no longer over the ListItem.
                   (Passed on to ListItem)*/
                   onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                   /* Called when the ListItem toggles its nested ListItems.
                   (Passed on to ListItem)*/
                   onNestedListToggle: js.UndefOr[js.Any => _] = js.undefined,
                   /* Called when touches start.
                   (Passed on to ListItem)*/
                   onTouchStart: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                   /* This is the block element that contains the primary text.
                 If a string is passed in, a div tag will be rendered.
                   (Passed on to ListItem)*/
                   primaryText: js.UndefOr[ReactNode] = js.undefined,
                   /* If provided, tapping on the primary text
                 of the item toggles the nested list.
                   (Passed on to ListItem)*/
                   primaryTogglesNestedList: js.UndefOr[Boolean] = js.undefined,
                   /* This is the avatar element to be displayed on the right side.
                   (Passed on to ListItem)*/
                   rightAvatar: js.UndefOr[ReactElement] = js.undefined,
                   /* This is the IconButton to be displayed on the right side.
                 Hovering over this button will remove the ListItem hover.
                 Also, clicking on this button will not trigger a
                 ListItem ripple. The event will be stopped and prevented
                 from bubbling up to cause a ListItem click.
                   (Passed on to ListItem)*/
                   rightIconButton: js.UndefOr[ReactElement] = js.undefined,
                   /* This is the Toggle element to display on the right side.
                   (Passed on to ListItem)*/
                   rightToggle: js.UndefOr[ReactElement] = js.undefined,
                   /* Can be 1 or 2. This is the number of secondary
                 text lines before ellipsis will show.
                   (Passed on to ListItem)*/
                   secondaryTextLines: js.UndefOr[_1_2] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.MenuItem, props, children: _*)
  }

  def MuiOverlay(
                  key: js.UndefOr[String] = js.undefined,
                  ref: js.UndefOr[String] = js.undefined,
                  autoLockScrolling: js.UndefOr[Boolean] = js.undefined,
                  show: Boolean,
                  /* Override the inline-styles of the root element.*/
                  style: js.UndefOr[js.Any] = js.undefined,
                  transitionEnabled: js.UndefOr[Boolean] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Overlay, props)
  }

  def MuiPaper(
                key: js.UndefOr[String] = js.undefined,
                ref: js.UndefOr[String] = js.undefined,
                /* Set to true to generate a circlular paper container.*/
                circle: js.UndefOr[Boolean] = js.undefined,
                /* By default, the paper container will have a border radius.
              Set this to false to generate a container with sharp corners.*/
                rounded: js.UndefOr[Boolean] = js.undefined,
                /* Override the inline-styles of the root element.*/
                style: js.UndefOr[js.Any] = js.undefined,
                /* Set to false to disable CSS transitions for the paper element.*/
                transitionEnabled: js.UndefOr[Boolean] = js.undefined,
                /* This number represents the zDepth of the paper shadow.*/
                zDepth: js.UndefOr[ZDepth] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Paper, props, children: _*)
  }


  def MuiPopover(
                  key: js.UndefOr[String] = js.undefined,
                  ref: js.UndefOr[String] = js.undefined,
                  /* This is the DOM element that will be used to set the position of the
                component.*/
                  anchorEl: js.UndefOr[js.Any] = js.undefined,
                  /* This is the point on the anchor where the popover
                targetOrigin will stick to.
                Options:
                vertical: [top, middle, bottom]
                horizontal: [left, center, right]*/
                  anchorOrigin: js.UndefOr[Origin] = js.undefined,
                  /* If true, the popover will apply transitions when
                added it gets added to the DOM.*/
                  animated: js.UndefOr[Boolean] = js.undefined,
                  /* Override the default animation component used.*/
                  animation: js.UndefOr[js.Any] = js.undefined,
                  /* If true, the popover will hide when the anchor scrolls off the screen*/
                  autoCloseWhenOffScreen: js.UndefOr[Boolean] = js.undefined,
                  /* If true, the popover (potentially) ignores targetOrigin
                and anchorOrigin to make itself fit on screen,
                which is useful for mobile devices.*/
                  canAutoPosition: js.UndefOr[Boolean] = js.undefined,
                  /* The css class name of the root element.*/
                  className: js.UndefOr[String] = js.undefined,
                  /* This is a _ that fires when the popover
                thinks it should close. (e.g. clickAway or offScreen)
                @param {string} reason Determines what triggered this request.*/
                  onRequestClose: js.UndefOr[String => _] = js.undefined,
                  /* Controls the visibility of the popover.*/
                  open: js.UndefOr[Boolean] = js.undefined,
                  /* Override the inline-styles of the root element.*/
                  style: js.UndefOr[js.Any] = js.undefined,
                  /* This is the point on the popover which will stick to
                the anchors origin.
                Options:
                vertical: [top, middle, bottom]
                horizontal: [left, center, right]*/
                  targetOrigin: js.UndefOr[Origin] = js.undefined,
                  /* If true, the popover will render on top of an invisible
                layer, which will prevent clicks to the underlying
                elements, and trigger an onRequestClose(clickAway) event.*/
                  useLayerForClickAway: js.UndefOr[Boolean] = js.undefined,
                  /* This number represents the zDepth of the paper shadow.*/
                  zDepth: js.UndefOr[ZDepth] = js.undefined)(children: js.UndefOr[ReactNode] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    if (children.isDefined) React.createElement(Mui.Popover, props, children.get)
    else React.createElement(Mui.Popover, props)
  }

  def MuiRadioButton(
                      key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      /* Used internally by `RadioButtonGroup`.
                    Checked if true.*/
                      checked: js.UndefOr[Boolean] = js.undefined,
                      /* Disabled if true.*/
                      disabled: js.UndefOr[Boolean] = js.undefined,
                      /* Overrides the inline-styles of the icon element.*/
                      iconStyle: js.UndefOr[js.Any] = js.undefined,
                      /* Overrides the inline-styles of the RadioButton element label.*/
                      labelStyle: js.UndefOr[js.Any] = js.undefined,
                      /* _ function for checked event.*/
                      onCheck: js.UndefOr[(ReactEventH, Boolean) => _] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined,
                      uncheckedIcon: js.UndefOr[ReactElement] = js.undefined,
                      /* The value of our radio button component.*/
                      value: js.UndefOr[String] = js.undefined,
                      /* The css class name of the root element.
                      (Passed on to EnhancedSwitch)*/
                      className: js.UndefOr[String] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      defaultSwitched: js.UndefOr[Boolean] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      id: js.UndefOr[String] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      inputType: js.UndefOr[String] = js.undefined,
                      /* The text that is displayed beside the radio button.
                      (Passed on to EnhancedSwitch)*/
                      label: js.UndefOr[ReactNode] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      name: js.UndefOr[String] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      onMouseDown: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      onMouseUp: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      onParentShouldUpdate: js.UndefOr[Boolean => _] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      onSwitch: js.UndefOr[(ReactEventI, Boolean) => _] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      onTouchEnd: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      onTouchStart: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      required: js.UndefOr[Boolean] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      rippleColor: js.UndefOr[MuiColor] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      rippleStyle: js.UndefOr[js.Any] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      switchElement: js.UndefOr[ReactElement] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      switched: js.UndefOr[Boolean] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      thumbStyle: js.UndefOr[js.Any] = js.undefined,
                      /* (Passed on to EnhancedSwitch)*/
                      trackStyle: js.UndefOr[js.Any] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.RadioButton, props)
  }

  def MuiRadioButtonGroup(
                           key: js.UndefOr[String] = js.undefined,
                           ref: js.UndefOr[MuiRadioButtonGroupM => Unit] = js.undefined,
                           /* The css class name of the root element.*/
                           className: js.UndefOr[String] = js.undefined,
                           /* Sets the default radio button to be the one whose
                         value matches defaultSelected (case-sensitive).
                         This will override any individual radio button with
                         the defaultChecked or checked property stated.*/
                           defaultSelected: js.UndefOr[String] = js.undefined,
                           /* Where the label will be placed for all radio buttons.
                         This will override any labelPosition properties defined
                         for an individual radio button.*/
                           labelPosition: js.UndefOr[LeftRight] = js.undefined,
                           /* The name that will be applied to all radio buttons inside it.*/
                           name: String,
                           /* _ function that is fired when a radio button has
                         been clicked. Returns the event and the value of the radio
                         button that has been selected.*/
                           onChange: js.UndefOr[(ReactEventI, String) => _] = js.undefined,
                           /* Override the inline-styles of the root element.*/
                           style: js.UndefOr[js.Any] = js.undefined,
                           /* The value of the currently selected radio button.*/
                           valueSelected: js.UndefOr[String] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.RadioButtonGroup, props, children: _*)
  }


  def MuiRaisedButton(
                       key: js.UndefOr[String] = js.undefined,
                       ref: js.UndefOr[String] = js.undefined,
                       /* Override the background color. Always takes precedence unless the button is disabled.*/
                       backgroundColor: js.UndefOr[MuiColor] = js.undefined,
                       /* The css class name of the root element.*/
                       className: js.UndefOr[String] = js.undefined,
                       /* Disables the button if set to true.*/
                       disabled: js.UndefOr[Boolean] = js.undefined,
                       /* Override the background color if the button is disabled.*/
                       disabledBackgroundColor: js.UndefOr[MuiColor] = js.undefined,
                       /* Color of the label if disabled is true.*/
                       disabledLabelColor: js.UndefOr[MuiColor] = js.undefined,
                       /* If true, then the button will take up the full
                     width of its container.*/
                       fullWidth: js.UndefOr[Boolean] = js.undefined,
                       /* URL to link to when button clicked if `linkButton` is set to true.*/
                       href: js.UndefOr[String] = js.undefined,
                       /* Use this property to display an icon.*/
                       icon: js.UndefOr[ReactNode] = js.undefined,
                       /* The label for the button.*/
                       label: js.UndefOr[String] = js.undefined,
                       /* The color of the label for the button.*/
                       labelColor: js.UndefOr[MuiColor] = js.undefined,
                       /* Place label before or after the passed children.*/
                       labelPosition: js.UndefOr[BeforeAfter] = js.undefined,
                       /* Override the inline-styles of the button's label element.*/
                       labelStyle: js.UndefOr[js.Any] = js.undefined,
                       /* Enables use of `href` property to provide a URL to link to if set to true.*/
                       linkButton: js.UndefOr[Boolean] = js.undefined,
                       /* _ function for when the mouse is pressed down inside this element.*/
                       onMouseDown: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                       /* _ function for when the mouse enters this element.*/
                       onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                       /* _ function for when the mouse leaves this element.*/
                       onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                       /* _ function for when the mouse is realeased
                     above this element.*/
                       onMouseUp: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                       /* _ function for when a touchTap event ends.*/
                       onTouchEnd: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                       /* _ function for when a touchTap event starts.*/
                       onTouchStart: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                       /* If true, colors button according to
                     primaryTextColor from the Theme.*/
                       primary: js.UndefOr[Boolean] = js.undefined,
                       /* If true, colors button according to secondaryTextColor from the theme.
                     The primary prop has precendent if set to true.*/
                       secondary: js.UndefOr[Boolean] = js.undefined,
                       /* Override the inline-styles of the root element.*/
                       style: js.UndefOr[js.Any] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       centerRipple: js.UndefOr[Boolean] = js.undefined,
                       /* default: button: This component will render a button element by default and an anchor element if linkButton is set to true. However, you can override this behavior by passing in a string or another react element into this prop. This is useful for generating link buttons with the react router link element.
                       (Passed on to EnhancedButton)*/
                       containerElement: js.UndefOr[ReactNode] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       focusRippleColor: js.UndefOr[MuiColor] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       focusRippleOpacity: js.UndefOr[Double] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       keyboardFocused: js.UndefOr[Boolean] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       onKeyDown: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       onKeyUp: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       onKeyboardFocus: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       onTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       tabIndex: js.UndefOr[Double] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       touchRippleColor: js.UndefOr[MuiColor] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       touchRippleOpacity: js.UndefOr[Double] = js.undefined,
                       /* (Passed on to EnhancedButton)*/
                       `type`: js.UndefOr[String] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.RaisedButton, props, children: _*)
  }


  def MuiRefreshIndicator(
                           key: js.UndefOr[String] = js.undefined,
                           ref: js.UndefOr[String] = js.undefined,
                           /* Override the theme's color of the indicator while it's status is
                         "ready" and it's percentage is less than 100.*/
                           color: js.UndefOr[MuiColor] = js.undefined,
                           /* The absolute left position of the indicator in pixels.*/
                           left: Int,
                           /* Override the theme's color of the indicator while
                         it's status is "loading" or when it's percentage is 100.*/
                           loadingColor: js.UndefOr[MuiColor] = js.undefined,
                           /* The confirmation progress to fetch data. Max value is 100.*/
                           percentage: js.UndefOr[Double] = js.undefined,
                           /* Size in pixels.*/
                           size: js.UndefOr[Int] = js.undefined,
                           /* The display status of the indicator. If the status is
                         "ready", the indicator will display the ready state
                         arrow. If the status is "loading", it will display
                         the loading progress indicator. If the status is "hide",
                         the indicator will be hidden.*/
                           status: js.UndefOr[ReadyLoadingHide] = js.undefined,
                           /* Override the inline-styles of the root element.*/
                           style: js.UndefOr[js.Any] = js.undefined,
                           /* The absolute top position of the indicator in pixels.*/
                           top: Int): ReactElement = {
    val props = FunctionMacro()

    React.createElement(Mui.RefreshIndicator, props)
  }

  def MuiSelectField(
                      key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      /* The width will automatically be set according to the
                    items inside the menu. To control this width in css
                    instead, set this prop to `false`.*/
                      autoWidth: js.UndefOr[Boolean] = js.undefined,
                      /* Disables the select field if set to true.*/
                      disabled: js.UndefOr[Boolean] = js.undefined,
                      /* The style object to use to override error styles.*/
                      errorStyle: js.UndefOr[js.Any] = js.undefined,
                      /* The error content to display.*/
                      errorText: js.UndefOr[ReactNode] = js.undefined,
                      /* The style object to use to override floating label styles.*/
                      floatingLabelStyle: js.UndefOr[js.Any] = js.undefined,
                      /* The content to use for the floating label element.*/
                      floatingLabelText: js.UndefOr[ReactNode] = js.undefined,
                      /* If true, the field receives the property width 100%.*/
                      fullWidth: js.UndefOr[Boolean] = js.undefined,
                      /* The style object to use to override hint styles.*/
                      hintStyle: js.UndefOr[js.Any] = js.undefined,
                      /* The hint content to display.*/
                      hintText: js.UndefOr[ReactNode] = js.undefined,
                      /* Overrides the styles of the icon element.*/
                      iconStyle: js.UndefOr[js.Any] = js.undefined,
                      id: js.UndefOr[String] = js.undefined,
                      /* Overrides the styles of label when the `SelectField` is inactive.*/
                      labelStyle: js.UndefOr[js.Any] = js.undefined,
                      /* _ function that is fired when the `SelectField` loses focus.*/
                      onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                      /* _ function that is fired when the value changes.*/
                      onChange: js.UndefOr[(ReactEventI, Int, js.Any) => _] = js.undefined,
                      /* _ function that is fired when the `SelectField` gains focus.*/
                      onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                      /* The style object to use to override the `DropDownMenu`.*/
                      selectFieldRoot: js.UndefOr[js.Any] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined,
                      /* Override the inline-styles of the underline element when disabled.*/
                      underlineDisabledStyle: js.UndefOr[js.Any] = js.undefined,
                      /* Override the inline-styles of the underline element when focused.*/
                      underlineFocusStyle: js.UndefOr[js.Any] = js.undefined,
                      /* Overrides the styles of the underline element.*/
                      underlineStyle: js.UndefOr[js.Any] = js.undefined,
                      /* The value that is currently selected.*/
                      value: js.UndefOr[js.Any] = js.undefined,
                      /* The css class name of the root element.
                      (Passed on to DropDownMenu)*/
                      className: js.UndefOr[String] = js.undefined,
                      /* The maximum height of the `Menu` when it is displayed.
                      (Passed on to DropDownMenu)*/
                      maxHeight: js.UndefOr[Int] = js.undefined,
                      /* Overrides the styles of `Menu` when the `DropDownMenu` is displayed.
                      (Passed on to DropDownMenu)*/
                      menuStyle: js.UndefOr[js.Any] = js.undefined,
                      /* Set to true to have the `DropDownMenu` automatically open on mount.
                      (Passed on to DropDownMenu)*/
                      openImmediately: js.UndefOr[Boolean] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.SelectField, props, children: _*)
  }

  case class MuiSelectItem(payload: String, text: String) {
    val toJS = JSMacro[MuiSelectItem](this)
  }


  def MuiSnackbar(
                   key: js.UndefOr[String] = js.undefined,
                   ref: js.UndefOr[MuiSnackbarM => Unit] = js.undefined,
                   /* The label for the action on the snackbar.*/
                   action: js.UndefOr[String] = js.undefined,
                   /* The number of milliseconds to wait before automatically dismissing.
                 If no value is specified the snackbar will dismiss normally.
                 If a value is provided the snackbar can still be dismissed normally.
                 If a snackbar is dismissed before the timer expires, the timer will be cleared.*/
                   autoHideDuration: js.UndefOr[Int] = js.undefined,
                   /* Override the inline-styles of the body element.*/
                   bodyStyle: js.UndefOr[js.Any] = js.undefined,
                   /* The css class name of the root element.*/
                   className: js.UndefOr[String] = js.undefined,
                   /* The message to be displayed.*/
                   message: ReactNode,
                   /* Fired when the action button is touchtapped.
                 @param {object} event Action button event.*/
                   onActionTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                   onDismiss: js.UndefOr[() => _] = js.undefined,
                   /* Fired when the `Snackbar` is requested to be closed by a click outside the `Snackbar`, or after the
                 `autoHideDuration` timer expires.
                 Typically `onRequestClose` is used to set state in the parent component, which is used to control the `Snackbar`
                 `open` prop.
                 The `reason` parameter can optionally be used to control the response to `onRequestClose`,
                 for example ignoring `clickaway`.
                 @param {string} reason Can be:`"timeout"` (`autoHideDuration` expired) or: `"clickaway"`*/
                   onRequestClose: String => _,
                   /* Controls whether the `Snackbar` is opened or not.*/
                   open: Boolean,
                   /* Override the inline-styles of the root element.*/
                   style: js.UndefOr[js.Any] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Snackbar, props)
  }


  def MuiTable(
                key: js.UndefOr[String] = js.undefined,
                ref: js.UndefOr[TableM => _] = js.undefined,
                /* Set to true to indicate that all rows should be selected.*/
                allRowsSelected: js.UndefOr[Boolean] = js.undefined,
                /* Override the inline-styles of the body's table element.*/
                bodyStyle: js.UndefOr[js.Any] = js.undefined,
                /* The css class name of the root element.*/
                className: js.UndefOr[String] = js.undefined,
                /* If true, the footer will appear fixed below the table.
              The default value is true.*/
                fixedFooter: js.UndefOr[Boolean] = js.undefined,
                /* If true, the header will appear fixed above the table.
              The default value is true.*/
                fixedHeader: js.UndefOr[Boolean] = js.undefined,
                /* Override the inline-styles of the footer's table element.*/
                footerStyle: js.UndefOr[js.Any] = js.undefined,
                /* Override the inline-styles of the header's table element.*/
                headerStyle: js.UndefOr[js.Any] = js.undefined,
                /* The height of the table.*/
                height: js.UndefOr[String] = js.undefined,
                /* If true, multiple table rows can be selected.
              CTRL/CMD+Click and SHIFT+Click are valid actions.
              The default value is false.*/
                multiSelectable: js.UndefOr[Boolean] = js.undefined,
                /* Called when a row cell is clicked.
              rowNumber is the row number and columnId is
              the column number or the column key.*/
                onCellClick: js.UndefOr[(Int, Int | String, ReactEventH) => _] = js.undefined,
                /* Called when a table cell is hovered.
              rowNumber is the row number of the hovered row
              and columnId is the column number or the column key of the cell.*/
                onCellHover: js.UndefOr[(Int, Int | String, ReactEventH) => _] = js.undefined,
                /* Called when a table cell is no longer hovered.
              rowNumber is the row number of the row and columnId
              is the column number or the column key of the cell.*/
                onCellHoverExit: js.UndefOr[(Int, Int | String, ReactEventH) => _] = js.undefined,
                /* Called when a table row is hovered.
              rowNumber is the row number of the hovered row.*/
                onRowHover: js.UndefOr[Int => _] = js.undefined,
                /* Called when a table row is no longer hovered.
              rowNumber is the row number of the row that is no longer hovered.*/
                onRowHoverExit: js.UndefOr[Int => _] = js.undefined,
                /* Called when a row is selected.
              selectedRows is an array of all row selections.
              IF all rows have been selected, the string "all"
              will be returned instead to indicate that all rows have been selected.*/
                onRowSelection: js.UndefOr[String | js.Array[Int] => _] = js.undefined,
                /* If true, table rows can be selected.
              If multiple row selection is desired, enable multiSelectable.
              The default value is true.*/
                selectable: js.UndefOr[Boolean] = js.undefined,
                /* Override the inline-styles of the root element.*/
                style: js.UndefOr[js.Any] = js.undefined,
                /* Override the inline-styles of the table's wrapper element.*/
                wrapperStyle: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Table, props, children: _*)
  }


  def MuiTableBody(
                    key: js.UndefOr[String] = js.undefined,
                    ref: js.UndefOr[String] = js.undefined,
                    className: js.UndefOr[String] = js.undefined,
                    /* Controls whether or not to deselect all selected
                    rows after clicking outside the table.*/
                    deselectOnClickaway: js.UndefOr[Boolean] = js.undefined,
                    /* Controls the display of the row checkbox. The default value is true.*/
                    displayRowCheckbox: js.UndefOr[Boolean] = js.undefined,
                    /* Controls whether or not the rows are pre-scanned to determine
                     initial state. If your table has a large number of rows and
                      you are experiencing a delay in rendering, turn off this property.*/
                    preScanRows: js.UndefOr[Boolean] = js.undefined,
                    /* If true, table rows will be highlighted when
                       the cursor is hovering over the row. The default
                    value is false.*/
                    showRowHover: js.UndefOr[Boolean] = js.undefined,
                    /* If true, every other table row starting
                    with the first row will be striped. The default value is false.*/
                    stripedRows: js.UndefOr[Boolean] = js.undefined,
                    /* Override the inline-styles of the root element.*/
                    style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.TableBody, props, children: _*)
  }

  def MuiTableFooter(
                      key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      /* The css class name of the root element.*/
                      className: js.UndefOr[String] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.TableFooter, props, children: _*)
  }


  def MuiTableHeader(
                      key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      /* Controls whether or not header rows should be
                    adjusted for a checkbox column. If the select all
                    checkbox is true, this property will not influence
                    the number of columns. This is mainly useful for
                    "super header" rows so that the checkbox column
                    does not create an offset that needs to be accounted
                    for manually.*/
                      adjustForCheckbox: js.UndefOr[Boolean] = js.undefined,
                      /* The css class name of the root element.*/
                      className: js.UndefOr[String] = js.undefined,
                      /* Controls whether or not the select all checkbox is displayed.*/
                      displaySelectAll: js.UndefOr[Boolean] = js.undefined,
                      /* If set to true, the select all button will be interactable.
                    If set to false, the button will not be interactable.
                    To hide the checkbox, set displaySelectAll to false.*/
                      enableSelectAll: js.UndefOr[Boolean] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.TableHeader, props, children: _*)
  }

  def MuiTableHeaderColumn(
                            key: js.UndefOr[String] = js.undefined,
                            ref: js.UndefOr[String] = js.undefined,
                            /* The css class name of the root element.*/
                            className: js.UndefOr[String] = js.undefined,
                            /* Number to identify the header row. This property
                          is automatically populated when used with TableHeader.*/
                            columnNumber: js.UndefOr[Int] = js.undefined,
                            /* Override the inline-styles of the root element.*/
                            style: js.UndefOr[js.Any] = js.undefined,
                            /* The string to supply to the tooltip. If not
                          string is supplied no tooltip will be shown.*/
                            tooltip: js.UndefOr[String] = js.undefined,
                            /* Additional styling that can be applied to the tooltip.*/
                            tooltipStyle: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.TableHeaderColumn, props, children: _*)
  }

  def MuiTableRow(
                   key: js.UndefOr[String] = js.undefined,
                   ref: js.UndefOr[String] = js.undefined,
                   /* The css class name of the root element.*/
                   className: js.UndefOr[String] = js.undefined,
                   /* If true, row border will be displayed for the row.
                 If false, no border will be drawn.*/
                   displayBorder: js.UndefOr[Boolean] = js.undefined,
                   /* Controls whether or not the row reponseds to hover events.*/
                   hoverable: js.UndefOr[Boolean] = js.undefined,
                   hovered: js.UndefOr[Boolean] = js.undefined,
                   /* Number to identify the row. This property is
                 automatically populated when used with the TableBody component.*/
                   rowNumber: js.UndefOr[Int] = js.undefined,
                   /* If true, table rows can be selected. If multiple row
                 selection is desired, enable multiSelectable.
                 The default value is true.*/
                   selectable: js.UndefOr[Boolean] = js.undefined,
                   /* Indicates that a particular row is selected.
                 This property can be used to programmatically select rows.*/
                   selected: js.UndefOr[Boolean] = js.undefined,
                   /* Indicates whether or not the row is striped.*/
                   striped: js.UndefOr[Boolean] = js.undefined,
                   /* Override the inline-styles of the root element.*/
                   style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.TableRow, props, children: _*)
  }

  def MuiTableRowColumn(
                         key: js.UndefOr[String] = js.undefined,
                         ref: js.UndefOr[String] = js.undefined,
                         /* The css class name of the root element.*/
                         className: js.UndefOr[String] = js.undefined,
                         /* Override the inline-styles of the root element.*/
                         style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.TableRowColumn, props, children: _*)
  }

  def MuiTabs(
               key: js.UndefOr[String] = js.undefined,
               ref: js.UndefOr[String] = js.undefined,
               /* The css class name of the root element.*/
               className: js.UndefOr[String] = js.undefined,
               /* The css class name of the content's container.*/
               contentContainerClassName: js.UndefOr[String] = js.undefined,
               /* Override the inline-styles of the content's container.*/
               contentContainerStyle: js.UndefOr[js.Any] = js.undefined,
               /* Specify initial visible tab index.
             Initial selected index is set by default to 0.
             If initialSelectedIndex is set but larger than the total amount of specified tabs,
             initialSelectedIndex will revert back to default.*/
               initialSelectedIndex: js.UndefOr[Int] = js.undefined,
               /* Override the inline-styles of the InkBar.*/
               inkBarStyle: js.UndefOr[js.Any] = js.undefined,
               /* Called when the selected value change.*/
               onChange: js.UndefOr[(String, ReactEventH, ReactElement) => _] = js.undefined,
               /* Override the inline-styles of the root element.*/
               style: js.UndefOr[js.Any] = js.undefined,
               /* Override the inline-styles of the tab-labels container.*/
               tabItemContainerStyle: js.UndefOr[js.Any] = js.undefined,
               /* Override the default tab template used to wrap the content of each tab element.*/
               tabTemplate: js.UndefOr[js.Any] = js.undefined,
               /* Makes Tabs controllable and selects the tab whose value prop matches this prop.*/
               value: js.UndefOr[String] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Tabs, props, children: _*)
  }


  def MuiTab(
              key: js.UndefOr[String] = js.undefined,
              ref: js.UndefOr[String] = js.undefined,
              /* The css class name of the root element.*/
              className: js.UndefOr[String] = js.undefined,
              icon: js.UndefOr[ReactNode] = js.undefined,
              /* Sets the text value of the tab item to the string specified.*/
              label: js.UndefOr[ReactNode] = js.undefined,
              /* Fired when the active tab changes by touch or tap.
            Use this event to specify any functionality when an active tab changes.
            For example - we are using this to route to home when the third tab becomes active.
            This function will always recieve the active tab as it\'s first argument.*/
              onActive: js.UndefOr[ReactElement => _] = js.undefined,
              /* Override the inline-styles of the root element.*/
              style: js.UndefOr[js.Any] = js.undefined,
              /* If value prop passed to Tabs component, this value prop is also required.
            It assigns a value to the tab so that it can be selected by the Tabs.*/
              value: js.UndefOr[String] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Tab, props, children: _*)
  }

  def MuiTextField(
                    key: js.UndefOr[String] = js.undefined,
                    ref: js.UndefOr[MuiTextFieldM => Unit] = js.undefined,
                    /* The css class name of the root element.*/
                    className: js.UndefOr[String] = js.undefined,
                    /* The text string to use for the default value.*/
                    defaultValue: js.UndefOr[js.Any] = js.undefined,
                    /* Disables the text field if set to true.*/
                    disabled: js.UndefOr[Boolean] = js.undefined,
                    /* The style object to use to override error styles.*/
                    errorStyle: js.UndefOr[js.Any] = js.undefined,
                    /* The error content to display.*/
                    errorText: js.UndefOr[ReactNode] = js.undefined,
                    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
                    floatingLabelFocusStyle: js.UndefOr[js.Any] = js.undefined,
                    /* The style object to use to override floating label styles.*/
                    floatingLabelStyle: js.UndefOr[js.Any] = js.undefined,
                    /* The content to use for the floating label element.*/
                    floatingLabelText: js.UndefOr[ReactNode] = js.undefined,
                    /* If true, the field receives the property width 100%.*/
                    fullWidth: js.UndefOr[Boolean] = js.undefined,
                    /* Override the inline-styles of the TextField's hint text element.*/
                    hintStyle: js.UndefOr[js.Any] = js.undefined,
                    /* The hint content to display.*/
                    hintText: js.UndefOr[ReactNode] = js.undefined,
                    /* The id prop for the text field.*/
                    id: js.UndefOr[String] = js.undefined,
                    /* Override the inline-styles of the TextField's input element.*/
                    inputStyle: js.UndefOr[js.Any] = js.undefined,
                    /* If true, a textarea element will be rendered.
                  The textarea also grows and shrinks according to the number of lines.*/
                    multiLine: js.UndefOr[Boolean] = js.undefined,
                    name: js.UndefOr[String] = js.undefined,
                    /* _ function that is fired when the textfield loses focus.*/
                    onBlur: js.UndefOr[ReactEventI => _] = js.undefined,
                    /* _ function that is fired when the textfield's value changes.*/
                    onChange: js.UndefOr[ReactEventI => _] = js.undefined,
                    /* _ function that is fired when the textfield gains focus.*/
                    onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                    /* _ function fired when key is pressed down.*/
                    onKeyDown: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                    /* Number of rows to display when multiLine option is set to true.*/
                    rows: js.UndefOr[Int] = js.undefined,
                    /* Maximum number of rows to display when
                  multiLine option is set to true.*/
                    rowsMax: js.UndefOr[Int] = js.undefined,
                    /* Override the inline-styles of the root element.*/
                    style: js.UndefOr[js.Any] = js.undefined,
                    /* Specifies the type of input to display
                  such as "password" or "text".*/
                    `type`: js.UndefOr[String] = js.undefined,
                    /* Override the inline-styles of the
                  TextField's underline element when disabled.*/
                    underlineDisabledStyle: js.UndefOr[js.Any] = js.undefined,
                    /* Override the inline-styles of the TextField's
                  underline element when focussed.*/
                    underlineFocusStyle: js.UndefOr[js.Any] = js.undefined,
                    /* If true, shows the underline for the text field.*/
                    underlineShow: js.UndefOr[Boolean] = js.undefined,
                    /* Override the inline-styles of the TextField's underline element.*/
                    underlineStyle: js.UndefOr[js.Any] = js.undefined,
                    /* The value of the text field.*/
                    value: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.TextField, props, children: _*)
  }


  def MuiSlider(
                 key: js.UndefOr[String] = js.undefined,
                 ref: js.UndefOr[String] = js.undefined,
                 /* The default value of the slider.*/
                 defaultValue: js.UndefOr[Double] = js.undefined,
                 /* Describe the slider.*/
                 description: js.UndefOr[String] = js.undefined,
                 /* Disables focus ripple if set to true.*/
                 disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                 /* If true, the slider will not be interactable.*/
                 disabled: js.UndefOr[Boolean] = js.undefined,
                 /* An error message for the slider.*/
                 error: js.UndefOr[String] = js.undefined,
                 /* The maximum value the slider can slide to on
               a scale from 0 to 1 inclusive. Cannot be equal to min.*/
                 max: js.UndefOr[Double] = js.undefined,
                 /* The minimum value the slider can slide to on a scale
               from 0 to 1 inclusive. Cannot be equal to max.*/
                 min: js.UndefOr[Double] = js.undefined,
                 /* The name of the slider. Behaves like the name attribute
               of an input element.*/
                 name: js.UndefOr[String] = js.undefined,
                 /* _ function that is fired when the focus has left the slider.*/
                 onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                 /* _ function that is fired when the user changes the slider's value.*/
                 onChange: js.UndefOr[(ReactEventH, Double) => _] = js.undefined,
                 /* _ function that is fired when the slider has begun to move.*/
                 onDragStart: js.UndefOr[ReactDragEventH => _] = js.undefined,
                 /* _ function that is fried when the slide has stopped moving.*/
                 onDragStop: js.UndefOr[ReactDragEventH => _] = js.undefined,
                 /* _ fired when the user has focused on the slider.*/
                 onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                 /* Whether or not the slider is required in a form.*/
                 required: js.UndefOr[Boolean] = js.undefined,
                 /* The granularity the slider can step through values.*/
                 step: js.UndefOr[Double] = js.undefined,
                 /* Override the inline-styles of the root element.*/
                 style: js.UndefOr[js.Any] = js.undefined,
                 /* The value of the slider.*/
                 value: js.UndefOr[Double] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Slider, props)
  }


  def MuiStepper(
                  key: js.UndefOr[String] = js.undefined,
                  ref: js.UndefOr[String] = js.undefined,
                  linear: js.UndefOr[Boolean] = js.undefined,
                  orientation: js.UndefOr[HorizontalVeritcal] = js.undefined,
                  /* Override the inline-styles of the root element.*/
                  style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Stepper, props, children: _*)
  }

  def MuiStep(
               key: js.UndefOr[String] = js.undefined,
               ref: js.UndefOr[String] = js.undefined,
               active: js.UndefOr[Boolean] = js.undefined,
               completed: js.UndefOr[Boolean] = js.undefined,
               disabled: js.UndefOr[Boolean] = js.undefined,
               /* Override the inline-styles of the root element.*/
               style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Step, props, children: _*)
  }


  def MuiStepLabel(
                    key: js.UndefOr[String] = js.undefined,
                    ref: js.UndefOr[String] = js.undefined,
                    active: js.UndefOr[Boolean] = js.undefined,
                    completed: js.UndefOr[Boolean] = js.undefined,
                    disabled: js.UndefOr[Boolean] = js.undefined,
                    icon: js.UndefOr[ReactNode] = js.undefined,
                    /* Override the inline-styles of the root element.*/
                    style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.StepLabel, props, children: _*)
  }

  def MuiStepButton(
                     key: js.UndefOr[String] = js.undefined,
                     ref: js.UndefOr[String] = js.undefined,
                     active: js.UndefOr[Boolean] = js.undefined,
                     completed: js.UndefOr[Boolean] = js.undefined,
                     disabled: js.UndefOr[Boolean] = js.undefined,
                     icon: js.UndefOr[ReactNode] = js.undefined,
                     onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                     onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                     onTouchStart: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                     /* Override the inline-styles of the root element.*/
                     style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.StepButton, props, children: _*)
  }

  def MuiStepContent(
                      key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      active: js.UndefOr[Boolean] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.StepContent, props, children: _*)
  }

  def MuiSubheader(
                    key: js.UndefOr[String] = js.undefined,
                    ref: js.UndefOr[String] = js.undefined,
                    inset: js.UndefOr[Boolean] = js.undefined,
                    /* Override the inline-styles of the root element.*/
                    style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Subheader, props, children: _*)
  }


  def MuiTimePicker(
                     key: js.UndefOr[String] = js.undefined,
                     ref: js.UndefOr[MuiTimePickerM => Unit] = js.undefined,
                     /* If true, automatically accept and close the picker on set minutes.*/
                     autoOk: js.UndefOr[Boolean] = js.undefined,
                     cancelLabel: js.UndefOr[ReactNode] = js.undefined,
                     /* This is the initial time value of the component.*/
                     defaultTime: js.UndefOr[js.Date] = js.undefined,
                     disabled: js.UndefOr[Boolean] = js.undefined,
                     /* Tells the component to display the picker in
                   ampm (12hr) format or 24hr format.*/
                     format: js.UndefOr[Ampm_24hr] = js.undefined,
                     okLabel: js.UndefOr[ReactNode] = js.undefined,
                     /* _ function that is fired when the time
                   value changes. The time value is passed in a Date
                   Object.Since there is no particular event associated
                   with the change the first argument will always be null
                   and the second argument will be the new Date instance.*/
                     onChange: js.UndefOr[(js.Any, js.Date) => _] = js.undefined,
                     /* Fired when the timepicker dialog is dismissed.*/
                     onDismiss: js.UndefOr[() => _] = js.undefined,
                     /* _ function that is fired when the timepicker field gains focus.*/
                     onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                     /* Fired when the timepicker dialog is shown.*/
                     onShow: js.UndefOr[() => _] = js.undefined,
                     /* _ for touch tap event.*/
                     onTouchTap: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                     /* It's technically more correct to refer to
                   "12 noon" and "12 midnight" rather than
                   "12 a.m." and "12 p.m." and it avoids real
                   confusion between different locales. By default
                   (for compatibility reasons) TimePicker uses
                   (12 a.m./12 p.m.) To use (noon/midnight) set pedantic={true}.*/
                     pedantic: js.UndefOr[Boolean] = js.undefined,
                     /* Override the inline-styles of the root element.*/
                     style: js.UndefOr[js.Any] = js.undefined,
                     /* Override the inline-styles of TimePicker's TextField element.*/
                     textFieldStyle: js.UndefOr[js.Any] = js.undefined,
                     /* The css class name of the root element.
                     (Passed on to TextField)*/
                     className: js.UndefOr[String] = js.undefined,
                     /* The text string to use for the default value.
                     (Passed on to TextField)*/
                     defaultValue: js.UndefOr[String] = js.undefined,
                     /* The style object to use to override error styles.
                     (Passed on to TextField)*/
                     errorStyle: js.UndefOr[js.Any] = js.undefined,
                     /* The error content to display.
                     (Passed on to TextField)*/
                     errorText: js.UndefOr[ReactNode] = js.undefined,
                     /* The style object to use to override floating label styles.
                     (Passed on to TextField)*/
                     floatingLabelStyle: js.UndefOr[js.Any] = js.undefined,
                     /* The content to use for the floating label element.
                     (Passed on to TextField)*/
                     floatingLabelText: js.UndefOr[ReactNode] = js.undefined,
                     /* If true, the field receives the property width 100%.
                     (Passed on to TextField)*/
                     fullWidth: js.UndefOr[Boolean] = js.undefined,
                     /* Override the inline-styles of the TextField's hint text element.
                     (Passed on to TextField)*/
                     hintStyle: js.UndefOr[js.Any] = js.undefined,
                     /* The hint content to display.
                     (Passed on to TextField)*/
                     hintText: js.UndefOr[ReactNode] = js.undefined,
                     /* The id prop for the text field.
                     (Passed on to TextField)*/
                     id: js.UndefOr[String] = js.undefined,
                     /* Override the inline-styles of the TextField's input element.
                     (Passed on to TextField)*/
                     inputStyle: js.UndefOr[js.Any] = js.undefined,
                     /* If true, a textarea element will be rendered.
                   The textarea also grows and shrinks according to the number of lines.
                     (Passed on to TextField)*/
                     multiLine: js.UndefOr[Boolean] = js.undefined,
                     /* _ function that is fired when the textfield loses focus.
                     (Passed on to TextField)*/
                     onBlur: js.UndefOr[ReactEventI => _] = js.undefined,
                     /* The function to call when the user presses the Enter key.
                     (Passed on to TextField)*/
                     onEnterKeyDown: js.UndefOr[ReactKeyboardEventI => _] = js.undefined,
                     /* _ function fired when key is pressed down.
                     (Passed on to TextField)*/
                     onKeyDown: js.UndefOr[ReactKeyboardEventH => _] = js.undefined,
                     /* Override the inline-styles of the
                   TextField's underline element when disabled.
                     (Passed on to TextField)*/
                     underlineDisabledStyle: js.UndefOr[js.Any] = js.undefined,
                     /* Override the inline-styles of the TextField's
                   underline element when focussed.
                     (Passed on to TextField)*/
                     underlineFocusStyle: js.UndefOr[js.Any] = js.undefined,
                     /* If true, shows the underline for the text field.
                     (Passed on to TextField)*/
                     underlineShow: js.UndefOr[Boolean] = js.undefined,
                     /* Override the inline-styles of the TextField's underline element.
                     (Passed on to TextField)*/
                     underlineStyle: js.UndefOr[js.Any] = js.undefined,
                     /* The value of the text field.
                     (Passed on to TextField)*/
                     value: js.UndefOr[String] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.TimePicker, props, children: _*)
  }


  def MuiToggle(
                 key: js.UndefOr[String] = js.undefined,
                 ref: js.UndefOr[MuiToggleM => Unit] = js.undefined,
                 /* Determines whether the Toggle is initially turned on.*/
                 defaultToggled: js.UndefOr[Boolean] = js.undefined,
                 /* Will disable the toggle if true.*/
                 disabled: js.UndefOr[Boolean] = js.undefined,
                 /* Overrides the inline-styles of the Toggle element.*/
                 elementStyle: js.UndefOr[js.Any] = js.undefined,
                 /* Overrides the inline-styles of the Icon element.*/
                 iconStyle: js.UndefOr[js.Any] = js.undefined,
                 /* Where the label will be placed next to the toggle.*/
                 labelPosition: js.UndefOr[LeftRight] = js.undefined,
                 /* Overrides the inline-styles of the Toggle element label.*/
                 labelStyle: js.UndefOr[js.Any] = js.undefined,
                 /* _ function that is fired when the toggle switch is toggled.*/
                 onToggle: js.UndefOr[(ReactEventI, Boolean) => _] = js.undefined,
                 /* Override style of ripple.*/
                 rippleStyle: js.UndefOr[js.Any] = js.undefined,
                 /* Override the inline-styles of the root element.*/
                 style: js.UndefOr[js.Any] = js.undefined,
                 /* Override style for thumb.*/
                 thumbStyle: js.UndefOr[js.Any] = js.undefined,
                 /* Toggled if set to true.*/
                 toggled: js.UndefOr[Boolean] = js.undefined,
                 /* Override style for track.*/
                 trackStyle: js.UndefOr[js.Any] = js.undefined,
                 /* ValueLink prop for when using controlled toggle.*/
                 valueLink: js.UndefOr[js.Any] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 checked: js.UndefOr[Boolean] = js.undefined,
                 /* The css class name of the root element.
                 (Passed on to EnhancedSwitch)*/
                 className: js.UndefOr[String] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 defaultSwitched: js.UndefOr[Boolean] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 id: js.UndefOr[String] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 inputType: js.UndefOr[String] = js.undefined,
                 /* The text that is displayed beside the toggle switch.
                 (Passed on to EnhancedSwitch)*/
                 label: js.UndefOr[ReactNode] = js.undefined,
                 /* This is the name of the toggle.
                 (Passed on to EnhancedSwitch)*/
                 name: js.UndefOr[String] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 onBlur: js.UndefOr[ReactEventH => _] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 onFocus: js.UndefOr[ReactFocusEventH => _] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 onMouseDown: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 onMouseUp: js.UndefOr[ReactMouseEventH => _] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 onParentShouldUpdate: js.UndefOr[Boolean => _] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 onSwitch: js.UndefOr[(ReactEventI, Boolean) => _] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 onTouchEnd: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 onTouchStart: js.UndefOr[ReactTouchEventH => _] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 required: js.UndefOr[Boolean] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 rippleColor: js.UndefOr[MuiColor] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 switchElement: js.UndefOr[ReactElement] = js.undefined,
                 /* (Passed on to EnhancedSwitch)*/
                 switched: js.UndefOr[Boolean] = js.undefined,
                 /* The value of our toggle component.
                 (Passed on to EnhancedSwitch)*/
                 value: js.UndefOr[String] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Toggle, props)
  }


  def MuiToolbar(
                  key: js.UndefOr[String] = js.undefined,
                  ref: js.UndefOr[String] = js.undefined,
                  /* The css class name of the root element.*/
                  className: js.UndefOr[String] = js.undefined,
                  /* Do not apply `desktopGutter` to the `Toolbar`.*/
                  noGutter: js.UndefOr[Boolean] = js.undefined,
                  /* Override the inline-styles of the root element.*/
                  style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Toolbar, props, children: _*)
  }

  def MuiToolbarGroup(
                       key: js.UndefOr[String] = js.undefined,
                       ref: js.UndefOr[String] = js.undefined,
                       /* The css class name of the root element.*/
                       className: js.UndefOr[String] = js.undefined,
                       /* Set this to true for if the `ToolbarGroup` is the first child of `Toolbar`
                     to prevent setting the left gap.*/
                       firstChild: js.UndefOr[Boolean] = js.undefined,
                       /* Determines the side the `ToolbarGroup` will snap to. Either 'left' or 'right'.*/
                       float: js.UndefOr[LeftRight] = js.undefined,
                       /* Set this to true for if the `ToolbarGroup` is the last child of `Toolbar`
                     to prevent setting the right gap.*/
                       lastChild: js.UndefOr[Boolean] = js.undefined,
                       /* Override the inline-styles of the root element.*/
                       style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.ToolbarGroup, props, children: _*)
  }

  def MuiToolbarSeparator(
                           key: js.UndefOr[String] = js.undefined,
                           ref: js.UndefOr[String] = js.undefined,
                           /* The css class name of the root element.*/
                           className: js.UndefOr[String] = js.undefined,
                           /* Override the inline-styles of the root element.*/
                           style: js.UndefOr[js.Any] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.ToolbarSeparator, props)
  }

  def MuiToolbarTitle(
                       key: js.UndefOr[String] = js.undefined,
                       ref: js.UndefOr[String] = js.undefined,
                       /* The css class name of the root element.*/
                       className: js.UndefOr[String] = js.undefined,
                       /* Override the inline-styles of the root element.*/
                       style: js.UndefOr[js.Any] = js.undefined,
                       /* The text to be displayed.*/
                       text: js.UndefOr[String] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.ToolbarTitle, props)
  }

  def MuiTooltip(
                  key: js.UndefOr[String] = js.undefined,
                  ref: js.UndefOr[String] = js.undefined,
                  /* The css class name of the root element.*/
                  className: js.UndefOr[String] = js.undefined,
                  horizontalPosition: js.UndefOr[LeftRightCenter] = js.undefined,
                  label: ReactNode,
                  show: js.UndefOr[Boolean] = js.undefined,
                  /* Override the inline-styles of the root element.*/
                  style: js.UndefOr[js.Any] = js.undefined,
                  touch: js.UndefOr[Boolean] = js.undefined,
                  verticalPosition: js.UndefOr[TopBottom] = js.undefined): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.Tooltip, props)
  }

  def MuiTouchRipple(
                      key: js.UndefOr[String] = js.undefined,
                      ref: js.UndefOr[String] = js.undefined,
                      centerRipple: js.UndefOr[Boolean] = js.undefined,
                      color: js.UndefOr[MuiColor] = js.undefined,
                      /* The material-ui theme applied to this component.*/
                      muiTheme: MuiTheme,
                      opacity: js.UndefOr[Double] = js.undefined,
                      /* Override the inline-styles of the root element.*/
                      style: js.UndefOr[js.Any] = js.undefined)(children: ReactNode*): ReactElement = {
    val props = FunctionMacro()
    React.createElement(Mui.TouchRipple, props, children: _*)
  }


}