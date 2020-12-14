package es.goda87.adventofcode

import java.lang.Integer.max

class BinaryBoarding2Puzzle : Puzzle {
    override fun getName(): CharSequence = "--- Day 5: Binary Boarding ---  Part two ---"

    override fun getDefinition(): CharSequence = "https://adventofcode.com/2020/day/5"

    override fun getResult(input: CharSequence): String {
        val bbp = BinaryBoardingPuzzle()
        val seatsIds = input.split("\n").map { bbp.getId(it) }.sorted()
        return seatsIds.reduce { acc, i -> if (i - acc == 1) i else acc}.plus(1).toString()
    }

}

class BinaryBoardingPuzzle : Puzzle {
    override fun getName(): CharSequence {
        return "--- Day 5: Binary Boarding ---"
    }

    override fun getDefinition(): CharSequence {
        return "https://adventofcode.com/2020/day/5"
    }

    override fun getResult(input: CharSequence): String {
        val seats = input.split("\n")
        return seats.map { getId(it) }.reduce {acc, i -> max(acc, i) }.toString()
    }

    internal fun getRow(seat: String): Int =
        seat.subSequence(0, 7).map { it == 'F' }.binaryApproach(127)


    fun getColumn(seat: String): Int =
        seat.subSequence(7, 10).map { it == 'L' }.binaryApproach(7)

    fun getId(seat: String): Int = getRow(seat) * 8 + getColumn(seat)

    private fun List<Boolean>.binaryApproach(n: Int): Int {
        var min = 0
        var max = n
        forEach {
            if (it) {
                max -= ((max - min) / 2)
            } else {
                min = max - ((max - min) / 2)
            }
        }
        return min
    }
}
