package com.mme.diyaghar.presentation.di

import android.app.Application
import com.mme.diyaghar.domain.usecase.GetNewsHeadlinesUseCase
import com.mme.diyaghar.domain.usecase.SaveNewsUseCase
import com.mme.diyaghar.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        saveNewsUseCase: SaveNewsUseCase
    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            application,
            getNewsHeadlinesUseCase,
            saveNewsUseCase
        )
    }
}








