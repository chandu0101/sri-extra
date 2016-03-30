package sri.web.extra.components.materialui

import sri.core.ReactNode
import sri.web.extra.api.ReactMouseEventH

import scala.scalajs.js

@js.native
trait MuiSvgIconProps extends js.Any {
  def key: js.UndefOr[String]

  def ref: js.UndefOr[String]

  def color: js.UndefOr[MuiColor]

  def hoverColor: js.UndefOr[MuiColor]

  def onMouseEnter: js.UndefOr[ReactMouseEventH => _]

  def onMouseLeave: js.UndefOr[ReactMouseEventH => _]

  def style: js.UndefOr[js.Any]

  def viewBox: js.UndefOr[String]
}

object MuiSvgIcon {

  implicit class SvgIconApply(icon: MuiSvgIcon) {
    def apply(key: js.UndefOr[String] = js.undefined,
              ref: js.UndefOr[String] = js.undefined,
              color: js.UndefOr[MuiColor] = js.undefined,
              hoverColor: js.UndefOr[MuiColor] = js.undefined,
              onMouseEnter: js.UndefOr[ReactMouseEventH => _] = js.undefined,
              onMouseLeave: js.UndefOr[ReactMouseEventH => _] = js.undefined,
              style: js.UndefOr[js.Any] = js.undefined,
              viewBox: js.UndefOr[String] = js.undefined)
             (childOpt: js.UndefOr[ReactNode] = js.undefined) = {

      val props = js.Dynamic.literal()
      key.foreach(v => props.updateDynamic("key")(v))
      ref.foreach(v => props.updateDynamic("ref")(v))
      color.foreach(v => props.updateDynamic("color")(v))
      hoverColor.foreach(v => props.updateDynamic("hoverColor")(v))
      //      onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v andThen (_.runNow())))
      //      onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v andThen (_.runNow())))
      style.foreach(v => props.updateDynamic("style")(v))
      viewBox.foreach(v => props.updateDynamic("viewBox")(v))

      //      val f: JsComponentC[MuiSvgIconProps, js.Any, TopNode] =
      //        React.createFactory(icon)
      //      val svgProps: MuiSvgIconProps =
      //        props.asInstanceOf[MuiSvgIconProps]
      //
      //      childOpt.fold(f(svgProps))(c => f(svgProps, c))
    }
  }

}

@js.native
trait MuiSvgIcon extends js.Object

@js.native
trait MuiSvgIcons extends js.Object {
  def ActionAccessibility: MuiSvgIcon

  def ActionAccessible: MuiSvgIcon

  def ActionAccountBalanceWallet: MuiSvgIcon

  def ActionAccountBalance: MuiSvgIcon

  def ActionAccountBox: MuiSvgIcon

  def ActionAccountCircle: MuiSvgIcon

  def ActionAddShoppingCart: MuiSvgIcon

  def ActionAlarmAdd: MuiSvgIcon

  def ActionAlarmOff: MuiSvgIcon

  def ActionAlarmOn: MuiSvgIcon

  def ActionAlarm: MuiSvgIcon

  def ActionAllOut: MuiSvgIcon

  def ActionAndroid: MuiSvgIcon

  def ActionAnnouncement: MuiSvgIcon

  def ActionAspectRatio: MuiSvgIcon

  def ActionAssessment: MuiSvgIcon

  def ActionAssignmentInd: MuiSvgIcon

  def ActionAssignmentLate: MuiSvgIcon

  def ActionAssignmentReturn: MuiSvgIcon

  def ActionAssignmentReturned: MuiSvgIcon

  def ActionAssignmentTurnedIn: MuiSvgIcon

  def ActionAssignment: MuiSvgIcon

  def ActionAutorenew: MuiSvgIcon

  def ActionBackup: MuiSvgIcon

  def ActionBook: MuiSvgIcon

  def ActionBookmarkBorder: MuiSvgIcon

  def ActionBookmark: MuiSvgIcon

  def ActionBugReport: MuiSvgIcon

  def ActionBuild: MuiSvgIcon

  def ActionCached: MuiSvgIcon

  def ActionCameraEnhance: MuiSvgIcon

  def ActionCardGiftcard: MuiSvgIcon

  def ActionCardMembership: MuiSvgIcon

  def ActionCardTravel: MuiSvgIcon

  def ActionChangeHistory: MuiSvgIcon

  def ActionCheckCircle: MuiSvgIcon

  def ActionChromeReaderMode: MuiSvgIcon

  def ActionClass: MuiSvgIcon

  def ActionCode: MuiSvgIcon

  def ActionCompareArrows: MuiSvgIcon

  def ActionCopyright: MuiSvgIcon

  def ActionCreditCard: MuiSvgIcon

  def ActionDashboard: MuiSvgIcon

  def ActionDateRange: MuiSvgIcon

  def ActionDelete: MuiSvgIcon

  def ActionDescription: MuiSvgIcon

  def ActionDns: MuiSvgIcon

  def ActionDoneAll: MuiSvgIcon

  def ActionDone: MuiSvgIcon

  def ActionDonutLarge: MuiSvgIcon

  def ActionDonutSmall: MuiSvgIcon

  def ActionEject: MuiSvgIcon

  def ActionEventSeat: MuiSvgIcon

  def ActionEvent: MuiSvgIcon

  def ActionExitToApp: MuiSvgIcon

  def ActionExplore: MuiSvgIcon

  def ActionExtension: MuiSvgIcon

  def ActionFace: MuiSvgIcon

  def ActionFavoriteBorder: MuiSvgIcon

  def ActionFavorite: MuiSvgIcon

  def ActionFeedback: MuiSvgIcon

  def ActionFindInPage: MuiSvgIcon

  def ActionFindReplace: MuiSvgIcon

  def ActionFingerprint: MuiSvgIcon

  def ActionFlightLand: MuiSvgIcon

  def ActionFlightTakeoff: MuiSvgIcon

  def ActionFlipToBack: MuiSvgIcon

  def ActionFlipToFront: MuiSvgIcon

  def ActionGavel: MuiSvgIcon

  def ActionGetApp: MuiSvgIcon

  def ActionGif: MuiSvgIcon

  def ActionGrade: MuiSvgIcon

  def ActionGroupWork: MuiSvgIcon

  def ActionHelpOutline: MuiSvgIcon

  def ActionHelp: MuiSvgIcon

  def ActionHighlightOff: MuiSvgIcon

  def ActionHistory: MuiSvgIcon

  def ActionHome: MuiSvgIcon

  def ActionHourglassEmpty: MuiSvgIcon

  def ActionHourglassFull: MuiSvgIcon

