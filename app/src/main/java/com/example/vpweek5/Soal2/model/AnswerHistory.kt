package com.example.vpweek5.Soal2.model

data class AnswerHistory(
    val question: Question,
    val selectedAnswer: String
) {
    val isCorrect: Boolean
        get() = selectedAnswer == question.correctAnswer
}