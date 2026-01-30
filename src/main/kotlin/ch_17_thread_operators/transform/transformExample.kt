package ch_17_thread_operators.transform

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

fun main() {
    val namesForTranform = flow {
        emit("Juran")
        emit("Jenya")
        emit("Sanya")
    }

    val upperAndLowerCasedNames = namesForTranform.transform {
        emit(it.uppercase())
        emit(it.lowercase())
    }

    runBlocking {
        upperAndLowerCasedNames.collect {
            println(it)
        }
    }
}