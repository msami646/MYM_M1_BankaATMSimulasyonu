package ders6.alistirmalar

fun main() {
    val gelenVeri: Any = 45.3

    when(gelenVeri){
        is String ->{
            println("Metin uzunluğu ${gelenVeri.length}")
        }
        is Int -> {
            println("Sayının 10 katı: ${gelenVeri * 10}")
        }
        is Boolean ->{
            val durumMesaji = if (gelenVeri ) "Doğru" else "Yanlış"
            println("Durum: $durumMesaji")
        }
        else -> println("Desteklenmeyen veri tipi")
    }
}