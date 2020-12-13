package es.goda87.adventofcode

class ReportRepairPuzzle(private val numbersToSelect: Int = 2) : Puzzle {
    override fun getName(): CharSequence {
        return "--- Day 1: Report Repair ---"
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
                "Of course, your expense report is much larger. Find the two entries that sum to 2020; what do you get if you multiply them together?\n" +
                "\n" +
                "--- Part Two ---\n" +
                "\n" +
                "The Elves in accounting are thankful for your help; one of them even offers you a starfish coin they had left over from a past vacation. They offer you a second one if you can find three numbers in your expense report that meet the same criteria.\n" +
                "\n" +
                "Using the above example again, the three entries that sum to 2020 are 979, 366, and 675. Multiplying them together produces the answer, 241861950.\n" +
                "\n" +
                "In your expense report, what is the product of the three entries that sum to 2020?\n"
    }

    override fun getResult(input: CharSequence): String {
        val list = input.split("\n").map { it.toInt() }
        return findAndMultiplyNNumbersThatSum(2020, numbersToSelect, list)?.toString() ?: "NOT FOUND"
    }

    private fun findAndMultiplyNNumbersThatSum(sum: Int, n: Int, list: List<Int>): Int? {
        if (n > 1) {
            list.forEachIndexed { i, first ->
                findAndMultiplyNNumbersThatSum(sum - first, n - 1, list.subList(i + 1, list.size))?.let {
                    return first * it
                }
            }
        } else {
            return if (list.contains(sum)) sum else null
        }
        return null
    }
}