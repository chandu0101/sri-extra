package demo.components.materialui

import demo.components.CodeExample

import scala.scalajs.js
import scala.scalajs.js.`|`


object MuiTableDemo {
//  val code = GhPagesMacros.exampleSource
//
//  // EXAMPLE:START
//
//  case class State(
//    fixedHeader: Boolean,
//    fixedFooter: Boolean,
//    stripedRows: Boolean,
//    showRowHover: Boolean,
//    selectable: Boolean,
//    multiSelectable: Boolean,
//    enableSelectAll: Boolean,
//    deselectOnClickaway: Boolean,
//    height: String,
//    selected: String | js.Array[Int]
//  )
//
//  case class Backend($: BackendScope[Unit, State]) {
//    val onRowSelection: String | js.Array[Int] => Callback =
//      rows => $.modState(_.copy(selected = rows)) >>
//        Callback.info(s"selected $rows")
//
//    val toggleMultiSelectable: (ReactEvent, Boolean) => Callback =
//      (e, b) => $.modState(_.copy(multiSelectable = b))
//    val toggleEnableSelectAll: (ReactEvent, Boolean) => Callback =
//      (e, b) => $.modState(_.copy(enableSelectAll = b))
//    val toggleDeselectOnClickaway: (ReactEvent, Boolean) => Callback =
//      (e, b) => $.modState(_.copy(deselectOnClickaway = b))
//    val toggleSelectable: (ReactEvent, Boolean) => Callback =
//      (e, b) => $.modState(_.copy(selectable = b))
//    val toggleFixedHeader: (ReactEvent, Boolean) => Callback =
//      (e, b) => $.modState(_.copy(fixedHeader = b))
//    val toggleFixedFooter: (ReactEvent, Boolean) => Callback =
//      (e, b) => $.modState(_.copy(fixedFooter = b))
//
//    val colNames = MuiTableRow()(
//      MuiTableHeaderColumn(tooltip = "The ID")("ID"),
//      MuiTableHeaderColumn(tooltip = "The Name")("Name"),
//      MuiTableHeaderColumn(tooltip = "The Status")("Status")
//    )
//    case class Person(id: String, name: String, status: String)
//
//    val persons = List(
//      Person("1", "John Smith", "Employed"),
//      Person("2", "Randal White", "Unemployed"),
//      Person("4", "Steve Brown", "Employed"),
//      Person("6", "Samuel Roberts", "Unemployed"),
//      Person("7", "Adam Moore", "Employed")
//    )
//
//    def renderPersons(selecteds: String | js.Array[Int]): List[ReactComponentU_] =
//      persons.zipWithIndex.map {
//        case (p, idx) =>
//          val selected = selecteds match {
//            case a: js.Array[_] => a.contains(idx)
//            case all => true
//          }
//          MuiTableRow(selected = selected)(
//            MuiTableRowColumn()(p.id),
//            MuiTableRowColumn()(p.name),
//            MuiTableRowColumn()(p.status)
//          )
//      }
//
//    def render(S: State) =
//      CodeExample(code, "MuiTable")(
//        <.div(
//          MuiTable(
//            key                 = S.toString,
//            height              = S.height,
//            fixedHeader         = S.fixedHeader,
//            fixedFooter         = S.fixedFooter,
//            selectable          = S.selectable,
//            multiSelectable     = S.multiSelectable,
//            onRowSelection      = onRowSelection
//          )(
//            MuiTableHeader(enableSelectAll = S.enableSelectAll)(
//              MuiTableRow()(
//                MuiTableHeaderColumn(
//                  tooltip = "Super Header",
//                  style = js.Dynamic.literal("textAlign" -> "center"))()
//              ),
//              colNames
//            ),
//            MuiTableBody(
//              deselectOnClickaway = S.deselectOnClickaway,
//              showRowHover = S.showRowHover,
//              stripedRows = S.stripedRows
//            )(
//              renderPersons(S.selected) :_*
//            ),
//            MuiTableFooter()(
//              colNames,
//              MuiTableRow(style = js.Dynamic.literal("textAlign" -> "center"))()
//            )
//          ),
//          MuiPaper(rounded = true, style = js.Dynamic.literal("width" -> "300", "padding" -> "20px"))(
//            MuiToggle(
//              label = "selectable",
//              defaultToggled = S.selectable,
//              onToggle = toggleSelectable
//            )(),
//            MuiToggle(
//              label = "multiSelectable",
//              defaultToggled = S.multiSelectable,
//              onToggle = toggleMultiSelectable
//            )(),
//            MuiToggle(
//              label = "enableSelectAll",
//              defaultToggled = S.enableSelectAll,
//              onToggle = toggleEnableSelectAll
//            )(),
//            MuiToggle(
//              label = "deselectOnClickaway",
//              defaultToggled = S.deselectOnClickaway,
//              onToggle = toggleDeselectOnClickaway
//            )(),
//            MuiToggle(
//              label = "fixedHeader",
//              defaultToggled = S.fixedHeader,
//              onToggle = toggleFixedHeader
//            )(),
//            MuiToggle(
//              label = "fixedFooter",
//              defaultToggled = S.fixedFooter,
//              onToggle = toggleFixedFooter
//            )()
//          )
//        )
//      )
//  }
//
//  val component = ReactComponentB[Unit]("MuiTableDemo")
//    .initialState(State(
//      fixedHeader = false,
//      fixedFooter = false,
//      stripedRows = true,
//      showRowHover = true,
//      selectable = true,
//      multiSelectable = false,
//      enableSelectAll = false,
//      deselectOnClickaway = true,
//      height = "400px",
//      selected = js.Array[Int]()
//    ))
//    .renderBackend[Backend]
//    .buildU
//
//  // EXAMPLE:END
//
//  def apply() = component()
}
