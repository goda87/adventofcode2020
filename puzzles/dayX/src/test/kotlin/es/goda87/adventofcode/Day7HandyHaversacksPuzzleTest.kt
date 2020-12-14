package es.goda87.adventofcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day7HandyHaversacksPuzzleTest {

    private val input = "light red bags contain 1 bright white bag, 2 muted yellow bags.\n" +
            "dark orange bags contain 3 bright white bags, 4 muted yellow bags.\n" +
            "bright white bags contain 1 shiny gold bag.\n" +
            "muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.\n" +
            "shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.\n" +
            "dark olive bags contain 3 faded blue bags, 4 dotted black bags.\n" +
            "vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.\n" +
            "faded blue bags contain no other bags.\n" +
            "dotted black bags contain no other bags."

    @Test
    fun getResult() {
        val actual = Day7HandyHaversacksPuzzle().getResult(input)
        assertEquals("4", actual)
    }

//    @Test //TODO puzzle not defined yet
//    fun part2getResult() {
//        val actual = Day7p2HandyHaversacksPuzzle().getResult(input)
//        assertEquals("6", actual)
//    }
}
