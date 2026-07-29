package ders9.Alistirmalar

fun main() {
    val kuponTutari: Double? = 45.7 ?: 0.0
    val sepetTutar = 500.0
    println("İndirimli Tutar: ${sepetTutar - (kuponTutari ?: 0.0)}")
}