package com.mme.diyaghar.presentation.di

import com.mme.diyaghar.domain.repository.Repository
import com.mme.diyaghar.domain.usecase.GetNewsHeadlinesUseCase
import com.mme.diyaghar.domain.usecase.SaveNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Singleton
    @Provides
    fun provideGetNewsheadLinesUseCase(
        newsRepository: Repository
    ): GetNewsHeadlinesUseCase {
        return GetNewsHeadlinesUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideSaveNewsUseCase(
        newsRepository: Repository
    ): SaveNewsUseCase {
        return SaveNewsUseCase(newsRepository)
    }
}


















