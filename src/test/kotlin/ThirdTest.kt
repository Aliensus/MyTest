import org.junit.jupiter.api.*

class ThirdTest : FirstTest() {
    companion object {
        @JvmStatic
        @BeforeAll
        internal fun beforeAll() {
            println("autotests.ThirdTest class started")
        }
    }
    @BeforeEach
    override fun beforeEach() {
        println("Тест запущен")
    }
    @AfterEach
    override fun afterEach() {
        println("Тест остановлен")
    }
    @Test
    fun test8() {
        println("Test № 8")
    }
    @Test
    fun test9() {
        println("Test № 9")
    }
}