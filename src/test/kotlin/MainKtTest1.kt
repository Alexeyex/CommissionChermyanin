import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun mainTest() {
        main()
        assertEquals(true, true)
    }

    @Test
    fun calculationOfCommission() {
        val result = Unit
        assertEquals(result, calculationOfCommission("Maestro", 1000000, 100))
        assertEquals(result, calculationOfCommission("Visa", 1000000, 1000))
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
        val result = 7500
        assertEquals(result, calculationOfCommissionVisaMir(1_000_000))

    }

    @Test
    fun calculationOfCommissionVisaMir_WhenTheObligatoryCommission() {
        val result = 3500
        assertEquals(result, calculationOfCommissionVisaMir(100_000))

    }

}