package com.mme.diyaghar.presentation.di

import com.mme.diyaghar.data.db.ArticleDAO
import com.mme.diyaghar.data.repository.dataSource.LocalDataSource
import com.mme.diyaghar.data.repository.dataSourceImpl.LocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO):LocalDataSource{
        return LocalDataSourceImpl(articleDAO)
    }

}













