package es.goda87.adventofcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TobogganTrajectoryPuzzleTest {

    private val input = "..##.......\n" +
            "#...#...#..\n" +
            ".#....#..#.\n" +
            "..#.#...#.#\n" +
            ".#...##..#.\n" +
            "..#.##.....\n" +
            ".#.#.#....#\n" +
            ".#........#\n" +
            "#.##...#...\n" +
            "#...##....#\n" +
            ".#..#...#.#"

    @Test
    fun getResult() {
        val actual = TobogganTrajectoryPuzzle().getResult(input)
        assertEquals("7", actual)
    }
}