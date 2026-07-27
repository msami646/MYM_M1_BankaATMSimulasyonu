package ders8.Alistirmalar

fun main() {
    do {
        println("1.Bakiye Göster|2.Para Çek | 3.Çıkış")
        val kullaniciIfade = readln().toInt()
        if (kullaniciIfade == 1){
            println("Bakiyeniz 5000 TL")
        }else if (kullaniciIfade == 2){
            println("Para çekiliyor")
        }else if (kullaniciIfade == 3){
            println("İyi günler dileriz")
            break
        }else{
            println("Lütfen uygun bir değer giriniz")
        }
    }while (true)
}