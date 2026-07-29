package ders9.Alistirmalar

fun main() {
    val ad : String = "sami"
    var soyad : String? = null
    var yas : Int? = null

    val gosterilecekSoyad = soyad ?: "(Soyadı belirtilmemiş)"
    val gosterilecekYas = yas ?: 0

    println("Merhaba $ad $gosterilecekSoyad, Yaşınız $gosterilecekYas")

}