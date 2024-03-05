package AoC2022.Dag2

import java.io.File

fun main() {

    val data = File("src/main/kotlin/AoC2022/Dag2/testData").readText()
    var elfPoint = 0
    var myPoint = 0
    val elfRock = "A"
    val elfPaper = "B"
    val elfScissors = "C"
    val myRock = "X"
    val myPaper = "Y"
    val myScissors = "Z"


//x sten y påse z sax
    for (i in 0 until data.length -1) {

            val elf = data[i]
            val me = data[i+1]




            //Elf sten case
            when {
                elf == 'A' && me == 'X' -> { elfPoint += 4; myPoint += 4; }

                elf == 'A' && me == 'Y' -> { elfPoint += 1; myPoint += 8; }

                elf == 'A' && me == 'Z' -> { elfPoint += 7; myPoint += 3; }

                elf == 'B' && me == 'Y' -> { elfPoint += 5; myPoint += 5; }

                elf == 'B' && me == 'Z' -> { elfPoint += 2; myPoint += 9; }

                elf == 'B' && me == 'X' -> { elfPoint += 8; myPoint += 1; }

                elf == 'C' && me == 'Z' -> { elfPoint += 6; myPoint += 6; }

                elf == 'C' && me == 'X' -> { elfPoint += 3; myPoint += 7; }

                elf == 'C' && me == 'Y' -> { elfPoint += 9; myPoint += 2; }
            }



    }

    println("Elf: $elfPoint Me: $myPoint")

}



















/*  */