package ders7

fun main() {


    val sesSeviyesi = 85

    if (sesSeviyesi !in 0..100){
        println("Hata:Ses seviyesi sadece 0 ile 100 arasında olabilir!")
    }
    else{
        println("Ses seviyesi başarıyla ayarlandı")
    }
}