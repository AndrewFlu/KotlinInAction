package ch_12_annotations_and_reflection.serialization
//
//import kotlin.reflect.KClass
//
//private fun StringBuilder.serializeObject(obj: Any) {
//    val kClass = obj::class as KClass<Any>
//    val members = kClass.members // получение всех свойств класса
//    members.joinToString(this, prefix = "{", postfix = "}") { prop ->
//        serializeString(prop.name) // получение имени свойства
//        append(": ")
//        serializePropertyValue(prop.get(obj)) // получение значения свойства
//    }
//}