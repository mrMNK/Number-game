package com.mrmnk.numbergame.presentation

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mrmnk.numbergame.domain.entity.Level
import java.lang.RuntimeException

class GameViewModelFactory(
    private val level: Level,
    private val app: Application
): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            return GameViewModel(app, level) as T
        }
        throw RuntimeException("Unknown view model class $modelClass")
    }
}