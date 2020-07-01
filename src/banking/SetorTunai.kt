package banking
import SaldoBank.saldo

class SetorTunai(val jumlahSetor:Int) : Saldo() {

    fun tambahSaldo() {
        if (jumlahSetor%50000 != 0){
            println("Harus kelipatan 50000")
        } else {
            saldo += jumlahSetor
        }

    }

}