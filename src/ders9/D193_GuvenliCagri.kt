package ders9

fun main() {
    var ikiniIsim : String? = "can"
    println(ikiniIsim?.length)

    //Güvenli çağrı operatörünün açılımı
    if (ikiniIsim != null){
        println(ikiniIsim.length)
    }else{
        println(null)
    }


}