package demo
package routes

import sri.core.ReactElement
import sri.web.router.WebStaticPage


case class LeftRoute(name: String, page: WebStaticPage, component: () => ReactElement)

