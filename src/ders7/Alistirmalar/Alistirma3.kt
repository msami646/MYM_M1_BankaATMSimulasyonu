package ders7.Alistirmalar

fun main() {
    var sonuc = 0
    for (i in 2 .. 100 step 2){
        sonuc += i
    }
    println(sonuc)
}