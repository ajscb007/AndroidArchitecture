package com.mme.diyaghar.presentation.di

import android.app.Application
import androidx.room.Room
import com.mme.diyaghar.data.db.ArticleDAO
import com.mme.diyaghar.data.db.Database
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {
    @Singleton
    @Provides
    fun provideNewsDatabase(app: Application): Database {
        return Room.databaseBuilder(app, Database::class.java, "diyaghar_db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideNewsDao(articleDatabase: Database): ArticleDAO {
        return articleDatabase.getArticleDAO()
    }
}