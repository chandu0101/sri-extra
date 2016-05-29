package demo

import demo.styles.AppStyles
import demo.routes.AppRouter
import org.scalajs.dom
import sri.web.ReactDOM

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.JSApp

object ReactApp extends JSApp {

  override def main(): Unit = {
    // remove waiting page stuff
    if (!js.isUndefined(g.loadingElement)) {
      g.document.body.removeChild(g.loadingElement)
      g.loadingElement = js.undefined
      dom.document.body.className.replace("pg-loading", "")
      dom.document.body.className += " pg-loaded"
    }
    AppStyles.load()
    ReactDOM.render(AppRouter.router, dom.document.getElementById("container"))
  }
}