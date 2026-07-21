package ders6.alistirmalar

fun main() {
    println("Lütfen bir komut yazın: ")
    val kullaniciGirdisi = readln().trim().lowercase()

    when{
        kullaniciGirdisi == "merhaba" -> {
            println("Şu an saat 14.00")
        }

        kullaniciGirdisi.contains("hava") ->{
            println("Dışarıda harika bir hava var")
        }

        else -> println("Ne demek istediğinizi anlayamadım")
    }
}