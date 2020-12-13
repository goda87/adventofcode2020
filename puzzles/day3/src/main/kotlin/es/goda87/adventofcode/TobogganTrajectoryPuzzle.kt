package es.goda87.adventofcode

class TobogganTrajectoryPuzzle : Puzzle {
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
        (lines).forEach {
            count += if (it[currentColumn] == '#') 1 else 0
            currentColumn = (currentColumn + 3) % rowLength
        }
        return count.toString()
    }
}