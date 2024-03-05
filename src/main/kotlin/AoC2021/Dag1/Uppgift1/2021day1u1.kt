package AoC2021.Dag1.Uppgift1

import java.io.File
//Denna försvann
fun main() {
    val dag1 = d1u12021()
    dag1.solution()
}

class d1u12021(var path : String = "src/main/kotlin/AoC2021/Dag1/Uppgift1/data2021d1u1"){
    val data = File(path).readLines()
        .map  (String::toInt).toList()
    var counter = 0
    var temp = 0

    fun solution() {
        for (i in 0 until data.size - 1) {
            temp = i
            for (k in 0 until data.size - 1) {
                if (k > temp) {
                    counter++
                }
            }
        }
        println(counter)
    }



}