  def ActionHttp: MuiSvgIcon

  def ActionHttps: MuiSvgIcon

  def ActionImportantDevices: MuiSvgIcon

  def ActionInfoOutline: MuiSvgIcon

  def ActionInfo: MuiSvgIcon

  def ActionInput: MuiSvgIcon

  def ActionInvertColors: MuiSvgIcon

  def ActionLabelOutline: MuiSvgIcon

  def ActionLabel: MuiSvgIcon

  def ActionLanguage: MuiSvgIcon

  def ActionLaunch: MuiSvgIcon

  def ActionLightbulbOutline: MuiSvgIcon

  def ActionLineStyle: MuiSvgIcon

  def ActionLineWeight: MuiSvgIcon

  def ActionList: MuiSvgIcon

  def ActionLockOpen: MuiSvgIcon

  def ActionLockOutline: MuiSvgIcon

  def ActionLock: MuiSvgIcon

  def ActionLoyalty: MuiSvgIcon

  def ActionMarkunreadMailbox: MuiSvgIcon

  def ActionMotorcycle: MuiSvgIcon

  def ActionNoteAdd: MuiSvgIcon

  def ActionOfflinePin: MuiSvgIcon

  def ActionOpacity: MuiSvgIcon

  def ActionOpenInBrowser: MuiSvgIcon

  def ActionOpenInNew: MuiSvgIcon

  def ActionOpenWith: MuiSvgIcon

  def ActionPageview: MuiSvgIcon

  def ActionPanTool: MuiSvgIcon

  def ActionPayment: MuiSvgIcon

  def ActionPermCameraMic: MuiSvgIcon

  def ActionPermContactCalendar: MuiSvgIcon

  def ActionPermDataSetting: MuiSvgIcon

  def ActionPermDeviceInformation: MuiSvgIcon

  def ActionPermIdentity: MuiSvgIcon

  def ActionPermMedia: MuiSvgIcon

  def ActionPermPhoneMsg: MuiSvgIcon

  def ActionPermScanWifi: MuiSvgIcon

  def ActionPets: MuiSvgIcon

  def ActionPictureInPictureAlt: MuiSvgIcon

  def ActionPictureInPicture: MuiSvgIcon

  def ActionPlayForWork: MuiSvgIcon

  def ActionPolymer: MuiSvgIcon

  def ActionPowerSettingsNew: MuiSvgIcon

  def ActionPregnantWoman: MuiSvgIcon

  def ActionPrint: MuiSvgIcon

  def ActionQueryBuilder: MuiSvgIcon

  def ActionQuestionAnswer: MuiSvgIcon

  def ActionReceipt: MuiSvgIcon

  def ActionRecordVoiceOver: MuiSvgIcon

  def ActionRedeem: MuiSvgIcon

  def ActionReorder: MuiSvgIcon

  def ActionReportProblem: MuiSvgIcon

  def ActionRestore: MuiSvgIcon

  def ActionRoom: MuiSvgIcon

  def ActionRoundedCorner: MuiSvgIcon

  def ActionRowing: MuiSvgIcon

  def ActionSchedule: MuiSvgIcon

  def ActionSearch: MuiSvgIcon

  def ActionSettingsApplications: MuiSvgIcon

  def ActionSettingsBackupRestore: MuiSvgIcon

  def ActionSettingsBluetooth: MuiSvgIcon

  def ActionSettingsBrightness: MuiSvgIcon

  def ActionSettingsCell: MuiSvgIcon

  def ActionSettingsEthernet: MuiSvgIcon

  def ActionSettingsInputAntenna: MuiSvgIcon

  def ActionSettingsInputComponent: MuiSvgIcon

  def ActionSettingsInputComposite: MuiSvgIcon

  def ActionSettingsInputHdmi: MuiSvgIcon

  def ActionSettingsInputSvideo: MuiSvgIcon

  def ActionSettingsOverscan: MuiSvgIcon

  def ActionSettingsPhone: MuiSvgIcon

  def ActionSettingsPower: MuiSvgIcon

  def ActionSettingsRemote: MuiSvgIcon

  def ActionSettingsVoice: MuiSvgIcon

  def ActionSettings: MuiSvgIcon

  def ActionShopTwo: MuiSvgIcon

  def ActionShop: MuiSvgIcon

  def ActionShoppingBasket: MuiSvgIcon

  def ActionShoppingCart: MuiSvgIcon

  def ActionSpeakerNotes: MuiSvgIcon

  def ActionSpellcheck: MuiSvgIcon

  def ActionStars: MuiSvgIcon

  def ActionStore: MuiSvgIcon

  def ActionSubject: MuiSvgIcon

  def ActionSupervisorAccount: MuiSvgIcon

  def ActionSwapHoriz: MuiSvgIcon

  def ActionSwapVert: MuiSvgIcon

  def ActionSwapVerticalCircle: MuiSvgIcon

  def ActionSystemUpdateAlt: MuiSvgIcon

  def ActionTabUnselected: MuiSvgIcon

  def ActionTab: MuiSvgIcon

  def ActionTheaters: MuiSvgIcon

  def ActionThreeDRotation: MuiSvgIcon

  def ActionThumbDown: MuiSvgIcon

  def ActionThumbUp: MuiSvgIcon

  def ActionThumbsUpDown: MuiSvgIcon

  def ActionTimeline: MuiSvgIcon

  def ActionToc: MuiSvgIcon

  def ActionToday: MuiSvgIcon

  def ActionToll: MuiSvgIcon

  def ActionTouchApp: MuiSvgIcon

  def ActionTrackChanges: MuiSvgIcon

  def ActionTranslate: MuiSvgIcon

  def ActionTrendingDown: MuiSvgIcon

  def ActionTrendingFlat: MuiSvgIcon

  def ActionTrendingUp: MuiSvgIcon

  def ActionTurnedInNot: MuiSvgIcon

  def ActionTurnedIn: MuiSvgIcon

  def ActionUpdate: MuiSvgIcon

  def ActionVerifiedUser: MuiSvgIcon

  def ActionViewAgenda: MuiSvgIcon

  def ActionViewArray: MuiSvgIcon

  def ActionViewCarousel: MuiSvgIcon

  def ActionViewColumn: MuiSvgIcon

  def ActionViewDay: MuiSvgIcon

  def ActionViewHeadline: MuiSvgIcon

  def ActionViewList: MuiSvgIcon

  def ActionViewModule: MuiSvgIcon

  def ActionViewQuilt: MuiSvgIcon

  def ActionViewStream: MuiSvgIcon

  def ActionViewWeek: MuiSvgIcon

  def ActionVisibilityOff: MuiSvgIcon

