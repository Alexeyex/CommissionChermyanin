import java.util.*


fun main() {
    val sc = Scanner(System.`in`)
    val sum: Int = 0
    print("Введите тип карты/счёта: ")
    var cardType = "Vk Pay"
    cardType = sc.nextLine()
    print("Введите сумму совершаемого перевода в копейках: ")
    val transferAmount = sc.nextInt()
    calculationOfCommission(cardType, sum, transferAmount)
}

private fun calculationOfCommission(cardType: String, sum: Int, transferAmount: Int) {

    when (cardType) {
        "Maestro", "Mastercard" -> {
            print("Ваша комиссия составит: ${calculationOfCommissionMaestroMasterCard(transferAmount)}")
        }

        "Visa", "Мир" -> {
            print("Ваша комиссия составит: ${calculationOfCommissionVisaMir(transferAmount)}")
        }

        "Vk Pay" -> {
            print("Комиссия не взимается")
        }

        else -> print("Введите правильный тип карты/счёта")
    }
}

private fun calculationOfCommissionMaestroMasterCard(transferAmount: Int): Double {
    var commission: Double = 0.0
    if (transferAmount in 300 * 100..75000 * 100) {
        commission = 0.0
    } else {
        commission = 0.006 * transferAmount + 20 * 100
    }
    return commission
}

private fun calculationOfCommissionVisaMir(transferAmount: Int): Double {
    var commission: Double = 0.0
    commission = 0.0075 * transferAmount
    if (commission <= 35 * 100) {
        commission = (35 * 100).toDouble()
        println("Минимальная комиссия составляет $commission копеек")
    }
    return commission
}
