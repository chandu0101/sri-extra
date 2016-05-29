package demo
package routes

import demo.components.AppHeader
import demo.screens._
import demo.styles.GlobalStyle
import sri.core.ReactElement
import sri.web.router._
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.{UndefOr => U}
import scalacss.Defaults._
import sri.scalacss.Defaults._
object AppRouter {


  case object HomePage extends WebStaticPage


  case object ScalaCSSDoc extends WebStaticPage


  object Config extends WebRouterConfig {

    override val history: History = HistoryFactory.hashHistory()

    override val initialRoute: (WebStaticPage, WebRoute) = defineInitialRoute(HomePage, (route: WebRoute) => HomeScreen())

    moduleRoutes(MuiRouteModule)

    override val notFound: WebRouteNotFound = WebRouteNotFound(initialRoute._1)

    override def renderScene(route: WebRoute): ReactElement = {
      div()(
        AppHeader(),
        super.renderScene(route),
        div(key = "footer",className = GlobalStyle.footer)(
          hr(),
          p()("Built using sri-web")
        )
      )
    }
  }


  val homePageMenu = Vector(
    HomeScreen.ComponentInfo(
      name = "Material UI",
      imagePath = g.materialuiImage.toString,
      route = MuiRouteModule.InfoPage,
      tags = Stream("materialui", "material", "framework")
    )
  )

  val router = WebRouter(Config)

}
