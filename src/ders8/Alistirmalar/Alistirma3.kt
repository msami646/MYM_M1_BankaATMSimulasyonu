package ders8.Alistirmalar

fun main() {
    do {
        val zarDegeri = (1..6).random()
        if (zarDegeri == 6){
            println("Şanslı 6 gedi ! Oyun bitiyor")
        }else{
            println("Zar $zarDegeri geldi,tekrar atılıyor")
        }
    }while (zarDegeri != 6)
}