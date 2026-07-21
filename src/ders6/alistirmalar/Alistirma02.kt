package ders6.alistirmalar

fun main() {
    print("Sepet tutarını ondalıklı şekilde giriniz: ")
    val sepetTutari = readln().toDoubleOrNull()

    if (sepetTutari != null){
        when(sepetTutari){
         in 0.0..99.99 -> print("Kargo 30TL")
         in 100.0 .. 299.99 -> print("Kargo 15 TL")

        }
    }else{
        println("Lütfen geçerli bir ondalıklı sayı giriniz")
    }
}