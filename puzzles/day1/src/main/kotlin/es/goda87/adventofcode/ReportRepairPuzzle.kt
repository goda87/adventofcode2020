package es.goda87.adventofcode

class ReportRepairPuzzle: Puzzle {
    override fun getName(): CharSequence {
        return "Day 01, problem 01: Report Repair"
    }

    override fun getDefinition(): CharSequence {
        return "--- Day 1: Report Repair ---\n" +
                "\n" +
                "After saving Christmas five years in a row, you've decided to take a vacation at a nice resort on a tropical island. Surely, Christmas will go on without you.\n" +
                "\n" +
                "The tropical island has its own currency and is entirely cash-only. The gold coins used there have a little picture of a starfish; the locals just call them stars. None of the currency exchanges seem to have heard of them, but somehow, you'll need to find fifty of these coins by the time you arrive so you can pay the deposit on your room.\n" +
                "\n" +
                "To save your vacation, you need to get all fifty stars by December 25th.\n" +
                "\n" +
                "Collect stars by solving puzzles. Two puzzles will be made available on each day in the Advent calendar; the second puzzle is unlocked when you complete the first. Each puzzle grants one star. Good luck!\n" +
                "\n" +
                "Before you leave, the Elves in accounting just need you to fix your expense report (your puzzle input); apparently, something isn't quite adding up.\n" +
                "\n" +
                "Specifically, they need you to find the two entries that sum to 2020 and then multiply those two numbers together.\n" +
                "\n" +
                "For example, suppose your expense report contained the following:\n" +
                "\n" +
                "1721\n" +
                "979\n" +
                "366\n" +
                "299\n" +
                "675\n" +
                "1456\n" +
                "\n" +
                "In this list, the two entries that sum to 2020 are 1721 and 299. Multiplying them together produces 1721 * 299 = 514579, so the correct answer is 514579.\n" +
                "\n" +
                "Of course, your expense report is much larger. Find the two entries that sum to 2020; what do you get if you multiply them together?\n"
    }

    override fun getResult(input: CharSequence): String {
        val list = input.split("\n").map { it.toInt() }
        list.forEachIndexed { i, first ->
            list.subList(i+1, list.size).forEach { second ->
                if (first + second == 2020) return "${first*second}"
            }
        }
        return "NOT FOUND"
    }
}