package ders9.Alistirmalar

fun main() {
    print("Doğum yılınızı giriniz: ")
    val dogumYili = readln().toIntOrNull() ?: 2026
    println(dogumYili)
}