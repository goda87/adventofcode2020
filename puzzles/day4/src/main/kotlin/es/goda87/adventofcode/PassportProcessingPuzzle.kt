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
        val tokens = passport.split("\n", " ")
        val keys = tokens.map { it.split(":")[0] }
        if (!keys.containsAll(mandatoryKeycodes)) return 0
        if (!validateData) {
            return 1
        }
        val pairs = tokens.map { token -> token.split(":").let { it[0] to it[1] } }
        val validData = pairs.map {
            when (it.first) {
                "byr" -> isValidByr(it.second)
                "iyr" -> isValidIyr(it.second)
                "eyr" -> isValidEyr(it.second)
                "hgt" -> isValidHgt(it.second)
                "hcl" -> isValidHcl(it.second)
                "ecl" -> isValidEcl(it.second)
                "pid" -> isValidPid(it.second)
                "cid" -> true
                else -> true
            }
        }.reduce { result, it -> result and it }
        return if (validData) 1 else 0
    }

    private fun isValidByr(byr: String): Boolean = try {
        byr.toInt() in 1920..2002
    } catch (e: Exception) {
        false
    }

    private fun isValidIyr(iyr: String): Boolean = try {
        iyr.toInt() in 2010..2020
    } catch (e: Exception) {
        false
    }

    private fun isValidEyr(eyr: String): Boolean = try {
        eyr.toInt() in 2020..2030
    } catch (e: Exception) {
        false
    }

    private fun isValidHgt(hgt: String): Boolean = try {
        val unit = hgt.substring(hgt.length - 2)
        when (unit) {
            "cm" -> hgt.subSequence(0, hgt.length - 2).toString().toInt() in 150..193
            "in" -> hgt.subSequence(0, hgt.length - 2).toString().toInt() in 59..76
            else -> false
        }
    } catch (e: Exception) {
        false
    }

    private fun isValidHcl(hcl: String): Boolean = "^#[a-fA-F0-9]{6}\$".toRegex().matches(hcl)

    private fun isValidEcl(ecl: String): Boolean =
        listOf("amb", "blu", "brn", "gry", "grn", "hzl", "oth").contains(ecl)

    private fun isValidPid(pid: String): Boolean = "^[0-9]{9}\$".toRegex().matches(pid)

}
