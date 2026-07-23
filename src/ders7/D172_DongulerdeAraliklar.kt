package ders7

fun main() {
    //iki nokta (..)
    val birdenBase = 1..5
    val aDanZye = 'a'..'z'//Latin harfleri

    val birdenDorde = 1 until 5 // 1, 2, 3, 4

    val ondanBire = 10 downTo 1

    val tekSayilar = 1.. 10 step 2
    val geriyeCifter = 10 downTo 1 step 2
    val ucerUcer = 1 .. 10 step 3

    val yas = 25
    if (yas in 18..65){
        println("Çalışma çağındasınız.")
    }

}