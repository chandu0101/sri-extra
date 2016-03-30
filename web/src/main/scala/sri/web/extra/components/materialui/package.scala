package sri.web.extra.components


import sri.core.{React, ReactNode}

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.`|`

package object materialui {
  //  def installMuiContext[P, S, B, N <: TopNode](theme: js.UndefOr[MuiRawTheme]): ReactComponentSpec[P, S, B, N] => _ =
  //    ThemeInstaller.installMuiContext(theme)
//  @deprecated("We need to find a better solution here")

  implicit def nodeToJAny(node: ReactNode): js.Any = node.asInstanceOf[js.Any]

  val muiContextTypes = js.Dictionary("muiTheme" -> React.PropTypes.`object`.isRequired)

}
