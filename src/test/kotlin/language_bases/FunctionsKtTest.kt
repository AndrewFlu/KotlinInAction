package language_bases

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FunctionsKtTest {

    @Test
    fun min() {
        assertEquals(5, min(7, 5))
    }

    @Test
    fun max() {
        assertEquals(7, max(5, 7))
    }

    @Test
    fun maxWithZero() {
        assertEquals(5, max(5, 0))
    }

    @Test
    fun maxWithNegativeAndPositive() {
        assertEquals(3, max(-5, 3))
    }

    @Test
    fun maxWithNegativesOnly() {
        assertEquals(-5, max(-5, -25))
    }

    @Test
    fun maxWithTheSame() {
        assertEquals(5, max(5, 5))
    }
}