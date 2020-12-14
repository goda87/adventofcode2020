package es.goda87.adventofcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day6CustomCustomsPuzzleTest {

    private val input = "abc\n" +
            "\n" +
            "a\n" +
            "b\n" +
            "c\n" +
            "\n" +
            "ab\n" +
            "ac\n" +
            "\n" +
            "a\n" +
            "a\n" +
            "a\n" +
            "a\n" +
            "\n" +
            "b"

    @Test
    fun getResult() {
        val actual = Day6CustomCustomsPuzzle().getResult(input)
        assertEquals("11", actual)
    }

    @Test
    fun part2getResult() {
        val actual = Day6P2CustomCustomsPuzzle().getResult(input)
        assertEquals("6", actual)
    }
}
