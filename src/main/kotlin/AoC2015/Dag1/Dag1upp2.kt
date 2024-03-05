package AoC2015.Dag1

import java.io.File

fun main() {
    val dag1 = d1u22015()
    dag1.solution()
}

class d1u22015(val path : String = "src/main/kotlin/AoC2015/Dag1/data2"){
    val data = File(path).readText()
    var level = 0
    var counter = 0

    fun solution(): Int {
        for (i in data) {
            when (i) {
                '(' -> level++ and counter++
                ')' -> level-- and counter++

            }
            if (level == -1) {
                println("Character number $counter")
                break
            }

        }
        return counter
    }
}



