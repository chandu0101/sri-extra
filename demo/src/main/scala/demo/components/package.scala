package demo

import sri.core.ReactNode

import scala.scalajs.js

package object components {

  implicit def stringToUndefny(in: String) = in.asInstanceOf[js.UndefOr[js.Any]]


}
