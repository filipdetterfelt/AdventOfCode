package AoC2020.Dag1Uppg2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class day1u2Test {
    val dag1 = day1u2("src/main/kotlin/AoC2020/Dag1Uppg1/testdata")
    @Test
    fun solution1() {
        val result = dag1.solution1()
        assertNotNull(result)
        assertEquals("979 + 366 + 675 = 2020",dag1.solution1())
    }

    @Test
    fun solution2(){
        val result = dag1.solution1()
        assertNotNull(result)
        assertNotEquals("979 + 366 + 675 = 2020",dag1.solution1())
    }

    @Test
    fun solution3(){
        val result = dag1.solution1()
        assertNotNull(result)
        assertEquals("979+500 + 200 = 2020",dag1.solution1())
    }
}