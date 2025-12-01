package ch04_classes_interfaces.sealed.classes

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class HierarchyBySealedClassesKtTest {

    @Test
    fun evalSum() {
        val sumExpr = Sum(4, 6)

        assertEquals(10, eval(sumExpr))
    }

    @Test
    fun evalMultiply() {
        val mulExpr = Mul(5, 5)

        assertEquals(25, eval(mulExpr))
    }

    @Test
    fun evalNumber() {
        val numExpr = Num(7)

        assertEquals(7, eval(numExpr))
    }
}