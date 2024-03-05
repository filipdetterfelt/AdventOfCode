package AoC2015.Dag1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class d1u22015Test {


    @Test
    fun solution1() {
        val dag1 = d1u22015 ("src/main/kotlin/AoC2015/Dag1/testData2")
        assertEquals(5,dag1.solution())
    }

    @Test
    fun solution2() {
        val dag1 = d1u22015 ("src/main/kotlin/AoC2015/Dag1/testData2")
        assertEquals(4,dag1.solution())
    }
}
