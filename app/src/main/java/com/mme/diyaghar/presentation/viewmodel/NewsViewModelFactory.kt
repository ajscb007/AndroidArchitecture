package com.mme.diyaghar.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mme.diyaghar.domain.usecase.GetNewsHeadlinesUseCase
import com.mme.diyaghar.domain.usecase.GetSavedNewsUseCase
import com.mme.diyaghar.domain.usecase.SaveNewsUseCase

class NewsViewModelFactory(
    private val app:Application,
    private val getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
    private val saveNewsUseCase: SaveNewsUseCase,
    private val getSavedNewsUseCase: GetSavedNewsUseCase
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(
            app,
            getNewsHeadlinesUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase
        ) as T
    }
}









