package es.goda87.adventofcode

interface Puzzle {
    fun getName(): CharSequence
    fun getDefinition(): CharSequence
    fun getResult(input: CharSequence): String
}