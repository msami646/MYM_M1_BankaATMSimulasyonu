package ders10

fun main() {

    val dogruSifre = "1234"
    var denemeHakki = 3
    var bakiye = 1000.0
    var girisBasariliMi = false


    println("***** KOTLİN BANK'A HOŞ GELDİNİZ *****")

    while (denemeHakki > 0) {
        println("Lütfen Şifrenizi Giriniz: ")
        val kullaniciGirdisi = readln().trim()

        if (kullaniciGirdisi == dogruSifre) {
            girisBasariliMi = true
            break
        } else {
            denemeHakki--
            if (denemeHakki > 0) {
                println("HATALI ŞİFRE! Kalan hakkınız: $denemeHakki")
            } else {
                println("Çok Fazla Hatalı Giriş Yaptınız. Kartınız Bloke Olmuştur!")
            }
        }
    }


    if (girisBasariliMi) {
        println("Giriş başarılı. Menüye yönlendiriliyorsunuz...")
        do {
            println(
                """
        ----- İŞLEM MENÜSÜ -----
        1.BAKİYE SORGULAMA
        2.PARA YATIRMA
        3.PARA ÇEKME
        4.ÇIKIŞ
          """.trimIndent()
            )
            print("Seçiminiz: ")
            val secim = readln().trim()
            when (secim) {
                "1" -> println("Mevcut Bakiyeniz: $bakiye TL")

                "2" -> {
                    print("Yatırmak İstediğiniz Tutarı Girin: ")
                    val yatirilanPara = readln().toDoubleOrNull() ?: 0.0
                    if (yatirilanPara <= 0) {
                        println("Geçersiz Tutar Girdiniz!")
                    } else {
                        bakiye += yatirilanPara
                        println("İşlem Başarılı. Güncel Bakiye: $bakiye")
                    }
                }

                "3" -> {
                    print("Çekmek İstediğiniz Tutarı Girin: ")
                    val cekilenPara = readln().toDoubleOrNull() ?: 0.0
                    if (cekilenPara <= 0) {
                        println("Geçersiz Tutar Girdiniz!")
                    } else if (cekilenPara > bakiye) {
                        println("Yetersiz Bakiye!")
                    } else {
                        bakiye -= cekilenPara
                        println("İşlem Başarılı. Güncel Bakiye: $bakiye")
                    }
                }

                "4" -> {
                    println("Çıkış Yapılıyor. İyi GÜnler Dileriz...")
                    break
                }

                else -> println("Geçersiz İşlem!")
            }

        } while (true)
    }
}
