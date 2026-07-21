package ders6.alistirmalar

fun main() {
    print("1 ile 12 aarasında bir ay numarası giriniz: ")
    val ayNumarasi = readln().toIntOrNull()

    val mesvim = when(ayNumarasi){
        null -> "Lütfen Geçerli bir değer girin"
        12,1,2 -> "Kış"
        3,4,5 -> "İlkbahar"
        6,7,8 -> "Yaz"
        9,10,11 -> "Sonbahar"
        else -> "Lütfen 1 ile 12 arasında bir sayı girin"
    }
    println(mesvim)


}