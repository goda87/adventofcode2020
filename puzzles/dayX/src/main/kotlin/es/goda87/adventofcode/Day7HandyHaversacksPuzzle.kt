package es.goda87.adventofcode

class Day6CustomCustomsPuzzle : Puzzle {
    override fun getName(): CharSequence = "--- Day 6: Custom Customs ---"

    override fun getDefinition(): CharSequence = "https://adventofcode.com/2020/day/6"

    override fun getResult(input: CharSequence): String =
        input.split("\n\n").map { it.split("\n").reduce { acc, s -> acc + s } }
            .map { it.toList().distinct().size }.reduce { acc, i -> acc + i }.toString()
}

class Day6P2CustomCustomsPuzzle : Puzzle {
    override fun getName(): CharSequence = "--- Day 6: Custom Customs --- Part two ---"

    override fun getDefinition(): CharSequence = "https://adventofcode.com/2020/day/6"

    override fun getResult(input: CharSequence): String =
        input.split("\n\n").map { it.split("\n").map { it.toList() } }
            .map { it.reduce { acc, list -> acc.intersect(list).toList() } }.map { it.size }
            .reduce { acc, i -> acc + i }.toString()
}
