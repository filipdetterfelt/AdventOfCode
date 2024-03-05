package AoC2021.Dag2.Uppgift1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class d2u12021Test {

    val dag2 = d2u12021("src/main/kotlin/AoC2021/Dag2/Uppgift1/testdatad2u1")
    @Test
    fun solution1() {
        assertEquals("Horizontel: 15 Depth: 10", dag2.solution1())
    }

    @Test
    fun solution2(){
        assertEquals("Horizontel: 30 Depth: 20", dag2.solution1())
    }

}