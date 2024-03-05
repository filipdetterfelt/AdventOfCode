package AoC2015.Dag1

import java.io.File

fun main() {
    val dag1 = d1u12015()
    dag1.solution()
}

class d1u12015(var path : String = "src/main/kotlin/AoC2015/Dag1/data"){
    val data = File(path).readText()
    var level = 0

    fun solution(): Int{
        for (i in data) {
            when (i) {
                '(' -> level++
                ')' -> level--
            }
            println("Tomten är på våning $level")
        }
        return level
    }
}




