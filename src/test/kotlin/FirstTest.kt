import Calculator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
//import kotlin.test.Test

open class FirstTest{
    private val calc: Calculator = Calculator()
    @BeforeEach
    open fun beforeEach() {
        println("Test start")
    }
    @AfterEach
    open fun afterEach() {
        println("Test finished")
    }
    @Test
    fun myTest() {
        println("My first autotest running")
        val expected = 1
        val message = "Ошибка при делении"
        assertEquals(expected, 1/0, message)
    }
    @Test
    fun test1() {
        println("Test № 1")
        val expected = 4
        val message = "Ошибка при сложении"
        assertEquals(expected, calc.sum(2, 2), message)
    }
    @Test
    fun test2() {
        println("Test № 2")
        val expected = 5
        val message = "Ошибка при сложении"
        assertEquals(expected, calc.sum(2, 2), message)
    }
    @Test
    fun test3() {
        println("Test № 3")
        val expected = true
        val message = "Ошибка при сложении"
        assertEquals(expected, calc.sum(2, 2) == 4, message)
    }
    @Test
    fun test4() {
        println("Test № 4")
        val expected = true
        val message = "Ошибка при сложении"
        assertEquals(expected, calc.sum(2, 2) == 5, message)
    }
    @Test
    fun test5() {
        println("Test № 5")
        val message = "Ошибка при сложении"
        assertAll("Сложная проверка",
            { assertEquals(4, calc.sum(2, 2), message) },
            { assertEquals(5, calc.sum(2, 2), message) },
            { assertEquals(true, calc.sum(2, 2) == 4, message) },
            { assertEquals(true, calc.sum(2, 2) == 5, message) }
        )
    }
    companion object {
        @JvmStatic
        @BeforeAll
        internal fun beforeAll() {
            println("autotests.FirstTest class started")
        }
        @JvmStatic
        @AfterAll
        internal fun afterAll() {
            println("All tests in autotests.FirstTest finished")
        }
    }
}