  def ActionVisibility: MuiSvgIcon

  def ActionWatchLater: MuiSvgIcon

  def ActionWork: MuiSvgIcon

  def ActionYoutubeSearchedFor: MuiSvgIcon

  def ActionZoomIn: MuiSvgIcon

  def ActionZoomOut: MuiSvgIcon

  def AlertAddAlert: MuiSvgIcon

  def AlertErrorOutline: MuiSvgIcon

  def AlertError: MuiSvgIcon

  def AlertWarning: MuiSvgIcon

  def AvAddToQueue: MuiSvgIcon

  def AvAirplay: MuiSvgIcon

  def AvAlbum: MuiSvgIcon

  def AvArtTrack: MuiSvgIcon

  def AvAvTimer: MuiSvgIcon

  def AvClosedCaption: MuiSvgIcon

  def AvEqualizer: MuiSvgIcon

  def AvExplicit: MuiSvgIcon

  def AvFastForward: MuiSvgIcon

  def AvFastRewind: MuiSvgIcon

  def AvFiberDvr: MuiSvgIcon

  def AvFiberManualRecord: MuiSvgIcon

  def AvFiberNew: MuiSvgIcon

  def AvFiberPin: MuiSvgIcon

  def AvFiberSmartRecord: MuiSvgIcon

  def AvForward10: MuiSvgIcon

  def AvForward30: MuiSvgIcon

  def AvForward5: MuiSvgIcon

  def AvGames: MuiSvgIcon

  def AvHd: MuiSvgIcon

  def AvHearing: MuiSvgIcon

  def AvHighQuality: MuiSvgIcon

  def AvLibraryAdd: MuiSvgIcon

  def AvLibraryBooks: MuiSvgIcon

  def AvLibraryMusic: MuiSvgIcon

  def AvLoop: MuiSvgIcon

  def AvMicNone: MuiSvgIcon

  def AvMicOff: MuiSvgIcon

  def AvMic: MuiSvgIcon

  def AvMovie: MuiSvgIcon

  def AvMusicVideo: MuiSvgIcon

  def AvNewReleases: MuiSvgIcon

  def AvNotInterested: MuiSvgIcon

  def AvPauseCircleFilled: MuiSvgIcon

  def AvPauseCircleOutline: MuiSvgIcon

  def AvPause: MuiSvgIcon

  def AvPlayArrow: MuiSvgIcon

  def AvPlayCircleFilled: MuiSvgIcon

  def AvPlayCircleOutline: MuiSvgIcon

  def AvPlaylistAddCheck: MuiSvgIcon

  def AvPlaylistAdd: MuiSvgIcon

  def AvPlaylistPlay: MuiSvgIcon

  def AvQueueMusic: MuiSvgIcon

  def AvQueuePlayNext: MuiSvgIcon

  def AvQueue: MuiSvgIcon

  def AvRadio: MuiSvgIcon

  def AvRecentActors: MuiSvgIcon

  def AvRemoveFromQueue: MuiSvgIcon

  def AvRepeatOne: MuiSvgIcon

  def AvRepeat: MuiSvgIcon

  def AvReplay10: MuiSvgIcon

  def AvReplay30: MuiSvgIcon

  def AvReplay5: MuiSvgIcon

  def AvReplay: MuiSvgIcon

  def AvShuffle: MuiSvgIcon

  def AvSkipNext: MuiSvgIcon

  def AvSkipPrevious: MuiSvgIcon

  def AvSlowMotionVideo: MuiSvgIcon

  def AvSnooze: MuiSvgIcon

  def AvSortByAlpha: MuiSvgIcon

  def AvStop: MuiSvgIcon

  def AvSubscriptions: MuiSvgIcon

  def AvSubtitles: MuiSvgIcon

  def AvSurroundSound: MuiSvgIcon

  def AvVideoLibrary: MuiSvgIcon

  def AvVideocamOff: MuiSvgIcon

  def AvVideocam: MuiSvgIcon

  def AvVolumeDown: MuiSvgIcon

  def AvVolumeMute: MuiSvgIcon

  def AvVolumeOff: MuiSvgIcon

  def AvVolumeUp: MuiSvgIcon

  def AvWebAsset: MuiSvgIcon

  def AvWeb: MuiSvgIcon

  def CommunicationBusiness: MuiSvgIcon

  def CommunicationCallEnd: MuiSvgIcon

  def CommunicationCallMade: MuiSvgIcon

  def CommunicationCallMerge: MuiSvgIcon

  def CommunicationCallMissedOutgoing: MuiSvgIcon

  def CommunicationCallMissed: MuiSvgIcon

  def CommunicationCallReceived: MuiSvgIcon

  def CommunicationCallSplit: MuiSvgIcon

  def CommunicationCall: MuiSvgIcon

  def CommunicationChatBubbleOutline: MuiSvgIcon

  def CommunicationChatBubble: MuiSvgIcon

  def CommunicationChat: MuiSvgIcon

  def CommunicationClearAll: MuiSvgIcon

  def CommunicationComment: MuiSvgIcon

  def CommunicationContactMail: MuiSvgIcon

  def CommunicationContactPhone: MuiSvgIcon

  def CommunicationContacts: MuiSvgIcon

  def CommunicationDialerSip: MuiSvgIcon

  def CommunicationDialpad: MuiSvgIcon

  def CommunicationEmail: MuiSvgIcon

  def CommunicationForum: MuiSvgIcon

  def CommunicationImportContacts: MuiSvgIcon

  def CommunicationImportExport: MuiSvgIcon

  def CommunicationInvertColorsOff: MuiSvgIcon

  def CommunicationLiveHelp: MuiSvgIcon

  def CommunicationLocationOff: MuiSvgIcon

  def CommunicationLocationOn: MuiSvgIcon

  def CommunicationMailOutline: MuiSvgIcon

  def CommunicationMessage: MuiSvgIcon

  def CommunicationNoSim: MuiSvgIcon

  def CommunicationPhone: MuiSvgIcon

  def CommunicationPhonelinkErase: MuiSvgIcon

  def CommunicationPhonelinkLock: MuiSvgIcon

  def CommunicationPhonelinkRing: MuiSvgIcon

  def CommunicationPhonelinkSetup: MuiSvgIcon

  def CommunicationPortableWifiOff: MuiSvgIcon

  def CommunicationPresentToAll: MuiSvgIcon

  def CommunicationRingVolume: MuiSvgIcon

  def CommunicationScreenShare: MuiSvgIcon

  def CommunicationSpeakerPhone: MuiSvgIcon

  def CommunicationStayCurrentLandscape: MuiSvgIcon

  def CommunicationStayCurrentPortrait: MuiSvgIcon

