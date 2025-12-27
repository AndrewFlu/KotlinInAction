//package ch_09_operators.delegates.how_to_use_in_framework
//
//object UserTable : IdTable() {
//    // свойства соответствуют столбцам этой таблицы
//    val name: Column<String> = varchar("name", length = 50).index()
//    val age: Column<Int> = integer("age")
//}
//
//// Каждый экземпляр класса User соответствует определённой сущности в таблице
//class User(id: EntityID) : Entity(id) {
//    // для этого пользователя в БД хранятся значения имени и возраста
//    var name: String by UserTable.name // объект Usertable.name — делегат для свойства name
//    var age: Int by UserTable.age
//}