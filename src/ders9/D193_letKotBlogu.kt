package ders9

fun main() {
    var isim: String? = null

    var gosterilecekSonuc = isim?.let { "Merhaba $isim. Sisteme giriş yaptınız! " } ?: "Misafir Girişi"
    println(gosterilecekSonuc)


}