  def CommunicationStayPrimaryLandscape: MuiSvgIcon

  def CommunicationStayPrimaryPortrait: MuiSvgIcon

  def CommunicationStopScreenShare: MuiSvgIcon

  def CommunicationSwapCalls: MuiSvgIcon

  def CommunicationTactMail: MuiSvgIcon

  def CommunicationTextsms: MuiSvgIcon

  def CommunicationVoicemail: MuiSvgIcon

  def CommunicationVpnKey: MuiSvgIcon

  def ContentAddBox: MuiSvgIcon

  def ContentAddCircleOutline: MuiSvgIcon

  def ContentAddCircle: MuiSvgIcon

  def ContentAdd: MuiSvgIcon

  def ContentArchive: MuiSvgIcon

  def ContentBackspace: MuiSvgIcon

  def ContentBlock: MuiSvgIcon

  def ContentClear: MuiSvgIcon

  def ContentContentCopy: MuiSvgIcon

  def ContentContentCut: MuiSvgIcon

  def ContentContentPaste: MuiSvgIcon

  def ContentCreate: MuiSvgIcon

  def ContentDrafts: MuiSvgIcon

  def ContentFilterList: MuiSvgIcon

  def ContentFlag: MuiSvgIcon

  def ContentFontDownload: MuiSvgIcon

  def ContentForward: MuiSvgIcon

  def ContentGesture: MuiSvgIcon

  def ContentInbox: MuiSvgIcon

  def ContentLink: MuiSvgIcon

  def ContentMail: MuiSvgIcon

  def ContentMarkunread: MuiSvgIcon

  def ContentMoveToInbox: MuiSvgIcon

  def ContentNextWeek: MuiSvgIcon

  def ContentRedo: MuiSvgIcon

  def ContentRemoveCircleOutline: MuiSvgIcon

  def ContentRemoveCircle: MuiSvgIcon

  def ContentRemove: MuiSvgIcon

  def ContentReplyAll: MuiSvgIcon

  def ContentReply: MuiSvgIcon

  def ContentReport: MuiSvgIcon

  def ContentSave: MuiSvgIcon

  def ContentSelectAll: MuiSvgIcon

  def ContentSend: MuiSvgIcon

  def ContentSort: MuiSvgIcon

  def ContentTextFormat: MuiSvgIcon

  def ContentUnarchive: MuiSvgIcon

  def ContentUndo: MuiSvgIcon

  def ContentWeekend: MuiSvgIcon

  def DeviceAccessAlarm: MuiSvgIcon

  def DeviceAccessAlarms: MuiSvgIcon

  def DeviceAccessTime: MuiSvgIcon

  def DeviceAddAlarm: MuiSvgIcon

  def DeviceAirplanemodeActive: MuiSvgIcon

  def DeviceAirplanemodeInactive: MuiSvgIcon

  def DeviceBattery20: MuiSvgIcon

  def DeviceBattery30: MuiSvgIcon

  def DeviceBattery50: MuiSvgIcon

  def DeviceBattery60: MuiSvgIcon

  def DeviceBattery80: MuiSvgIcon

  def DeviceBattery90: MuiSvgIcon

  def DeviceBatteryAlert: MuiSvgIcon

  def DeviceBatteryCharging20: MuiSvgIcon

  def DeviceBatteryCharging30: MuiSvgIcon

  def DeviceBatteryCharging50: MuiSvgIcon

  def DeviceBatteryCharging60: MuiSvgIcon

  def DeviceBatteryCharging80: MuiSvgIcon

  def DeviceBatteryCharging90: MuiSvgIcon

  def DeviceBatteryChargingFull: MuiSvgIcon

  def DeviceBatteryFull: MuiSvgIcon

  def DeviceBatteryStd: MuiSvgIcon

  def DeviceBatteryUnknown: MuiSvgIcon

  def DeviceBluetoothConnected: MuiSvgIcon

  def DeviceBluetoothDisabled: MuiSvgIcon

  def DeviceBluetoothSearching: MuiSvgIcon

  def DeviceBluetooth: MuiSvgIcon

  def DeviceBrightnessAuto: MuiSvgIcon

  def DeviceBrightnessHigh: MuiSvgIcon

  def DeviceBrightnessLow: MuiSvgIcon

  def DeviceBrightnessMedium: MuiSvgIcon

  def DeviceDataUsage: MuiSvgIcon

  def DeviceDeveloperMode: MuiSvgIcon

  def DeviceDevices: MuiSvgIcon

  def DeviceDvr: MuiSvgIcon

  def DeviceGpsFixed: MuiSvgIcon

  def DeviceGpsNotFixed: MuiSvgIcon

  def DeviceGpsOff: MuiSvgIcon

  def DeviceGraphicEq: MuiSvgIcon

  def DeviceLocationDisabled: MuiSvgIcon

  def DeviceLocationSearching: MuiSvgIcon

  def DeviceNetworkCell: MuiSvgIcon

  def DeviceNetworkWifi: MuiSvgIcon

  def DeviceNfc: MuiSvgIcon

  def DeviceScreenLockLandscape: MuiSvgIcon

  def DeviceScreenLockPortrait: MuiSvgIcon

  def DeviceScreenLockRotation: MuiSvgIcon

  def DeviceScreenRotation: MuiSvgIcon

  def DeviceSdStorage: MuiSvgIcon

  def DeviceSettingsSystemDaydream: MuiSvgIcon

  def DeviceSignalCellular0Bar: MuiSvgIcon

  def DeviceSignalCellular1Bar: MuiSvgIcon

  def DeviceSignalCellular2Bar: MuiSvgIcon

  def DeviceSignalCellular3Bar: MuiSvgIcon

  def DeviceSignalCellular4Bar: MuiSvgIcon

  def DeviceSignalCellularConnectedNoInternet0Bar: MuiSvgIcon

  def DeviceSignalCellularConnectedNoInternet1Bar: MuiSvgIcon

  def DeviceSignalCellularConnectedNoInternet2Bar: MuiSvgIcon

  def DeviceSignalCellularConnectedNoInternet3Bar: MuiSvgIcon

  def DeviceSignalCellularConnectedNoInternet4Bar: MuiSvgIcon

  def DeviceSignalCellularNoSim: MuiSvgIcon

  def DeviceSignalCellularNull: MuiSvgIcon

  def DeviceSignalCellularOff: MuiSvgIcon

  def DeviceSignalWifi0Bar: MuiSvgIcon

  def DeviceSignalWifi1BarLock: MuiSvgIcon

  def DeviceSignalWifi1Bar: MuiSvgIcon

