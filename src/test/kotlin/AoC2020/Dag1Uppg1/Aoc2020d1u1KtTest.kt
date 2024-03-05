package AoC2020.Dag1Uppg1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Aoc2020d1u1KtTest {

    val dag1 = day1u1("src/main/kotlin/AoC2020/Dag1Uppg1/testdata")
    @Test
    fun solution1(){
        val result = dag1.solution1()
        assertNotNull(result)
        assertEquals("1721 + 299 = 2020",dag1.solution1())
    }

    @Test
    fun solution2(){
        val result = dag1.solution1()
        assertNotNull(result)
        assertEquals("500+2000 = 2020",dag1.solution1())
    }
}