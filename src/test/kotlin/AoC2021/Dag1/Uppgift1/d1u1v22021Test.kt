package AoC2021.Dag1.Uppgift1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class d1u1v22021Test {

    val dag1 = d1u1v22021("src/main/kotlin/AoC2021/Dag1/Uppgift1/Testdata")
    @Test
    fun solution1() {
        assertEquals(7,dag1.solution())
    }

    @Test
    fun solution2(){
        assertEquals(0,dag1.solution())
    }

    @Test
    fun solution3(){
        assertNotEquals(7,dag1.solution())
    }

    @Test
    fun solution4(){
        assertNotEquals(3,dag1.solution())
    }
}