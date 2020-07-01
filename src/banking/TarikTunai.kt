package banking
import SaldoBank.saldo

class TarikTunai(val jumlahTarik:Int): Saldo() {

    fun kurangSaldo() {
        if (jumlahTarik > saldo){
            println("saldo anda kurang")
        } else if (jumlahTarik%50000 != 0){
            println("Harus kelipatan 50000")
        } else {
            saldo -= jumlahTarik
        }
    }
}