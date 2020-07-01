package Banking

class SetorTunai(val jumlahSetor:Int ) : Saldo() {

    override fun tampilSaldo(){
        saldo = saldo+jumlahSetor

        println("""
            Saldo kamu sekarang:
            Rp. $saldo
        """.trimIndent())
    }

}