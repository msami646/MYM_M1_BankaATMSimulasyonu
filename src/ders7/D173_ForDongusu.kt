package ders7

fun main() {
    for (i in 1..5){
        println("$i. Madde$i")
    }

    println("------------------------")

    for (harf in 'a'..'e'){
        println("$harf. ")
    }

    println("------------------------")

    for (i in 1 until 5){
        println(i)
    }

    println("------------------------")

    for (i in 10 downTo 1 step 2){
        println(i)
    }

}