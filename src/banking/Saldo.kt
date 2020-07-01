package banking
import SaldoBank

open class Saldo(){

    open fun tampilSaldo(){
        println("""
            Saldo kamu sekarang:
            Rp. ${SaldoBank.saldo}
        """.trimIndent())
    }

//    open fun tambahSaldo(setoran:Int){
//        val penjumlahan = saldo + setoran
//        saldo = penjumlahan
//    }
//
//    open fun kurangSaldo(penarikan:Int){
//        saldo - penarikan
//    }
}