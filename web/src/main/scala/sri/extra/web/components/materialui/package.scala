package sri.extra.web.components

import sri.core.{React, ReactNode}

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.`|`

package object materialui {


  object components extends MuiComponents


  implicit def nodeToJAny(node: ReactNode): js.Any = node.asInstanceOf[js.Any]

  val muiContextTypes = js.Dictionary("muiTheme" -> React.PropTypes.`object`.isRequired)

}
