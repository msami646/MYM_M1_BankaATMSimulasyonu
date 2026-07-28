package ders9

fun main() {
    var kullaniciAdi: String? = null

    var gosterilecekIsim = kullaniciAdi ?: "Misafir"
    println("Merhaba, $gosterilecekIsim")

    //Elvis Operatörünün Açılımı
    if (gosterilecekIsim != null){
        println("Merhaba $gosterilecekIsim")
    }else{
        println("Merhaba, Misafir")
    }

    //İkinci Örnek
    var mesaj: String? = "Selam"
    var uzunluk = mesaj?.length ?: 0
    println("Mesajın unzunluğu: $uzunluk")

    //Üçüncü Örnek
    print("Yaşını gir: ")
    var yas = readln().toIntOrNull()
    println("Yaşınız: $yas")


}