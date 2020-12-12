package es.goda87.adventofcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ReportRepairPuzzleTest {

    val expectedResult = "514579"
    val input = "1721\n" +
            "979\n" +
            "366\n" +
            "299\n" +
            "675\n" +
            "1456"

    @Test
    fun getResult() {
        val actual = ReportRepairPuzzle().getResult(input)
        assertEquals(expectedResult, actual)
    }
}