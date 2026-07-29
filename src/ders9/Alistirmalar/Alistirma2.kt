package ders9.Alistirmalar

fun main() {
    var kargoNo : String? = null

    if (kargoNo!= null){
        println("Kargo numaranızın uzunluğu: ${kargoNo.length} hanedir")
    }else {
        println("Kargonuz henüz yola çıkmadı")
    }

    var gosterilecekKargoMesaji = kargoNo?.let { "Kargo numaranızın uzunluğu: ${it.length} hanedir" } ?: "Kargonuz henüz yola çıkmadı"
    println(gosterilecekKargoMesaji)


}