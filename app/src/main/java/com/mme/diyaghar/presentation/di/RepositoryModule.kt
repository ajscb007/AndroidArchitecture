package com.mme.diyaghar.presentation.di

import com.mme.diyaghar.data.repository.RepositoryImpl
import com.mme.diyaghar.data.repository.dataSource.LocalDataSource
import com.mme.diyaghar.data.repository.dataSource.RemoteDataSource
import com.mme.diyaghar.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        remoteDataSource: RemoteDataSource,
        localDataSource: LocalDataSource
    ): Repository {
        return RepositoryImpl(
            remoteDataSource,
            localDataSource
        )
    }

}














