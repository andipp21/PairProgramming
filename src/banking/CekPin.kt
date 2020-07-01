package banking

class CekPin(val pin:String) {
    private val PIN = "123456"
    val pinLength:Int = pin.length

    fun pengecekanPin(): String {
        when {
            pinLength < 6 -> {
                return """
                    kurang dari 6 char.
                    Silahkan Masukan kembali pin kamu : 
                """.trimIndent()

            }
            pinLength > 6 -> {
                return """
                    lebih dari 6 char.
                    Silahkan Masukan kembali pin kamu : 
                """.trimIndent()
            }
            pin != PIN -> {
                return """
                    Pin tidak sama.
                    Silahkan Masukan kembali pin kamu : 
                """.trimIndent()
            }
            pin == PIN -> {
                return "sama"
            }
        }
        return "ok"
    }

}