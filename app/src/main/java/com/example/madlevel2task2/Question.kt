package com.example.madlevel2task2

data class Question (
    var question : String,
    var answer : Boolean
) {
    companion object {
        val QUESTIONS = arrayOf(
            "A 'val' and 'var' are the same.",
            "Mobile Application Development grants 12 ECTS.",
            "A unit in Kotlin corresponds to a void in Java.",
            "In Kotlin 'when' replaces the 'switch' operator in Java.",
            "In Kotlin the 'or' operator replaces the '||' operator in Java.",
            ".xml files have no purpose."
        )

        val ANSWERS = arrayOf(
            false,
            false,
            true,
            true,
            true,
            false
        )
    }
}