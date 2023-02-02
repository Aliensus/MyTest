import org.junit.jupiter.api.*

class SecondTest : FirstTest() {
    companion object {
        @JvmStatic
        @BeforeAll
        internal fun beforeAll2() {
            println("autotests.SecondTest start")
        }
        @JvmStatic
        @AfterAll
        internal fun afterAll2() {
            println("autotests.SecondTest stop")
        }
    }
    @BeforeEach
    fun beforeEach2() {
        println("Тест запущен")
    }
    @AfterEach
    fun afterEach2() {
        println("Тест остановлен")
    }
    @Test
    fun test6() {
        println("Test № 6")
    }
    @Test
    fun test7() {
        println("Test № 7")
    }
}