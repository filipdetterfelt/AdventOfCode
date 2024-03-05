package Aoc2018.Dag1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class d1u12018Test {

    val dag1 = d1u12018("src/main/kotlin/Aoc2018/Dag1/testData")

    @Test
    fun solution1() {
        assertEquals(5,dag1.solution())
    }

    @Test
    fun solution2() {
        assertNotEquals(0,dag1.solution())
    }

    @Test
    fun solution3(){
        assertEquals(-5,dag1.solution())
    }
}