package AoC2015.Dag1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class d1u12015Test {
    private  val dag1 = d1u12015 ("src/main/kotlin/AoC2015/Dag1/testData")

    @Test
    fun solution1() {
        assertEquals(3,dag1.solution())
    }

    @Test
    fun solution2() {
        assertEquals(0,dag1.solution())
    }

}