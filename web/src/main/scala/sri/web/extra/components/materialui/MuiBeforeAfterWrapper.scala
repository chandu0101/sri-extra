package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiBeforeAfterWrapper(
                                  key: js.UndefOr[String] = js.undefined,
                                  ref: js.UndefOr[String] = js.undefined,
                                  afterElementType: js.UndefOr[String] = js.undefined,
                                  afterStyle: js.UndefOr[js.Any] = js.undefined,
                                  beforeElementType: js.UndefOr[String] = js.undefined,
                                  beforeStyle: js.UndefOr[js.Any] = js.undefined,
                                  elementType: js.UndefOr[String] = js.undefined,
                                  /* Override the inline-styles of the root element.*/
                                  style: js.UndefOr[js.Any] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiBeforeAfterWrapper](this)
    if (children.isEmpty)
      React.createElement(Mui.BeforeAfterWrapper, props)
    else if (children.size == 1)
      React.createElement(Mui.BeforeAfterWrapper, props, children.head)
    else
      React.createElement(Mui.BeforeAfterWrapper, props, children: _*)
  }
}
