package com.javiaps94.application

import com.javiaps94.utilities.toSentenceCase

fun applySomeFunctionToString(inputString: String, myFunction: (String) -> String): String {
    return myFunction(inputString);
}

fun main(args: Array<String>) {
    val result = applySomeFunctionToString("hello", ::toSentenceCase)
    val result2 = applySomeFunctionToString("hello") { it.toUpperCase() }
    println(result)
    println(result2)

    val colors = listOf("red", "green", "blue", "black")

    val upperCaseColors = colors.map { it.toUpperCase() }

    upperCaseColors.forEach { println(it) }

    val colorsStartingWithB = colors.filter { it.startsWith("b") }

    colorsStartingWithB.forEach { println(it) }

    colors.flatMap { if (it.startsWith("b")) listOf(it, it) else listOf(it) }.forEach { println(it) }
    println(colors.reduce { result, value -> "$result, $value" })

    val numbers = colors.map { it.length }
    numbers.forEach { println(it) }
    println(numbers.sum())
    println(numbers.average())
    println(numbers.count())

    println(numbers.fold(0) { result, value -> result + value })
    println(numbers.fold(0) { result, value -> if (value > result) value else result })

    val myMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    myMap.filter { (k, v) -> v.startsWith("t") }.forEach { (k, v) -> println ("$k $v") }
}