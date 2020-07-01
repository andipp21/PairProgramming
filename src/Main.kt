import Banking.CekPin
import Banking.Menu

fun main(){
    println("Selamat Datang di Bank ABC")
    print("Masukan Pin Kamu : ")
    val pin = readLine()!!

    val hasilCekPin = CekPin(pin).pengecekanPin()

    do {
        Menu().menu()
    } while (hasilCekPin == "sama")
}