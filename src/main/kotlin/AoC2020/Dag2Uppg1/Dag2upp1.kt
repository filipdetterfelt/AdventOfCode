package AoC2020.Dag2Uppg1

import java.io.File

fun main(){

    val data = File("src/main/kotlin/AoC2020/Dag2Uppg1/testdata").readText()
    val parts = data.split(" ")

    val range = parts[0].split("-")
    val start = range[0].toInt()
    val end = range[1].toInt()
    var count = 0

    val char = parts[1][0]

    val password = parts[2]

    println("Start $start End: $end Char: $char, Password: $password")



    if(password[start-1] == char){
        count++
    }
    else if(password[end-1]==char){
        count++
    }
    println("Det finns $count korrekta lösenord")



}