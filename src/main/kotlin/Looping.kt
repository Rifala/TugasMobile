fun main(){
    for (i in 1..5 step 2){             //step digunakan untuk melompati angka (2) atau setiap angka 2 sehingga akan muncul 1 3 5
        println("Nilai $i")
    }

    val number :Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    println("To List : ")
    println(number.toList())

    for (i in number){
        if (i > 5){
            println("menampilkan dalam array : $i")
        }
    }

    println("\n")

    //looping dengan while membutuhkan variabel untuk menghentikan(memulai) looping
    var temp = 0
    while (temp <= 10){
        println("Bilangan ke-$temp")
        temp++                              //increment untuk melanjutkan looping
    }

    println("\n")

    //looping do while
    var angka = 0
    do {
        println("Bilangan $angka")
        angka++
    }while(angka < 5)


    //continue
    println("\n Continue")

    val myArray = arrayOf(1,2,3,4,5)
    for (i in myArray) {
        if (i % 2 == 0 && i == 2) {             //bisa dimasukkan beberapa kondisi dengan menambahkan && setiap menambahkan kondisi
            continue                            //angka 3 akan dilewati dan melanjutkan perulangan berikutnya
        }
        println(i)
    }


    //break
    println("\n Break")

    val apa = arrayOf(1,2,3,4,5,6)
    for (i in apa){
        if (i == 1){
            println("Selesai")
            break                               //saat kondisi di if terpenuhi maka akan mengeksekusi break/berhenti
        }
        println(i)
    }

}