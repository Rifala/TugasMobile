fun main(){

    //soal 1
    for (a in 1..4) {
        for (b in 1..a) {
            print(" $b")
        }
        println("\n")
    }

    //soal 2
    val angka = 2
    val pangkat = 3
    val result = Math.pow(angka.toDouble(), pangkat.toDouble())

    println("Answer = $result")




}
