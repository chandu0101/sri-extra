package demo
package screens

import demo.components.{LeftNavPage, WithAsyncScript}
import demo.routes.MuiRouteModule
import sri.core.ReactElement
import sri.web.all._

object MuiScreen {

  val component = (props: Props) => {
    WithAsyncScript("assets/material_ui-bundle.js")(
      LeftNavPage(MuiRouteModule.menu, props.selectedRender)
    )
  }

  case class Props(selectedRender: () => ReactElement)

  def apply(selectedRender: () => ReactElement) = createStatelessFunctionElement(component, Props(selectedRender))

}
