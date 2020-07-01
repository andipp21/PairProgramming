import banking.CekPin
import banking.Menu

object SaldoBank {
    var saldo:Int = 500000
}

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
}