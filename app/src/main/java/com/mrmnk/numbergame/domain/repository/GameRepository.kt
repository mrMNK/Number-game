package com.mrmnk.numbergame.domain.repository

import com.mrmnk.numbergame.domain.entity.GameSettings
import com.mrmnk.numbergame.domain.entity.Level
import com.mrmnk.numbergame.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}