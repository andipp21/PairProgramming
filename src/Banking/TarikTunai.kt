package Banking

class TarikTunai(val jumlahTarik:Int) : Saldo() {

    override fun tampilSaldo(){
        saldo = saldo-jumlahTarik

        println("""
            Saldo kamu sekarang:
            Rp. $saldo
        """.trimIndent())

        Menu().menu()
    }
}