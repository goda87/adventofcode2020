package es.goda87.adventofcode

class PasswordPhilosophyPuzzle : Puzzle {
    override fun getName(): CharSequence {
        return "--- Day 2: Password Philosophy ---"
    }

    override fun getDefinition(): CharSequence {
        return "--- Day 2: Password Philosophy ---\n" +
                "\n" +
                "Your flight departs in a few days from the coastal airport; the easiest way down to the coast from here is via toboggan.\n" +
                "\n" +
                "The shopkeeper at the North Pole Toboggan Rental Shop is having a bad day. \"Something's wrong with our computers; we can't log in!\" You ask if you can take a look.\n" +
                "\n" +
                "Their password database seems to be a little corrupted: some of the passwords wouldn't have been allowed by the Official Toboggan Corporate Policy that was in effect when they were chosen.\n" +
                "\n" +
                "To try to debug the problem, they have created a list (your puzzle input) of passwords (according to the corrupted database) and the corporate policy when that password was set.\n" +
                "\n" +
                "For example, suppose you have the following list:\n" +
                "\n" +
                "1-3 a: abcde\n" +
                "1-3 b: cdefg\n" +
                "2-9 c: ccccccccc\n" +
                "\n" +
                "Each line gives the password policy and then the password. The password policy indicates the lowest and highest number of times a given letter must appear for the password to be valid. For example, 1-3 a means that the password must contain a at least 1 time and at most 3 times.\n" +
                "\n" +
                "In the above example, 2 passwords are valid. The middle password, cdefg, is not; it contains no instances of b, but needs at least 1. The first and third passwords are valid: they contain one a or nine c, both within the limits of their respective policies.\n" +
                "\n" +
                "How many passwords are valid according to their policies?\n"
    }

    override fun getResult(input: CharSequence): String {
        var validLines = 0
        input.split("\n").forEach { line ->
            validLines += validateLine(line)
        }
        return validLines.toString()
    }

    private fun validateLine(line: CharSequence): Int {
        val tokens = line.split(" ")
        val range = tokens[0].split("-").let {
            it[0].toInt()..it[1].toInt()
        }
        val afectedChar = tokens[1][0]
        val password = tokens[2]
        val count = password.count { it == afectedChar }
        return if (count in range) 1 else 0
    }
}