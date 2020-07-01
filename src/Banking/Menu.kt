package Banking

import java.util.*

class Menu {
    val input = Scanner(System.`in`)

    fun menu(){
            do {
                println("""
            A. Cek Saldo
            B. Setor Tunai
            C. Tarik Tunai
            D. Keluar
        """.trimIndent())

                print("Silahkan pilih : A/B/C")
                val cekMenu = readLine();
                when (cekMenu) {
                    "A" -> {
                        Saldo().tampilSaldo()
                    }
                    "B" -> {
                        println("Masukan jumlah yang ingin disetorkan : Rp. ")
                        val setoran = input.nextInt()
                        SetorTunai(setoran).tampilSaldo()
                    }

                    "C" -> {
                        println("Masukan jumlah yang ingin ditarik : Rp. ")
                        val penarikan = input.nextInt()
                        TarikTunai(penarikan).tampilSaldo()
                    }
                    "D" -> {
                        println("Terimakasih")
                    }
                }
            } while (cekMenu != "D")
    }
}