  def DeviceSignalWifi2BarLock: MuiSvgIcon

  def DeviceSignalWifi2Bar: MuiSvgIcon

  def DeviceSignalWifi3BarLock: MuiSvgIcon

  def DeviceSignalWifi3Bar: MuiSvgIcon

  def DeviceSignalWifi4BarLock: MuiSvgIcon

  def DeviceSignalWifi4Bar: MuiSvgIcon

  def DeviceSignalWifiOff: MuiSvgIcon

  def DeviceStorage: MuiSvgIcon

  def DeviceUsb: MuiSvgIcon

  def DeviceWallpaper: MuiSvgIcon

  def DeviceWidgets: MuiSvgIcon

  def DeviceWifiLock: MuiSvgIcon

  def DeviceWifiTethering: MuiSvgIcon

  def EditorAttachFile: MuiSvgIcon

  def EditorAttachMoney: MuiSvgIcon

  def EditorBorderAll: MuiSvgIcon

  def EditorBorderBottom: MuiSvgIcon

  def EditorBorderClear: MuiSvgIcon

  def EditorBorderColor: MuiSvgIcon

  def EditorBorderHorizontal: MuiSvgIcon

  def EditorBorderInner: MuiSvgIcon

  def EditorBorderLeft: MuiSvgIcon

  def EditorBorderOuter: MuiSvgIcon

  def EditorBorderRight: MuiSvgIcon

  def EditorBorderStyle: MuiSvgIcon

  def EditorBorderTop: MuiSvgIcon

  def EditorBorderVertical: MuiSvgIcon

  def EditorDragHandle: MuiSvgIcon

  def EditorFormatAlignCenter: MuiSvgIcon

  def EditorFormatAlignJustify: MuiSvgIcon

  def EditorFormatAlignLeft: MuiSvgIcon

  def EditorFormatAlignRight: MuiSvgIcon

  def EditorFormatBold: MuiSvgIcon

  def EditorFormatClear: MuiSvgIcon

  def EditorFormatColorFill: MuiSvgIcon

  def EditorFormatColorReset: MuiSvgIcon

  def EditorFormatColorText: MuiSvgIcon

  def EditorFormatIndentDecrease: MuiSvgIcon

  def EditorFormatIndentIncrease: MuiSvgIcon

  def EditorFormatItalic: MuiSvgIcon

  def EditorFormatLineSpacing: MuiSvgIcon

  def EditorFormatListBulleted: MuiSvgIcon

  def EditorFormatListNumbered: MuiSvgIcon

  def EditorFormatPaint: MuiSvgIcon

  def EditorFormatQuote: MuiSvgIcon

  def EditorFormatShapes: MuiSvgIcon

  def EditorFormatSize: MuiSvgIcon

  def EditorFormatStrikethrough: MuiSvgIcon

  def EditorFormatTextdirectionLToR: MuiSvgIcon

  def EditorFormatTextdirectionRToL: MuiSvgIcon

  def EditorFormatUnderlined: MuiSvgIcon

  def EditorFunctions: MuiSvgIcon

  def EditorHighlight: MuiSvgIcon

  def EditorInsertChart: MuiSvgIcon

  def EditorInsertComment: MuiSvgIcon

  def EditorInsertDriveFile: MuiSvgIcon

  def EditorInsertEmoticon: MuiSvgIcon

  def EditorInsertInvitation: MuiSvgIcon

  def EditorInsertLink: MuiSvgIcon

  def EditorInsertPhoto: MuiSvgIcon

  def EditorLinearScale: MuiSvgIcon

  def EditorMergeType: MuiSvgIcon

  def EditorModeComment: MuiSvgIcon

  def EditorModeEdit: MuiSvgIcon

  def EditorMoneyOff: MuiSvgIcon

  def EditorPublish: MuiSvgIcon

  def EditorShortText: MuiSvgIcon

  def EditorSpaceBar: MuiSvgIcon

  def EditorStrikethroughS: MuiSvgIcon

  def EditorTextFields: MuiSvgIcon

  def EditorVerticalAlignBottom: MuiSvgIcon

  def EditorVerticalAlignCenter: MuiSvgIcon

  def EditorVerticalAlignTop: MuiSvgIcon

  def EditorWrapText: MuiSvgIcon

  def FileAttachment: MuiSvgIcon

  def FileCloudCircle: MuiSvgIcon

  def FileCloudDone: MuiSvgIcon

  def FileCloudDownload: MuiSvgIcon

  def FileCloudOff: MuiSvgIcon

  def FileCloudQueue: MuiSvgIcon

  def FileCloudUpload: MuiSvgIcon

  def FileCloud: MuiSvgIcon

  def FileCreateNewFolder: MuiSvgIcon

  def FileFileDownload: MuiSvgIcon

  def FileFileUpload: MuiSvgIcon

  def FileFolderOpen: MuiSvgIcon

  def FileFolderShared: MuiSvgIcon

  def FileFolder: MuiSvgIcon

  def HardwareCastConnected: MuiSvgIcon

  def HardwareCast: MuiSvgIcon

  def HardwareComputer: MuiSvgIcon

  def HardwareDesktopMac: MuiSvgIcon

  def HardwareDesktopWindows: MuiSvgIcon

  def HardwareDeveloperBoard: MuiSvgIcon

  def HardwareDeviceHub: MuiSvgIcon

  def HardwareDevicesOther: MuiSvgIcon

  def HardwareDock: MuiSvgIcon

  def HardwareGamepad: MuiSvgIcon

  def HardwareHeadsetMic: MuiSvgIcon

  def HardwareHeadset: MuiSvgIcon

  def HardwareKeyboardArrowDown: MuiSvgIcon

  def HardwareKeyboardArrowLeft: MuiSvgIcon

  def HardwareKeyboardArrowRight: MuiSvgIcon

  def HardwareKeyboardArrowUp: MuiSvgIcon

  def HardwareKeyboardBackspace: MuiSvgIcon

  def HardwareKeyboardCapslock: MuiSvgIcon

  def HardwareKeyboardHide: MuiSvgIcon

  def HardwareKeyboardReturn: MuiSvgIcon

  def HardwareKeyboardTab: MuiSvgIcon

  def HardwareKeyboardVoice: MuiSvgIcon

  def HardwareKeyboard: MuiSvgIcon

  def HardwareLaptopChromebook: MuiSvgIcon

  def HardwareLaptopMac: MuiSvgIcon

  def HardwareLaptopWindows: MuiSvgIcon

  def HardwareLaptop: MuiSvgIcon

  def HardwareMemory: MuiSvgIcon

  def HardwareMouse: MuiSvgIcon

