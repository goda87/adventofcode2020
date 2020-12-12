package es.goda87.adventofcode2020.app

import es.goda87.adventofcode.Puzzle

fun solvePuzzlesToString(
    verbose: Boolean,
    vararg puzzles: Pair<Puzzle, CharSequence>
): CharSequence = StringBuffer().apply {
    puzzles.forEach { (puzzle, input) ->
        if (verbose) {
            appendln("###########################")
            appendln("------${puzzle.getName()}------")
            appendln(puzzle.getDefinition())
            appendln("------------")
            appendln("Your result is: -> ${puzzle.getResult(input)}")
            appendln("------------")
            appendln("###########################")
        } else {
            appendln("${puzzle.getName()} --> ${puzzle.getResult(input)}")
        }
    }
}