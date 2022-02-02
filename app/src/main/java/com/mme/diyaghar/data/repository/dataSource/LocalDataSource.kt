package com.mme.diyaghar.data.repository.dataSource

import com.mme.diyaghar.data.model.Article

interface LocalDataSource {
    suspend fun saveArticleToDB(article: Article)
}