  def HardwarePhoneAndroid: MuiSvgIcon

  def HardwarePhoneIphone: MuiSvgIcon

  def HardwarePhonelinkOff: MuiSvgIcon

  def HardwarePhonelink: MuiSvgIcon

  def HardwarePowerInput: MuiSvgIcon

  def HardwareRouter: MuiSvgIcon

  def HardwareScanner: MuiSvgIcon

  def HardwareSecurity: MuiSvgIcon

  def HardwareSimCard: MuiSvgIcon

  def HardwareSmartphone: MuiSvgIcon

  def HardwareSpeakerGroup: MuiSvgIcon

  def HardwareSpeaker: MuiSvgIcon

  def HardwareTabletAndroid: MuiSvgIcon

  def HardwareTabletMac: MuiSvgIcon

  def HardwareTablet: MuiSvgIcon

  def HardwareToys: MuiSvgIcon

  def HardwareTv: MuiSvgIcon

  def HardwareVideogameAsset: MuiSvgIcon

  def HardwareWatch: MuiSvgIcon

  def ImageAddAPhoto: MuiSvgIcon

  def ImageAddToPhotos: MuiSvgIcon

  def ImageAdjust: MuiSvgIcon

  def ImageAssistantPhoto: MuiSvgIcon

  def ImageAssistant: MuiSvgIcon

  def ImageAudiotrack: MuiSvgIcon

  def ImageBlurCircular: MuiSvgIcon

  def ImageBlurLinear: MuiSvgIcon

  def ImageBlurOff: MuiSvgIcon

  def ImageBlurOn: MuiSvgIcon

  def ImageBrightness1: MuiSvgIcon

  def ImageBrightness2: MuiSvgIcon

  def ImageBrightness3: MuiSvgIcon

  def ImageBrightness4: MuiSvgIcon

  def ImageBrightness5: MuiSvgIcon

  def ImageBrightness6: MuiSvgIcon

  def ImageBrightness7: MuiSvgIcon

  def ImageBrokenImage: MuiSvgIcon

  def ImageBrush: MuiSvgIcon

  def ImageCameraAlt: MuiSvgIcon

  def ImageCameraFront: MuiSvgIcon

  def ImageCameraRear: MuiSvgIcon

  def ImageCameraRoll: MuiSvgIcon

  def ImageCamera: MuiSvgIcon

  def ImageCenterFocusStrong: MuiSvgIcon

  def ImageCenterFocusWeak: MuiSvgIcon

  def ImageCollectionsBookmark: MuiSvgIcon

  def ImageCollections: MuiSvgIcon

  def ImageColorLens: MuiSvgIcon

  def ImageColorize: MuiSvgIcon

  def ImageCompare: MuiSvgIcon

  def ImageControlPointDuplicate: MuiSvgIcon

  def ImageControlPoint: MuiSvgIcon

  def ImageCrop169: MuiSvgIcon

  def ImageCrop32: MuiSvgIcon

  def ImageCrop54: MuiSvgIcon

  def ImageCrop75: MuiSvgIcon

  def ImageCropDin: MuiSvgIcon

  def ImageCropFree: MuiSvgIcon

  def ImageCropLandscape: MuiSvgIcon

  def ImageCropOriginal: MuiSvgIcon

  def ImageCropPortrait: MuiSvgIcon

  def ImageCropRotate: MuiSvgIcon

  def ImageCropSquare: MuiSvgIcon

  def ImageCrop: MuiSvgIcon

  def ImageDehaze: MuiSvgIcon

  def ImageDetails: MuiSvgIcon

  def ImageEdit: MuiSvgIcon

  def ImageExposureNeg1: MuiSvgIcon

  def ImageExposureNeg2: MuiSvgIcon

  def ImageExposurePlus1: MuiSvgIcon

  def ImageExposurePlus2: MuiSvgIcon

  def ImageExposureZero: MuiSvgIcon

  def ImageExposure: MuiSvgIcon

  def ImageFilter1: MuiSvgIcon

  def ImageFilter2: MuiSvgIcon

  def ImageFilter3: MuiSvgIcon

  def ImageFilter4: MuiSvgIcon

  def ImageFilter5: MuiSvgIcon

  def ImageFilter6: MuiSvgIcon

  def ImageFilter7: MuiSvgIcon

  def ImageFilter8: MuiSvgIcon

  def ImageFilter9Plus: MuiSvgIcon

  def ImageFilter9: MuiSvgIcon

  def ImageFilterBAndW: MuiSvgIcon

  def ImageFilterCenterFocus: MuiSvgIcon

  def ImageFilterDrama: MuiSvgIcon

  def ImageFilterFrames: MuiSvgIcon

  def ImageFilterHdr: MuiSvgIcon

  def ImageFilterNone: MuiSvgIcon

  def ImageFilterTiltShift: MuiSvgIcon

  def ImageFilterVintage: MuiSvgIcon

  def ImageFilter: MuiSvgIcon

  def ImageFlare: MuiSvgIcon

  def ImageFlashAuto: MuiSvgIcon

  def ImageFlashOff: MuiSvgIcon

  def ImageFlashOn: MuiSvgIcon

  def ImageFlip: MuiSvgIcon

  def ImageGradient: MuiSvgIcon

  def ImageGrain: MuiSvgIcon

  def ImageGridOff: MuiSvgIcon

  def ImageGridOn: MuiSvgIcon

  def ImageHdrOff: MuiSvgIcon

  def ImageHdrOn: MuiSvgIcon

  def ImageHdrStrong: MuiSvgIcon

  def ImageHdrWeak: MuiSvgIcon

  def ImageHealing: MuiSvgIcon

  def ImageImageAspectRatio: MuiSvgIcon

  def ImageImage: MuiSvgIcon

  def ImageIso: MuiSvgIcon

  def ImageLandscape: MuiSvgIcon

  def ImageLeakAdd: MuiSvgIcon

  def ImageLeakRemove: MuiSvgIcon

  def ImageLens: MuiSvgIcon

  def ImageLinkedCamera: MuiSvgIcon

  def ImageLooks3: MuiSvgIcon

  def ImageLooks4: MuiSvgIcon

  def ImageLooks5: MuiSvgIcon

  def ImageLooks6: MuiSvgIcon

  def ImageLooksOne: MuiSvgIcon

  def ImageLooksTwo: MuiSvgIcon

  def ImageLooks: MuiSvgIcon

  def ImageLoupe: MuiSvgIcon

  def ImageMonochromePhotos: MuiSvgIcon

  def ImageMovieCreation: MuiSvgIcon

  def ImageMovieFilter: MuiSvgIcon

  def ImageMusicNote: MuiSvgIcon

