package Aoc2018.Dag1

import java.io.File

class d1u22018inspo(){
    val data = File("src/main/kotlin/Aoc2018/Dag1/data").readLines().toList().map { it.toInt() }

    fun solution2(): Int{
        val frequencyAgain = mutableSetOf(0)
        var frequency = 0
        return data.toInfiniteSequence().map {
            frequency += it
            frequency
        }.first { !frequencyAgain.add(it) }
    }

    fun<T> List<T>.toInfiniteSequence():Sequence<T> = sequence { if (this@toInfiniteSequence.isEmpty()) {


        return@sequence
        }
        while (true){
            yieldAll(this@toInfiniteSequence)
        }
    }
}

fun main() {
val dag1 = d1u22018inspo()
    println(dag1.solution2())
}