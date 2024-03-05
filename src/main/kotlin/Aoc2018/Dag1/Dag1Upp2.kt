package Aoc2018.Dag1

import java.io.File

fun main() {
    val dag1 = d1u22018()
    dag1.solution()
}

class d1u22018(val path : String = "src/main/kotlin/Aoc2018/Dag1/data"){

    val data = File(path).readText()
    val lines = data.trim().split("\n")
    var frequencys = 0
    val secondfrequencys = mutableSetOf(0)

    fun solution(): Int {
        while (true) {
            for (line in lines) {
                val operator = line[0]
                val number = line.trim().substring(1).toInt()

                if (operator == '-') {
                    frequencys -= number

                } else {
                    frequencys += number
                }

                if (secondfrequencys.contains(frequencys)) {
                    println("Den första frekvensen som körts 2 gånger är $frequencys")
                    return frequencys
                }
                secondfrequencys.add(frequencys)

            }
        }
    }

}

