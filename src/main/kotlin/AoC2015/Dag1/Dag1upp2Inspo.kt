package AoC2015.Dag1

import java.io.File

fun main() {
   val dag1 = d1u22015inspo()
    println("Character number: ${dag1.solution()}")
}

class d1u22015inspo(val path : String = "src/main/kotlin/AoC2015/Dag1/data2"){

    val data = File(path).readText()
    var level = 0
    fun solution(): Int{


        data.forEachIndexed{i,c ->
            when(c){
                '(' -> level++
                ')' -> level--
            }
            if (level == -1) return i + 1

        }

        return 0

    }
}