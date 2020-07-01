package Banking

import kotlin.reflect.jvm.internal.impl.storage.StorageKt

open class Saldo {
    var saldo:Int = 500000

    open fun tampilSaldo(){
        println("""
            Saldo kamu sekarang:
            Rp. $saldo
        """.trimIndent())
    }
}