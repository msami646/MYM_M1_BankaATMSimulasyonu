package ders8

fun main() {
    var bakiye = 500

    while (bakiye > 0) {
        var harcananTutar = (1 .. 100).random()
        if (harcananTutar < bakiye){
            bakiye -= harcananTutar
        }
        println("Harcama $harcananTutar TL ,Kalan Bakiye: $bakiye TL")
    }
}