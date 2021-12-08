fun main(){
    var kardus = "Buku"                     //var dapat diubah nilainya
    kardus = "pulpen"                       //val tidak dapat diubah nilainya

    var byte :Byte = 120                    //bisa ditulis jenis variabelnya dan bisa tidak
    var short :Short = 32_000
    var int :Int = 100_000_000
    var long :Long = 500_000_000
    var angka :Int = 50

    //Bilangan desimal
    var float :Float = 3.14f
    var double :Double = 3.111111114

    //tipe data char
    var char :Char = '2'                  //dapat diisi huruf/angka

    //tipe data string
    var string :String = "Matcha"
    var Nama :String = """
        Balkis Arifatul Fadia
        21090043
        Keturen
    """.trimIndent()                    //untuk menghilangkan jarak pada variabel

    //tipe data boolean hanya memiliki nilai true dan false
    var boolean :Boolean = true
    var boolean2 :Boolean = false

    println(angka)
    println(byte)
    println(short)
    println(int)
    println(int)
    println(long)
    println(float)
    println(double)
    println(char)
    println(string)
    println(Nama)
    println(boolean)
    println(boolean2)
}