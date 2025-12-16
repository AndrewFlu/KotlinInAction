package ch_07_nullable.late_init

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MyServiceTest {

    private var myService: MyService? = null // объявление свойства с типом не допускающим null, с допуском null

    @BeforeAll
    fun setUp() {
        myService = MyService() // действительная инициализация в before-методе
    }

    @Test
    fun testAction() {
        assertEquals("Action Done!", myService!!.performAction()) // необходимо позаботиться о null-безопасности
    }
}