  def ImageNaturePeople: MuiSvgIcon

  def ImageNature: MuiSvgIcon

  def ImageNavigateBefore: MuiSvgIcon

  def ImageNavigateNext: MuiSvgIcon

  def ImagePalette: MuiSvgIcon

  def ImagePanoramaFishEye: MuiSvgIcon

  def ImagePanoramaHorizontal: MuiSvgIcon

  def ImagePanoramaVertical: MuiSvgIcon

  def ImagePanoramaWideAngle: MuiSvgIcon

  def ImagePanorama: MuiSvgIcon

  def ImagePhotoAlbum: MuiSvgIcon

  def ImagePhotoCamera: MuiSvgIcon

  def ImagePhotoFilter: MuiSvgIcon

  def ImagePhotoLibrary: MuiSvgIcon

  def ImagePhotoSizeSelectActual: MuiSvgIcon

  def ImagePhotoSizeSelectLarge: MuiSvgIcon

  def ImagePhotoSizeSelectSmall: MuiSvgIcon

  def ImagePhoto: MuiSvgIcon

  def ImagePictureAsPdf: MuiSvgIcon

  def ImagePortrait: MuiSvgIcon

  def ImageRemoveRedEye: MuiSvgIcon

  def ImageRotate90DegreesCcw: MuiSvgIcon

  def ImageRotateLeft: MuiSvgIcon

  def ImageRotateRight: MuiSvgIcon

  def ImageSlideshow: MuiSvgIcon

  def ImageStraighten: MuiSvgIcon

  def ImageStyle: MuiSvgIcon

  def ImageSwitchCamera: MuiSvgIcon

  def ImageSwitchVideo: MuiSvgIcon

  def ImageTagFaces: MuiSvgIcon

  def ImageTexture: MuiSvgIcon

  def ImageTimelapse: MuiSvgIcon

  def ImageTimer10: MuiSvgIcon

  def ImageTimer3: MuiSvgIcon

  def ImageTimerOff: MuiSvgIcon

  def ImageTimer: MuiSvgIcon

  def ImageTonality: MuiSvgIcon

  def ImageTransform: MuiSvgIcon

  def ImageTune: MuiSvgIcon

  def ImageViewComfy: MuiSvgIcon

  def ImageViewCompact: MuiSvgIcon

  def ImageVignette: MuiSvgIcon

  def ImageWbAuto: MuiSvgIcon

  def ImageWbCloudy: MuiSvgIcon

  def ImageWbIncandescent: MuiSvgIcon

  def ImageWbIridescent: MuiSvgIcon

  def ImageWbSunny: MuiSvgIcon

  def MapsAddLocation: MuiSvgIcon

  def MapsBeenhere: MuiSvgIcon

  def MapsDirectionsBike: MuiSvgIcon

  def MapsDirectionsBoat: MuiSvgIcon

  def MapsDirectionsBus: MuiSvgIcon

  def MapsDirectionsCar: MuiSvgIcon

  def MapsDirectionsRailway: MuiSvgIcon

  def MapsDirectionsRun: MuiSvgIcon

  def MapsDirectionsSubway: MuiSvgIcon

  def MapsDirectionsTransit: MuiSvgIcon

  def MapsDirectionsWalk: MuiSvgIcon

  def MapsDirections: MuiSvgIcon

  def MapsEditLocation: MuiSvgIcon

  def MapsFlight: MuiSvgIcon

  def MapsHotel: MuiSvgIcon

  def MapsLayersClear: MuiSvgIcon

  def MapsLayers: MuiSvgIcon

  def MapsLocalActivity: MuiSvgIcon

  def MapsLocalAirport: MuiSvgIcon

  def MapsLocalAtm: MuiSvgIcon

  def MapsLocalBar: MuiSvgIcon

  def MapsLocalCafe: MuiSvgIcon

  def MapsLocalCarWash: MuiSvgIcon

  def MapsLocalConvenienceStore: MuiSvgIcon

  def MapsLocalDining: MuiSvgIcon

  def MapsLocalDrink: MuiSvgIcon

  def MapsLocalFlorist: MuiSvgIcon

  def MapsLocalGasStation: MuiSvgIcon

  def MapsLocalGroceryStore: MuiSvgIcon

  def MapsLocalHospital: MuiSvgIcon

  def MapsLocalHotel: MuiSvgIcon

  def MapsLocalLaundryService: MuiSvgIcon

  def MapsLocalLibrary: MuiSvgIcon

  def MapsLocalMall: MuiSvgIcon

  def MapsLocalMovies: MuiSvgIcon

  def MapsLocalOffer: MuiSvgIcon

  def MapsLocalParking: MuiSvgIcon

  def MapsLocalPharmacy: MuiSvgIcon

  def MapsLocalPhone: MuiSvgIcon

  def MapsLocalPizza: MuiSvgIcon

  def MapsLocalPlay: MuiSvgIcon

  def MapsLocalPostOffice: MuiSvgIcon

  def MapsLocalPrintshop: MuiSvgIcon

  def MapsLocalSee: MuiSvgIcon

  def MapsLocalShipping: MuiSvgIcon

  def MapsLocalTaxi: MuiSvgIcon

  def MapsMap: MuiSvgIcon

  def MapsMyLocation: MuiSvgIcon

  def MapsNavigation: MuiSvgIcon

  def MapsNearMe: MuiSvgIcon

  def MapsPersonPinCircle: MuiSvgIcon

  def MapsPersonPin: MuiSvgIcon

  def MapsPinDrop: MuiSvgIcon

  def MapsPlace: MuiSvgIcon

  def MapsRateReview: MuiSvgIcon

  def MapsRestaurantMenu: MuiSvgIcon

  def MapsSatellite: MuiSvgIcon

  def MapsStoreMallDirectory: MuiSvgIcon

  def MapsTerrain: MuiSvgIcon

  def MapsTraffic: MuiSvgIcon

  def MapsZoomOutMap: MuiSvgIcon

  def NavigationApps: MuiSvgIcon

  def NavigationArrowBack: MuiSvgIcon

  def NavigationArrowDownward: MuiSvgIcon

  def NavigationArrowDropDownCircle: MuiSvgIcon

  def NavigationArrowDropDown: MuiSvgIcon

  def NavigationArrowDropUp: MuiSvgIcon

  def NavigationArrowForward: MuiSvgIcon

  def NavigationArrowUpward: MuiSvgIcon

  def NavigationCancel: MuiSvgIcon

  def NavigationCheck: MuiSvgIcon

  def NavigationChevronLeft: MuiSvgIcon

  def NavigationChevronRight: MuiSvgIcon

