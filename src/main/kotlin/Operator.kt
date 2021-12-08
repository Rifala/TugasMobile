fun main(){
    var a :Int = 11
    var b :Int = 22

    //operator aritmatik
    println("Hasil operator aritmatik")

    val penjumlahan = a + b
    val perkalian = a * b
    val pengurangan = a - b
    val pembagian = a / b
    val modulus = b % a

    println(penjumlahan)
    println(perkalian)
    println(pengurangan)
    println(pembagian)
    println(modulus)

    //operator assignment
    println("Hasil operator assignment")

    a = a + b                       //menambah nilai a cara biasa
    b += b                          //menambah nilai a lebih singkat
    a *= b
    a -= b
    a /= b
    a %= b                          //nilai a berubah menjadi hasil a % b

    println(a)

    //operator unary ++ --
    println("Hasil operator unary")

    var c :Int = 20
    c++                             //nilai c ditambah 1
    c--                             //nilai c dikurangi 1
                                    //pada kotlin operator unary bisa ditambahkan setelah maupun sebelum variabel
    println(c)

    //operator perbandingan >,<,<=,>=,== hasilnya boolean(true/false)
    println("Hasil operator perbandingan")

    var d :Int = 100
    var e :Int = 50

    var kurangDari = d <= e
    var lebihDari = d >= e
    var samadengan = d == e

    println(kurangDari)
    println(lebihDari)
    println(samadengan)

    //operator logika
    println("Hasil operator logika")

    var f = 8 > 9
    var g = 7 < 9

    var and = f && g                //konjungsi
    var or = f || g                 //disjungsi
    var not = !f                    //negasi dari f atau nilainya dibalik

    println(and)
    println(or)
    println(not)



    val angka = 21
    if (angka % 2 == 0){
        println("$angka ini angka Genap")
    }else{
        println("$angka ini angka Ganjil")
    }

    //beberapa kondisi
    val nilai = 75
    if (nilai > 80){
        println("Nice")
    }else if (nilai > 70){
        println("Not Bad")
    }else{
        println("Try Again")
    }



    var grade = 'A'
    when(grade){
        'A' -> println("Excelent")
        'B' -> println("Nice")
        'C' -> println("Try Again")
        else -> println("Ups")
    }
}