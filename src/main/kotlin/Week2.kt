fun main(){
    val angka :Array<Int> = arrayOf(6,7,8,9,10)

    println(angka.get(0))
    println(angka.get(2))
    println(angka.get(4))

    //looping
    println("\nLewat Looping")
    for (i in angka ){
        if (i >= 6 && i % 2  == 0){
            println(i)
        }
    }

    var A = angka.get(0) + angka.get(1) + angka.get(2) + angka.get(3) + angka.get(4)
    println("\nHasil Penjumlahan = $A")

}