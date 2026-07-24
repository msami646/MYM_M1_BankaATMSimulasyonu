package ders7.Alistirmalar

fun main() {


    for (i in 1 ..5){
        print("$i.mesajı giriniz : ")
        var kullaniciMetin = readln().trim().lowercase()
        if (kullaniciMetin.contains("kampanya")|| kullaniciMetin.contains("beadava")||kullaniciMetin.contains("kazandınız")){
            println("Spam mesaj engellendi")
        }else {
            println("Temizlenen mesaj: " + kullaniciMetin)
        }
    }
}