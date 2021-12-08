fun main(){

    //soal 1
    var min = 500_000
    var beli = 625_000
    var diskonMember = beli * 5 / 100
    var diskonBeli = beli * 1 / 10
    var totalDiskon = diskonMember + diskonBeli

    if (beli >= min){
        var total = beli - diskonMember - diskonBeli
        println("Pembeli 1 mendapat diskon 15% dari $beli, jadi totalnya : $beli - $totalDiskon = $total")
    }else if (beli <= min){
        var total = beli - diskonMember
        println("Pembeli 1 mendapat diskon 5% dari $beli, jadi totalnya : $beli - $totalDiskon = $total")
    }


    //soal 2
    var beratBadan = 45
    var tinggiBadan = 153

    if (tinggiBadan - 110 == beratBadan){
        println("Normal")
    }else if(tinggiBadan - 110 >= beratBadan){
        println("Gemuk")
    }else if(tinggiBadan - 110 <= beratBadan){
        println("Kurus")
    }
}