import org.junit.Test

import org.junit.Assert.*

class MainKtTest {


    @Test
    fun calculationOfCommission() {
        var result = 2000
        assertEquals(result, calculationOfCommission("Maestro", 1_000_000, 100))
        result = 3500
        assertEquals(result, calculationOfCommission("Visa", 1_000_000, 100))
        result = 2081
        assertEquals(result, calculationOfCommission("Mastercard", 1_000_000, 13500))
        result = 3500
        assertEquals(result, calculationOfCommission("Мир", 1_000_000, 100))
        result = 0
        assertEquals(result, calculationOfCommission("Vk Pay", 1_000_000, 100))
    }


    @Test
    fun calculationOfCommissionMaestroMasterCard_WhenThereIsNoCommission(){
        val result = 0
        assertEquals(result, calculationOfCommissionMaestroMasterCard(35000))
    }

    @Test
    fun calculationOfCommissionMaestroMasterCard_WhenThereIsACommission() {
        var result = 47000
        assertEquals(result, calculationOfCommissionMaestroMasterCard(7_500_001))
        result = 2120
        assertEquals(result, calculationOfCommissionMaestroMasterCard(20000))
    }


    @Test
    fun calculationOfCommissionVisaMir_WhenThereIsACommission() {
        var result = 7500
        assertEquals(result, calculationOfCommissionVisaMir(1_000_000))


    }

    @Test
    fun calculationOfCommissionVisaMir_WhenTheObligatoryCommission() {
        val result = 3500
        assertEquals(result, calculationOfCommissionVisaMir(100_000))

    }

}