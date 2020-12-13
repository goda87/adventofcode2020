package es.goda87.adventofcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PasswordPhilosophyPuzzleTest {

    private val input = "1-3 a: abcde\n" +
            "1-3 b: cdefg\n" +
            "2-9 c: ccccccccc"

    @Test
    fun getResult() {
        val actual = PasswordPhilosophyPuzzle().getResult(input)
        Assertions.assertEquals("2", actual)
    }
}