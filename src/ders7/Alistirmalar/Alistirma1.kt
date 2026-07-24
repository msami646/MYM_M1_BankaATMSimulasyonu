package ders7.Alistirmalar

fun main() {

    print("1 ile 10 arasında bir sayı giriniz: ")

    val sayi = readln().toIntOrNull()

    if (sayi == null) {
        println("Lütfen sadece rakam giriniz")
    } else if (sayi !in 1..10) {
        println("1 ile 10 arasında bir değer giriniz")

    } else {
        for (i in 1..10) {
            val sonuc = sayi * i
            println(" $sayi X $i = $sonuc")
        }
    }

}

