package ch_13_dsl.kotest

import org.junit.Test


class PrefixTest {

    @Test
    fun testPrefix() {
        val s = "kotlin".uppercase()
        s should startWith("K")
    }
}