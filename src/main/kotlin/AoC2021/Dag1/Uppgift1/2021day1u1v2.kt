package AoC2021.Dag1.Uppgift1

import java.io.File

fun main() {
    val dag1 = d1u1v22021()
    dag1.solution()
}

class d1u1v22021(val path : String = "src/main/kotlin/AoC2021/Dag1/Uppgift1/data2021d1u1"){

    val data = File(path).readLines().map(String::toInt).toList()
    var counter = 0

    fun solution(): Int{

        for (i in 0 until data.size -1){
            if(data[i] < data[i+1]){
                counter++
            }
        }
        println(counter)
        return counter
    }

}