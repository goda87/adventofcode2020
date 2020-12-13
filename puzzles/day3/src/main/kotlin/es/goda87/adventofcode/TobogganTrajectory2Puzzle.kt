package es.goda87.adventofcode

class TobogganTrajectory2Puzzle : Puzzle {

    override fun getName(): CharSequence {
        return "--- Day 3: Toboggan Trajectory --- Part Two ---"
    }

    override fun getDefinition(): CharSequence {
        return "https://adventofcode.com/2020/day/3"
    }

    override fun getResult(input: CharSequence): String {
        return (TobogganTrajectoryPuzzle(1,1).getResult(input).toInt() *
        TobogganTrajectoryPuzzle(3,1).getResult(input).toInt() *
        TobogganTrajectoryPuzzle(5,1).getResult(input).toInt() *
        TobogganTrajectoryPuzzle(7,1).getResult(input).toInt() *
        TobogganTrajectoryPuzzle(1,2).getResult(input).toInt()).toString()
    }
}