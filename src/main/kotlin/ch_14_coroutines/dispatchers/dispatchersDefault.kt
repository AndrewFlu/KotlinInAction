package ch_14_coroutines.dispatchers

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        log("Doing some work")
        //  устанавливаем диспетчер корутин по умолчанию (Dispatchers.Default)
        launch(Dispatchers.Default) {
            log("Doing some background work")
        }
    }
}