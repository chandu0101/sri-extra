package demo
package components
package materialui

import demo.macros.GhPagesMacros
import sri.web.all._

object MuiListDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  import sri.extra.web.components.materialui.Mui.SvgIcons.{ActionGrade, ActionInfo, ContentDrafts, ContentInbox, ContentSend}

  val component = () => {
    CodeExample(code, "MuiList")(
      MobileTearSheet(
        MuiList()(
          MuiListItem(
            leftIcon = ContentInbox()()
          )("Inbox"),
          MuiListItem(primaryText = "Starred", leftIcon = ActionGrade()())(),
          MuiListItem(primaryText = "Sent Mail", leftIcon = ContentSend()())(),
          MuiListItem(primaryText = "Drafts", leftIcon = ContentDrafts()())()
        ),
        MuiDivider(),
        MuiList()(
          MuiListItem(primaryText = "All mail", rightIcon = ActionInfo()())(),
          MuiListItem(primaryText = "Trash", rightIcon = ActionInfo()())(),
          MuiListItem(primaryText = "Spam", rightIcon = ActionInfo()())(),
          MuiListItem(primaryText = "Follow up", rightIcon = ActionInfo()())()
        )
      )
    )
  }

  // EXAMPLE:END

  def apply() = createStatelessFunctionElementNoProps(component)

}
