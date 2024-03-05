package AoC2020.Dag1Uppg2

import java.io.File

fun main() {
    val dag1 = day1u2()
    dag1.solution1()
}

class day1u2(var path : String = "src/main/kotlin/AoC2020/Dag1Uppg1/AoCD1u1Data"){
 val reader = File(path).readText()
    var result : String? = null

    val dataList = reader.lines().mapNotNull{it.toIntOrNull()}


    fun solution1(): String? {
        for (i in dataList.indices) {

            for (j in i + 1 until dataList.size) {

                for (k in i + 2 until dataList.size) {

                    if (dataList[i] + dataList[j] + dataList[k] == 2020) {
                        result = "${dataList[i]} + ${dataList[j]} + ${dataList[k]} = 2020"
                        break
                    }

                }

            }
            if (result != null)
                break
        }

        println(result ?: "Ingen match hittades")
        return result
    }
}