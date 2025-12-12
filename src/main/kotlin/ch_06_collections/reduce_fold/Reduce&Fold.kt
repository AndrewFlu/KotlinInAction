package ch_06_collections.reduce_fold

fun main() {
    val list = listOf(1, 2, 3, 4)

    val summed = list.reduce { acc, element ->
        acc + element
    }
    val runningSummed = list.runningReduce{ acc, element ->
        acc + element
    }
    println("reduce(sum elements): $summed")
    println("runningReduce(): $runningSummed")

    val multiplied = list.reduce{ acc, element ->
        acc * element
    }
    val runningMultiplied = list.runningReduce{acc, element ->
        acc * element
    }
    println("reduce(multiply elements): $multiplied")
    println("runningReduce(): $runningMultiplied")
}