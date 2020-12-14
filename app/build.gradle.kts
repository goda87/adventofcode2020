/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("es.goda87.adventofcode2020.kotlin-application-conventions")
}

dependencies {
    implementation(project(":puzzles:common"))
    implementation(project(":puzzles:day1"))
    implementation(project(":puzzles:day2"))
    implementation(project(":puzzles:day3"))
    implementation(project(":puzzles:day4"))
    implementation(project(":puzzles:day5"))
}

application {
    // Define the main class for the application.
    mainClass.set("es.goda87.adventofcode2020.app.AppKt")
}
