package banking

import java.util.*

class Menu {
    private val input = Scanner(System.`in`)

    fun menu(){
            do {
                println("""
            A. Cek Saldo
            B. Setor Tunai
            C. Tarik Tunai
            D. Keluar
        """.trimIndent())

                print("Silahkan pilih (A/B/C/D): ")
                val cekMenu = readLine()
                when (cekMenu) {
                    "A" -> {
                        Saldo().tampilSaldo()
                    }
                    "B" -> {
                        println("Masukan jumlah yang ingin disetorkan : Rp. ")
                        val setoran = input.nextInt()
                        val setor = SetorTunai(setoran)
                        setor.tambahSaldo()
                        setor.tampilSaldo()
                    }

                    "C" -> {
                        println("Masukan jumlah yang ingin ditarik : Rp. ")
                        val penarikan = input.nextInt()
                        val tarik = TarikTunai(penarikan)
                        tarik.kurangSaldo()
                    }
                    "D" -> {
                        println("Terimakasih")
                    }
                }
            } while (cekMenu != "D")
    }
}