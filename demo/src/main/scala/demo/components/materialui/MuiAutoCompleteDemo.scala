package demo.components
package materialui

import demo.macros.GhPagesMacros
import sri.extra.web.components.materialui.{Horizontal, Origin, Vertical}
import sri.web.vdom.htmltagsNoInline._

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, `|`, undefined}

object MuiAutoCompleteDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val fruit = js.Array("Apple", "Apricot", "Avocado", "Banana", "Bilberry", "Blackberry", "Blackcurrant", "Blueberry", "Boysenberry", "Blood Orange", "Cantaloupe", "Currant", "Cherry", "Cherimoya", "Cloudberry", "Coconut", "Cranberry", "Clementine", "Damson", "Date", "Dragonfruit", "Durian", "Elderberry", "Feijoa", "Fig", "Goji berry", "Gooseberry", "Grape", "Grapefruit", "Guava", "Honeydew", "Huckleberry", "Jabouticaba", "Jackfruit", "Jambul", "Jujube", "Juniper berry", "Kiwi fruit", "Kumquat", "Lemon", "Lime", "Loquat", "Lychee", "Nectarine", "Mango", "Marion berry", "Melon", "Miracle fruit", "Mulberry", "Mandarine", "Olive", "Orange", "Papaya", "Passionfruit", "Peach", "Pear", "Persimmon", "Physalis", "Plum", "Pineapple", "Pumpkin", "Pomegranate", "Pomelo", "Purple Mangosteen", "Quince", "Raspberry", "Raisin", "Rambutan", "Redcurrant", "Salal berry", "Satsuma", "Star fruit", "Strawberry", "Squash", "Salmonberry", "Tamarillo", "Tamarind", "Tomato", "Tangerine", "Ugli fruit", "Watermelon")
  val colors = js.Array("Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Black", "White")

  val onUpdateInput =
    (search: String, ds: js.Array[js.Any] | js.Any) => println(s"onUpdateInput: search $search")

  val component = () => {
    CodeExample(code, "MuiAutoComplete")(
      div()(
        MuiAutoComplete(
          floatingLabelText = "Type t, fuzzy search",
          //          filter            = MuiAutoCompleteFilters.fuzzyFilter,
          dataSource = fruit.asInstanceOf,
          anchorOrigin = Origin(Vertical.bottom, Horizontal.middle),
          //          onNewRequest      = onNewRequest,
          onUpdateInput = onUpdateInput
        )
      ),
      div()(
        MuiAutoComplete(
          floatingLabelText = "Type r, case insensitive",
          //          filter            = MuiAutoCompleteFilters.caseInsensitiveFilter,
          dataSource = colors.asInstanceOf,
          //          onNewRequest      = onNewRequest,
          onUpdateInput = onUpdateInput
        )
      )
    )
  }

  // EXAMPLE:END

  def apply() = component()
}
