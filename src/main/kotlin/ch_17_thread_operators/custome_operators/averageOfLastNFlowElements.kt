package ch_17_thread_operators.custome_operators

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun Flow<Double>.averageOfLast(n: Int): Flow<Double> =
    flow {
        val numbers = mutableListOf<Double>()
        collect {
            if (numbers.size >= n)
                numbers.removeFirst()
            numbers.add(it)
            emit(numbers.average())
        }
    }

fun main() {
    runBlocking {
        flowOf(1.0, 2.0, 3.0, 4.0)
            .averageOfLast(2)
            .collect { print("$it ")}
    }
}