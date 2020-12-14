package es.goda87.adventofcode

class Day6CustomCustomsPuzzle : Puzzle {
    override fun getName(): CharSequence = "--- Day 6: Custom Customs ---"

    override fun getDefinition(): CharSequence = "https://adventofcode.com/2020/day/6"

    override fun getResult(input: CharSequence): String =
        input.split("\n\n").map { it.split("\n").reduce { acc, s -> acc + s } }
            .map { it.toList().distinct().size }.reduce { acc, i -> acc + i }.toString()
}
