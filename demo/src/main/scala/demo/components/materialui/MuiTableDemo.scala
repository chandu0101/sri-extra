package demo.components.materialui

import demo.components.CodeExample
import demo.macros.GhPagesMacros

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.{Function1, UndefOr, `|`}
import sri.core._
import sri.universal.components._
import sri.web.all._
import sri.web.vdom.htmltags._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


object MuiTableDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  case class State(
                    fixedHeader: Boolean,
                    fixedFooter: Boolean,
                    stripedRows: Boolean,
                    showRowHover: Boolean,
                    selectable: Boolean,
                    multiSelectable: Boolean,
                    enableSelectAll: Boolean,
                    deselectOnClickaway: Boolean,
                    height: String,
                    selected: String | js.Array[Int]
                    )

  case class Person(id: String, name: String, status: String)


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {
    initialState(State(
      fixedHeader = false,
      fixedFooter = false,
      stripedRows = true,
      showRowHover = true,
      selectable = true,
      multiSelectable = false,
      enableSelectAll = false,
      deselectOnClickaway = true,
      height = "400px",
      selected = js.Array[Int]()
    ))

    def render() = {
      CodeExample(code, "MuiTable")(
        div()(
          MuiTable(
            key = state.toString,
            height = state.height,
            fixedHeader = state.fixedHeader,
            fixedFooter = state.fixedFooter,
            selectable = state.selectable,
            multiSelectable = state.multiSelectable,
            onRowSelection = onRowSelection _
          )(
              MuiTableHeader(enableSelectAll = state.enableSelectAll)(
                MuiTableRow()(
                  MuiTableHeaderColumn(
                    tooltip = "Super Header",
                    style = js.Dynamic.literal("textAlign" -> "center"))()
                ),
                colNames
              ),
              MuiTableBody(
                deselectOnClickaway = state.deselectOnClickaway,
                showRowHover = state.showRowHover,
                stripedRows = state.stripedRows
              )(
                  renderPersons(state.selected)
                ),
              MuiTableFooter()(
                colNames,
                MuiTableRow(style = js.Dynamic.literal("textAlign" -> "center"))()
              )
            ),
          MuiPaper(rounded = true, style = js.Dynamic.literal("width" -> "300px", "padding" -> "20px"))(
            MuiToggle(
              label = "selectable",
              defaultToggled = state.selectable,
              onToggle = toggleSelectable _
            ),
            MuiToggle(
              label = "multiSelectable",
              defaultToggled = state.multiSelectable,
              onToggle = toggleMultiSelectable _
            ),
            MuiToggle(
              label = "enableSelectAll",
              defaultToggled = state.enableSelectAll,
              onToggle = toggleEnableSelectAll _
            ),
            MuiToggle(
              label = "deselectOnClickaway",
              defaultToggled = state.deselectOnClickaway,
              onToggle = toggleDeselectOnClickaway _
            ),
            MuiToggle(
              label = "fixedHeader",
              defaultToggled = state.fixedHeader,
              onToggle = toggleFixedHeader _
            ),
            MuiToggle(
              label = "fixedFooter",
              defaultToggled = state.fixedFooter,
              onToggle = toggleFixedFooter _
            )
          )
        )
      )
    }


    def onRowSelection(rows: String | js.Array[Int]) = {
      setState(state.copy(selected = rows))
    }


    def toggleMultiSelectable(e: ReactEvent, b: Boolean) = {
      setState(state.copy(multiSelectable = b))
    }

    def toggleEnableSelectAll(e: ReactEvent, b: Boolean) = {
      setState(state.copy(enableSelectAll = b))
    }

    def toggleDeselectOnClickaway(e: ReactEvent, b: Boolean) = {
      setState(state.copy(deselectOnClickaway = b))
    }

    def toggleSelectable(e: ReactEvent, b: Boolean) = {
      setState(state.copy(selectable = b))
    }

    def toggleFixedHeader(e: ReactEvent, b: Boolean) = {
      setState(state.copy(fixedHeader = b))
    }

    def toggleFixedFooter(e: ReactEvent, b: Boolean) = {
      setState(state.copy(fixedFooter = b))
    }

    val colNames = MuiTableRow()(
      MuiTableHeaderColumn(tooltip = "The ID")("ID"),
      MuiTableHeaderColumn(tooltip = "The Name")("Name"),
      MuiTableHeaderColumn(tooltip = "The Status")("Status")
    )

    val persons = List(
      Person("1", "John Smith", "Employed"),
      Person("2", "Randal White", "Unemployed"),
      Person("4", "Steve Brown", "Employed"),
      Person("6", "Samuel Roberts", "Unemployed"),
      Person("7", "Adam Moore", "Employed")
    )

    def renderPersons(selecteds: String | js.Array[Int]) =
      persons.zipWithIndex.map {
        case (p, idx) =>
          val selected = selecteds match {
            case a: js.Array[_] => a.contains(idx)
            case all => true
          }
          MuiTableRow(selected = selected,key = idx.toString)(
            MuiTableRowColumn()(p.id),
            MuiTableRowColumn()(p.name),
            MuiTableRowColumn()(p.status)
          )
      }
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])


  // EXAMPLE:END

  def apply() = createElementNoProps(ctor)
}
