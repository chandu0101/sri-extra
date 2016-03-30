package sri.web.extra.components.materialui

import chandu0101.macros.tojs.JSMacro
import sri.core.React

import scala.scalajs.js

/**
 * This file is generated - submit issues instead of PR against it
 */

case class MuiLinearProgress(
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
                              value: js.UndefOr[Double] = js.undefined) {

  def apply() = {
    val props = JSMacro[MuiLinearProgress](this)
    React.createElement(Mui.LinearProgress, props)
  }
}
        
