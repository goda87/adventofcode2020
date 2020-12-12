package es.goda87.adventofcode2020.app

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets

fun readFileAsString(file: CharSequence): CharSequence {
    return Thread.currentThread().contextClassLoader?.getResourceAsStream(file.toString())?.let {
        val inReader = InputStreamReader(it, StandardCharsets.UTF_8)
        BufferedReader(inReader).readLines().joinToString(separator = "\n")
    } ?: throw IOException("File not found: $file")
}