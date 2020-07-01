import Banking.CekPin
import Banking.Menu

fun main(){
    println("Selamat Datang di Bank ABC")
    print("Masukan Pin Kamu : ")
    do {
        var pin = readLine()!!

        val hasilCekPin = CekPin(pin).pengecekanPin()

        if(hasilCekPin!="sama"){
            print(hasilCekPin)
        }
    } while (hasilCekPin != "sama")

    Menu().menu()

//    if(hasilCekPin == "sama") {
//        Menu().menu()
//    }else{
//        println("$hasilCekPin")
//
//        print("Masukan kembali Pin Kamu : ")
//        pin = readLine().toString()
//    }
}