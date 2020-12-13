package es.goda87.adventofcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

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

    @ParameterizedTest
    @ArgumentsSource(TobogganTrajectoryPuzzleTestArgumentsProvider::class)
    fun getResult(right: Int, down: Int, expected: String) {
        val actual = TobogganTrajectoryPuzzle(right, down).getResult(input)
        assertEquals(expected, actual)
    }
}

internal class TobogganTrajectoryPuzzleTestArgumentsProvider : ArgumentsProvider {

    override fun provideArguments(context: ExtensionContext): Stream<out Arguments> {
        return Stream.of(
            arguments(1,1,"2"),
            arguments(3,1,"7"),
            arguments(5,1,"3"),
            arguments(7,1,"4"),
            arguments(1,2,"2")
        )
    }

}