package AoC2015.Dag3

import java.io.File

fun main() {
    val data = File("src/main/kotlin/AoC2015/Dag3/data").readText()
    var locationNorSou = 0
    var locationEasWes = 0
    var counter =1

    for (i in data){
        when(i){
            '>' -> locationEasWes++;
            '<' -> locationEasWes--
            '^' -> locationNorSou++
            'v' -> locationNorSou--
        }
    }
}