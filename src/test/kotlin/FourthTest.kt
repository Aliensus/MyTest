import org.junit.jupiter.api.*
//@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class FourthTest {
    @BeforeEach
    fun beforeEach() {
        beforeB()
        beforeD()
        beforeE()
        beforeA()
        beforeF()
        beforeC()
    }
    fun beforeD() {
        println("выполнения ")
    }
    fun beforeC() {
        println("недетерминирован")
    }
    fun beforeE() {
        println("нескольких ")
    }
    fun beforeB() {
        println("Порядок ")
    }
    fun beforeA() {
        println("Before ")
    }
    fun beforeF() {
        println("методов ")
    }
    @Test
    fun test10() {
        println("Test № 10")
    }
}