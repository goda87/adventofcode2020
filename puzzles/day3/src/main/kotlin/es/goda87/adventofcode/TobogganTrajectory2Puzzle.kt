package es.goda87.adventofcode

class TobogganTrajectory2Puzzle : Puzzle {

    override fun getName(): CharSequence {
        return "--- Day 3: Toboggan Trajectory --- Part Two ---"
    }

    override fun getDefinition(): CharSequence {
        return "https://adventofcode.com/2020/day/3"
    }

    private val slopes = listOf(
        1 to 1,
        3 to 1,
        5 to 1,
        7 to 1,
        1 to 2
    )

    override fun getResult(input: CharSequence): String {
        return slopes.map { valueForSlope(it.first, it.second, input) }.product().toString()
    }

    private fun valueForSlope(right: Int, down: Int, input: CharSequence): Int =
        TobogganTrajectoryPuzzle(right,down).getResult(input).toInt()

    private fun List<Int>.product(): Int {
        var product = 1
        forEach { product *= it }
        return product
    }
}