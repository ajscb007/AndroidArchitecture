package com.mme.diyaghar.presentation.di

import com.mme.diyaghar.data.api.APIService
import com.mme.diyaghar.data.repository.dataSource.RemoteDataSource
import com.mme.diyaghar.data.repository.dataSourceImpl.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsAPIService: APIService
    ):RemoteDataSource{
        return RemoteDataSourceImpl(newsAPIService)
    }

}












