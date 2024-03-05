package AoC2021.Dag2.Uppgift2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class d2u22021Test {

    val dag2 = d2u22021("src/main/kotlin/AoC2021/Dag2/Uppgift1/testdatad2u1")
    @Test
    fun solution1() {
        assertEquals("15 60",dag2.solution1())
    }

    @Test
    fun solution2(){
        assertEquals("20 40",dag2.solution1())
    }

    @Test
    fun solution3(){
        assertNotEquals("25 50",dag2.solution1())
    }
}