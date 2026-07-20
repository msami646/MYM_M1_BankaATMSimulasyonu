package ders6

fun main() {
    val biletSinifi = 'B'
    val sinifAciklamasi =
        when(biletSinifi){
            'E' -> "Ekonomi Sınıfı"
            'B' -> "Busines Clas"
            'F' -> "First Class"
            else -> "Geçersiz Sınıf"
        }
    println(sinifAciklamasi)
}