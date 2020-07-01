package banking

import SaldoBank.saldo

class TarikTunai : Saldo {

    constructor(jumlahTarik: Int) : super() {
        if(jumlahTarik == 0) {
            Menu().menu()
        } else if (jumlahTarik > saldo) {
            println("saldo anda kurang")
        } else if (jumlahTarik % 50000 != 0) {
            println("Harus kelipatan 50000")
        } else {
            saldo -= jumlahTarik
        }
    }
}