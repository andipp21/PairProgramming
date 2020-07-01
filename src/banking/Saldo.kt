package banking
import SaldoBank
import java.text.DecimalFormat
import java.text.NumberFormat

open class Saldo(){

    open fun tampilSaldo(){
        val formatter: NumberFormat = DecimalFormat("#,###")
        val myNumber = SaldoBank.saldo
        val formattedNumber = formatter.format(myNumber)

        println("""
            Saldo kamu sekarang:
            Rp. $formattedNumber
        """.trimIndent())
    }
}