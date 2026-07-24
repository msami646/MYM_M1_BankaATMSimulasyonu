package ders7.Alistirmalar

fun main() {
    print("Lütfen pozitif bir tam sayı girin: ")
    val girdi = readln().toIntOrNull()

    if (girdi != null && girdi > 0){

        var sonuc = 1

        for (i in 1 .. girdi){
            sonuc += 5

        }
        println("$girdi! = $sonuc")
    }else{
        println("Lütfen sadece pozitif bir tam sayı girin!")
    }
}