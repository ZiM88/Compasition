package com.example.compasition.domain.repository

import com.example.compasition.domain.entity.GameSettings
import com.example.compasition.domain.entity.Level
import com.example.compasition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}