import java.util.*

val sc = Scanner(System.`in`)
var commission: Double = 0.0

fun main() {
    calculationOfCommission()
}

private fun calculationOfCommission() {
    print("Введите тип карты/счёта: ")
    val cardType = sc.nextLine()
    print("Введите сумму совершаемого перевода в копейках: ")
    val transferAmount = sc.nextInt()

    when (cardType) {
        "Maestro", "Mastercard" -> {
            if (transferAmount in 300 * 100..75000 * 100) {
                commission = 0.0
                print("Ваша комиссия составит: $commission копеек")
            } else {
                commission = 0.006 * transferAmount + 20 * 100
                print("Ваша комиссия составит: $commission копеек")
            }
        }

        "Visa", "Мир" -> {
            if (transferAmount < 100 * 100) {
                print("Минимальная сумма перевода 10000 копеек")
                return
            }
            commission = 0.0075 * transferAmount
            if (commission <= 35 * 100) {
                commission = (35 * 100).toDouble()
                print("Ваша комиссия составит: $commission копеек")
            } else {
                print("Ваша комиссия составит: $commission копеек")
            }
        }

        "Vk Pay" -> {
            print("Комиссия не взимается")
        }

        else -> print("Введите правильный тип карты/счёта")
    }
}