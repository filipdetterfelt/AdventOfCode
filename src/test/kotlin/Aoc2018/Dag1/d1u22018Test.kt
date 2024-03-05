package Aoc2018.Dag1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class d1u22018Test {

    val dag1 = d1u22018("src/main/kotlin/Aoc2018/Dag1/testDataupp2")

    @Test
    fun solution1() {
        assertEquals(5,dag1.solution())
    }

    @Test
    fun solution2() {
        assertEquals(-5,dag1.solution())
    }
}