  def NavigationClose: MuiSvgIcon

  def NavigationExpandLess: MuiSvgIcon

  def NavigationExpandMore: MuiSvgIcon

  def NavigationFullscreenExit: MuiSvgIcon

  def NavigationFullscreen: MuiSvgIcon

  def NavigationMenu: MuiSvgIcon

  def NavigationMoreHoriz: MuiSvgIcon

  def NavigationMoreVert: MuiSvgIcon

  def NavigationRefresh: MuiSvgIcon

  def NavigationSubdirectoryArrowLeft: MuiSvgIcon

  def NavigationSubdirectoryArrowRight: MuiSvgIcon

  def NavigationUnfoldLess: MuiSvgIcon

  def NavigationUnfoldMore: MuiSvgIcon

  def NavigationArrowDropRight: MuiSvgIcon

  def NotificationAdb: MuiSvgIcon

  def NotificationAirlineSeatFlatAngled: MuiSvgIcon

  def NotificationAirlineSeatFlat: MuiSvgIcon

  def NotificationAirlineSeatIndividualSuite: MuiSvgIcon

  def NotificationAirlineSeatLegroomExtra: MuiSvgIcon

  def NotificationAirlineSeatLegroomNormal: MuiSvgIcon

  def NotificationAirlineSeatLegroomReduced: MuiSvgIcon

  def NotificationAirlineSeatReclineExtra: MuiSvgIcon

  def NotificationAirlineSeatReclineNormal: MuiSvgIcon

  def NotificationBluetoothAudio: MuiSvgIcon

  def NotificationConfirmationNumber: MuiSvgIcon

  def NotificationDiscFull: MuiSvgIcon

  def NotificationDoNotDisturbAlt: MuiSvgIcon

  def NotificationDoNotDisturb: MuiSvgIcon

  def NotificationDriveEta: MuiSvgIcon

  def NotificationEnhancedEncryption: MuiSvgIcon

  def NotificationEventAvailable: MuiSvgIcon

  def NotificationEventBusy: MuiSvgIcon

  def NotificationEventNote: MuiSvgIcon

  def NotificationFolderSpecial: MuiSvgIcon

  def NotificationLiveTv: MuiSvgIcon

  def NotificationMms: MuiSvgIcon

  def NotificationMore: MuiSvgIcon

  def NotificationNetworkCheck: MuiSvgIcon

  def NotificationNetworkLocked: MuiSvgIcon

  def NotificationNoEncryption: MuiSvgIcon

  def NotificationOndemandVideo: MuiSvgIcon

  def NotificationPersonalVideo: MuiSvgIcon

  def NotificationPhoneBluetoothSpeaker: MuiSvgIcon

  def NotificationPhoneForwarded: MuiSvgIcon

  def NotificationPhoneInTalk: MuiSvgIcon

  def NotificationPhoneLocked: MuiSvgIcon

  def NotificationPhoneMissed: MuiSvgIcon

  def NotificationPhonePaused: MuiSvgIcon

  def NotificationPower: MuiSvgIcon

  def NotificationRvHookup: MuiSvgIcon

  def NotificationSdCard: MuiSvgIcon

  def NotificationSimCardAlert: MuiSvgIcon

  def NotificationSmsFailed: MuiSvgIcon

  def NotificationSms: MuiSvgIcon

  def NotificationSyncDisabled: MuiSvgIcon

  def NotificationSyncProblem: MuiSvgIcon

  def NotificationSync: MuiSvgIcon

  def NotificationSystemUpdate: MuiSvgIcon

  def NotificationTapAndPlay: MuiSvgIcon

  def NotificationTimeToLeave: MuiSvgIcon

  def NotificationVibration: MuiSvgIcon

  def NotificationVoiceChat: MuiSvgIcon

  def NotificationVpnLock: MuiSvgIcon

  def NotificationWc: MuiSvgIcon

  def NotificationWifi: MuiSvgIcon

  def PlacesAcUnit: MuiSvgIcon

  def PlacesAirportShuttle: MuiSvgIcon

  def PlacesAllInclusive: MuiSvgIcon

  def PlacesBeachAccess: MuiSvgIcon

  def PlacesBusinessCenter: MuiSvgIcon

  def PlacesCasino: MuiSvgIcon

  def PlacesChildCare: MuiSvgIcon

  def PlacesChildFriendly: MuiSvgIcon

  def PlacesFitnessCenter: MuiSvgIcon

  def PlacesFreeBreakfast: MuiSvgIcon

  def PlacesGolfCourse: MuiSvgIcon

  def PlacesHotTub: MuiSvgIcon

  def PlacesKitchen: MuiSvgIcon

  def PlacesPool: MuiSvgIcon

  def PlacesRoomService: MuiSvgIcon

  def PlacesSmokeFree: MuiSvgIcon

  def PlacesSmokingRooms: MuiSvgIcon

  def PlacesSpa: MuiSvgIcon

  def SocialCake: MuiSvgIcon

  def SocialDomain: MuiSvgIcon

  def SocialGroupAdd: MuiSvgIcon

  def SocialGroup: MuiSvgIcon

  def SocialLocationCity: MuiSvgIcon

  def SocialMoodBad: MuiSvgIcon

  def SocialMood: MuiSvgIcon

  def SocialNotificationsActive: MuiSvgIcon

  def SocialNotificationsNone: MuiSvgIcon

  def SocialNotificationsOff: MuiSvgIcon

  def SocialNotificationsPaused: MuiSvgIcon

  def SocialNotifications: MuiSvgIcon

  def SocialPages: MuiSvgIcon

  def SocialPartyMode: MuiSvgIcon

  def SocialPeopleOutline: MuiSvgIcon

  def SocialPeople: MuiSvgIcon

  def SocialPersonAdd: MuiSvgIcon

  def SocialPersonOutline: MuiSvgIcon

  def SocialPerson: MuiSvgIcon

  def SocialPlusOne: MuiSvgIcon

  def SocialPoll: MuiSvgIcon

  def SocialPublic: MuiSvgIcon

  def SocialSchool: MuiSvgIcon

  def SocialShare: MuiSvgIcon

  def SocialWhatshot: MuiSvgIcon

  def ToggleCheckBoxOutlineBlank: MuiSvgIcon

  def ToggleCheckBox: MuiSvgIcon

  def ToggleIndeterminateCheckBox: MuiSvgIcon

  def ToggleRadioButtonChecked: MuiSvgIcon

  def ToggleRadioButtonUnchecked: MuiSvgIcon

  def ToggleStarBorder: MuiSvgIcon

  def ToggleStarHalf: MuiSvgIcon

  def ToggleStar: MuiSvgIcon
}

