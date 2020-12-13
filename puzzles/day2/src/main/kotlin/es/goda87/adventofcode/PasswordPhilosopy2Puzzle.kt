package es.goda87.adventofcode

class PasswordPhilosopy2Puzzle : Puzzle {
    override fun getName(): CharSequence {
        return "--- Day 2: Password Philosophy --- Part Two ---"
    }

    override fun getDefinition(): CharSequence {
        return "--- Part Two ---\n" +
                "\n" +
                "While it appears you validated the passwords correctly, they don't seem to be what the Official Toboggan Corporate Authentication System is expecting.\n" +
                "\n" +
                "The shopkeeper suddenly realizes that he just accidentally explained the password policy rules from his old job at the sled rental place down the street! The Official Toboggan Corporate Policy actually works a little differently.\n" +
                "\n" +
                "Each policy actually describes two positions in the password, where 1 means the first character, 2 means the second character, and so on. (Be careful; Toboggan Corporate Policies have no concept of \"index zero\"!) Exactly one of these positions must contain the given letter. Other occurrences of the letter are irrelevant for the purposes of policy enforcement.\n" +
                "\n" +
                "Given the same example list from above:\n" +
                "\n" +
                "    1-3 a: abcde is valid: position 1 contains a and position 3 does not.\n" +
                "    1-3 b: cdefg is invalid: neither position 1 nor position 3 contains b.\n" +
                "    2-9 c: ccccccccc is invalid: both position 2 and position 9 contain c.\n" +
                "\n" +
                "How many passwords are valid according to the new interpretation of the policies?\n"
    }

    override fun getResult(input: CharSequence): String {
        TODO("Not implemented yet!")
    }
}