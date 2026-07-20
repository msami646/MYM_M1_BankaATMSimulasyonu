package ders6

fun main() {
    val can = 100

    when (can){
        0 -> println("Karakter öldü. Oyun bitti!")
        1,2,3 -> println("Kritik Seviye! Hemen iksir için!")
        in 4 ..50 -> println("Tehlikedesiniz, Savunmada kalın.")
        in 50 .. 100 -> println("Sağlığınız yerinde savaşa devam edin")
        else -> println("Hata geçersiz can")
    }
}