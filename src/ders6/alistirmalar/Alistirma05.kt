package ders6.alistirmalar

fun main() {
    print("Lütfen yaşınızı giriniz: ")
    val girdi = readln().toIntOrNull()

    if (girdi != null){
        when(girdi){
            in 0..6 ->println("")
        }
    }else{
        println("Lütfen geçerli bi değer giriniz")
    }
}