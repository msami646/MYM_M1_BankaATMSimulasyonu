package ders6

fun main() {
    val gizemliObje: Any = "Merhaba Kotlin"

    when(gizemliObje){
        is String -> println("Bu bit string ifadedir. Uzunluğu ${gizemliObje.length}")
        is Int -> println("Bu bir taamsayıdır. Bu sayının karesi ${gizemliObje * gizemliObje}")
    }
}