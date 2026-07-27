package ders8.Alistirmalar

fun main() {
    disDongu@for (i in 1 .. 5){
        for (j in 1 .. 10){
            println("$i. sınıf $j. öğrenci")
            if (i == 3 && j == 5){
                println("Aranan öğrenci bulundu")
                break@disDongu
            }
        }
    }
}