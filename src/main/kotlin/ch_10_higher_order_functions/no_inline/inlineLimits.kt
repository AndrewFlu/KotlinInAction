package ch_10_higher_order_functions.no_inline

// Ограничение для встроенных функций: неверное использование встроенного параметра f
//class FunctionStorage(
//    var myStoredFunction: ((Int) -> Unit)? = null,
//    inline fun storeFunction(f: (Int) -> Unit) {
//    myStoredFunction = f
//}
//) {
//
//}