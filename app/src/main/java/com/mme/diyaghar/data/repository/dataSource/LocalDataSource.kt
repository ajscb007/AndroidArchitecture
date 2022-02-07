package com.mme.diyaghar.data.repository.dataSource

import com.mme.diyaghar.data.model.Article
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {
    suspend fun saveArticleToDB(article: Article)
    fun getSavedArticles(): Flow<List<Article>>
}