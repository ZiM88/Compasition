package com.example.compasition.domain.entity

data class Question (
    val sum: Int,
    val visibleNUmber: Int,
    val options:List<Int>
        ) {
    val rightAnswer: Int
    get() = sum - visibleNUmber
}