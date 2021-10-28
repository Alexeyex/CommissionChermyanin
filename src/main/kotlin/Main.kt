import java.util.*


fun main() {
    val sc = Scanner(System.`in`)
    val sum: Int = 0
    print("Введите тип карты/счёта: ")
    var cardType = "Vk Pay"
    cardType = sc.nextLine()
    print("Введите сумму совершаемого перевода в копейках: ")
    var transferAmount = 1000000
    transferAmount = sc.nextInt()
    println("Ваша коммиссия составляет : ${calculationOfCommission(cardType, sum, transferAmount)}")
}

fun calculationOfCommission(cardType: String, sum: Int, transferAmount: Int): Int {

    return when (cardType) {
        "Maestro", "Mastercard" -> calculationOfCommissionMaestroMasterCard(transferAmount)

        "Visa", "Мир" -> calculationOfCommissionVisaMir(transferAmount)

        else -> 0
    }
}

fun calculationOfCommissionMaestroMasterCard(transferAmount: Int): Int {
    var commission = 0
    if (transferAmount in 300 * 100..75000 * 100) {
        commission = 0
    } else {
        commission = (0.006 * transferAmount + 20 * 100).toInt()
    }
    return commission
}

fun calculationOfCommissionVisaMir(transferAmount: Int): Int {
    var commission = 0
    commission = (0.0075 * transferAmount).toInt()
    if (commission <= 35 * 100) {
        commission = (35 * 100)
        println("Минимальная комиссия составляет $commission копеек")
    }
    return commission
}
