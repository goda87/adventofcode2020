package es.goda87.adventofcode

class TobogganTrajectoryPuzzle(
    private val right: Int = 3,
    private val down: Int = 1
) : Puzzle {
    override fun getName(): CharSequence {
        return "--- Day 3: Toboggan Trajectory ---"
    }

    override fun getDefinition(): CharSequence {
        return "https://adventofcode.com/2020/day/3"
    }

    override fun getResult(input: CharSequence): String {
        val lines = input.split("\n")
        val rowLength = lines[0].length
        var currentColumn = 0
        var count = 0
        (lines.indices step down).forEach {
            count += if (lines[it][currentColumn] == '#') 1 else 0
            currentColumn = (currentColumn + right) % rowLength
        }
        return count.toString()
    }
}