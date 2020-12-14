package es.goda87.adventofcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

internal class BinaryBoardingPuzzleTest {

    @ParameterizedTest
    @ArgumentsSource(RowTestArgumentsProvider::class)
    fun calculateRow(seat: String, row: Int, column: Int, id: Int) {
        val actual = BinaryBoardingPuzzle().getRow(seat)
        assertEquals(row, actual)
    }

    @ParameterizedTest
    @ArgumentsSource(RowTestArgumentsProvider::class)
    fun calculateColumn(seat: String, row: Int, column: Int, id: Int) {
        val actual = BinaryBoardingPuzzle().getColumn(seat)
        assertEquals(column, actual)
    }

    @ParameterizedTest
    @ArgumentsSource(RowTestArgumentsProvider::class)
    fun calculateId(seat: String, row: Int, column: Int, id: Int) {
        val actual = BinaryBoardingPuzzle().getId(seat)
        assertEquals(id, actual)
    }

    @Test
    fun getResult() {
        val input = "BFFFBBFRRR\nFFFBBBFRRR\nBBFFBBFRLL"
        val actual = BinaryBoardingPuzzle().getResult(input)
        assertEquals("820", actual)
    }
}

internal class RowTestArgumentsProvider : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext): Stream<out Arguments> {
        return Stream.of(
            arguments("BFFFBBFRRR", 70, 7, 567),
            arguments("FFFBBBFRRR", 14, 7, 119),
            arguments("BBFFBBFRLL", 102, 4, 820)
        )
    }
}
