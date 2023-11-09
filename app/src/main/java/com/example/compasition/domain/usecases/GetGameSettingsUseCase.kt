package com.example.compasition.domain.usecases

import com.example.compasition.domain.entity.GameSettings
import com.example.compasition.domain.entity.Level
import com.example.compasition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}