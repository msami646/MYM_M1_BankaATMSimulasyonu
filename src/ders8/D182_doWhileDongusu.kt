package ders8

fun main() {
    var sayac = 1

    do {
        println("Sayaç değeri: $sayac")
        sayac++
    }while (sayac < 1)

    var sifre : String
    var deneme = 3

    do {
        print("Şifrenizi girin: ")
        sifre = readln()

        if (sifre != "12345") println("Yanlış Sifre Tekrar deneyin")
    }while (sifre != "12345" ||deneme > 0)

    println("Sisteme giriş yapıldı")
}