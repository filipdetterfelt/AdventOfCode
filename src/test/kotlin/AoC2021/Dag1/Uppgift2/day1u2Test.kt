package AoC2021.Dag1.Uppgift2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class day1u2Test {
    val dag1 = day1u2("src/main/kotlin/AoC2021/Dag1/Uppgift2/testData")
    val dataList = dag1.solution1()

    @Test
    fun solution1() {
        assertEquals(5,dag1.countIncreases(dataList))
    }

    @Test
    fun solution2(){
        assertEquals(4,dag1.countIncreases(dataList))
    }

    @Test
    fun solution3(){
        assertNotEquals(4,dag1.countIncreases(dataList))
    }

}