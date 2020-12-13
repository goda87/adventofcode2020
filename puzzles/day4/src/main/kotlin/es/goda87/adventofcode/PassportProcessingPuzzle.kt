package es.goda87.adventofcode

private val mandatoryKeycodes = listOf(
    "byr",
    "iyr",
    "eyr",
    "hgt",
    "hcl",
    "ecl",
    "pid"
)

private val optionalKeycodes = listOf("cid")

class PassportProcessingPuzzle(private val validateData: Boolean = false) : Puzzle {
    override fun getName(): CharSequence {
        return "--- Day 4: Passport Processing ---"
    }

    override fun getDefinition(): CharSequence {
        return "https://adventofcode.com/2020/day/4"
    }

    override fun getResult(input: CharSequence): String {
        val passports = input.split("\n\n")
        var count = 0
        passports.forEach {
            count += isValidPassport(it)
        }
        return count.toString()
    }

    private fun isValidPassport(passport: CharSequence): Int {
        val keys = passport.split("\n", " ").map { it.split(":")[0] }
        return if (keys.containsAll(mandatoryKeycodes)) 1 else 0
    }
}
