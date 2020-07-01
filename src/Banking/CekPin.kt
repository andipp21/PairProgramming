package Banking

class CekPin(val pin:String) {
    private val PIN = "123456"
    val pinLength:Int = pin.length

    fun pengecekanPin(): String {
        when {
            pinLength < 6 -> {
                return "kurang dari 6 char"
            }
            pinLength > 6 -> {
                return "Lebih dari 6 char"
            }
            pin != PIN -> {
                return "tidak sama"
            }
            pin == PIN -> {
                return "sama"
            }
        }
        return "ok"
    }

}