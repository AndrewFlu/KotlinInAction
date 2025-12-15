package ch_07_nullable.assert_not_null

class SelectableTextList(
    val contents: List<String>,
    val selectedIndex: Int? = null
)

class CopyRowAction(val list: SelectableTextList) {
    fun isActionEnabled(): Boolean =
        list.selectedIndex != null

    //  функция executeCopyRow() вызывается
    //  только если функция isActionEnabled возвращает значение true
    fun executeCopyRow() {
        val index = list.selectedIndex!!

        val value = list.contents[index]
        // копирование значения в буфер обмена
    }
}

