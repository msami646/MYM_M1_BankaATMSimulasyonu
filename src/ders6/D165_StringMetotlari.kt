package ders6

fun main() {
    val hamGirdi = "mERhaBA KOtlİn"
    println("ham Girdi: $hamGirdi")

    val temizGirdi = hamGirdi.trim().lowercase()
    println("Temiz Girdi: $temizGirdi")

    if (temizGirdi == "merhaba kotlin"){
        println("Doğru")
    }
    if (temizGirdi.contains("kotlin")){
        println("içeriyor")
    }
    println(temizGirdi.substring(0))
    println(temizGirdi.split(" "))

    print("Adın: ")
    val ad = readln().trim().lowercase()
    val temizlenmisAd = ad.replaceFirstChar { it.uppercase() }
    println(ad)
    println(temizlenmisAd)
}