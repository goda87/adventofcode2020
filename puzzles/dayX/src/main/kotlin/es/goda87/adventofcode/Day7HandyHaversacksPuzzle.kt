package es.goda87.adventofcode

private data class Rule(
    val color: String,
    val contains: List<Pair<Int, String>>
)

class Day7HandyHaversacksPuzzle : Puzzle {
    override fun getName(): CharSequence = "--- Day 7: Handy Haversacks ---"

    override fun getDefinition(): CharSequence = "https://adventofcode.com/2020/day/7"

    override fun getResult(input: CharSequence): String =
        bagsThatCanContainThisColor("shiny gold", mapRules(input)).size.toString()

    private fun bagsThatCanContainThisColorDirectly(color: String, rules: List<Rule>): List<String> {
        return rules.filter { it.contains.map { it.second }.contains(color) }.map { it.color }
    }

    private fun bagsThatCanContainThisColor(color: String, rules: List<Rule>): List<String> {
        var list1 = bagsThatCanContainThisColorDirectly(color, rules)
        var list2: List<String>
        do {
            list2 = list1
            list1 = (list2 + list2.map { bagsThatCanContainThisColorDirectly(it, rules) }.flatten()).distinct()
        } while(list1.size > list2.size)
        return list1
    }

}

private fun mapRules(input: CharSequence): List<Rule> = input.split("\n").map { mapRule(it) }

private fun mapRule(rule: String): Rule {
    val x = rule.split(" contain ")
    return Rule(
        color = x[0].replace(" bags", ""),
        contains = mapContains(x[1])
    )
}

private fun mapContains(contain: String): List<Pair<Int, String>> {
    if (contain == "no other bags.") return listOf()
    return contain.split(", ").map { it.split(" ") }
        .map { it[0].toInt() to it.subList(1, it.size - 1).joinToString(" ") }
}

class Day7p2HandyHaversacksPuzzle : Puzzle {
    override fun getName(): CharSequence = "--- Day 7: Handy Haversacks --- Part two ---"

    override fun getDefinition(): CharSequence = "https://adventofcode.com/2020/day/7"

    override fun getResult(input: CharSequence): String {
        return countBagsInside("shiny gold", mapRules(input)).minus(1).toString()
    }

    private fun countBagsInside(color: String, rules: List<Rule>): Int {
        return rules.first { it.color == color }.contains
            .map { it.first * countBagsInside(it.second, rules) }
            .fold(0) { acc, i -> acc + i }
            .plus(1)
    }
}
