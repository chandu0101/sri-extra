package sri.extra.web

import sri.core._

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.`|`

package object components {
  /* this works here, but not in the general case!
  * (see https://github.com/scala-js/scala-js/pull/2070 )
  */
//  @deprecated("We need to find a better solution here")
  implicit def UnionEvidence[A: ClassTag, B: ClassTag](ab: A | B)(implicit eva: A => js.Any, evb: B => js.Any): js.Any =
    ab match {
      case a: A => eva(a)
      case b: B => evb(b)
    }

}
