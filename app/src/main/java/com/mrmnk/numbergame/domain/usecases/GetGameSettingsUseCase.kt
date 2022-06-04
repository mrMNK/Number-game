package com.mrmnk.numbergame.domain.usecases

import com.mrmnk.numbergame.domain.entity.GameSettings
import com.mrmnk.numbergame.domain.entity.Level
import com.mrmnk.numbergame.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}