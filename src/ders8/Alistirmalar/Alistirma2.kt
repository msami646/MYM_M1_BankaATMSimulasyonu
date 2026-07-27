package ders8.Alistirmalar

fun main() {
    for (i in 1 ..50){
        if (i %10 == 0){
            continue
        }
        println(i)
    }
}