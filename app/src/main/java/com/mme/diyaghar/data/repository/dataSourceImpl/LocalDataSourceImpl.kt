package com.mme.diyaghar.data.repository.dataSourceImpl

import com.mme.diyaghar.data.db.ArticleDAO
import com.mme.diyaghar.data.model.Article
import com.mme.diyaghar.data.repository.dataSource.LocalDataSource
import kotlinx.coroutines.flow.Flow

class LocalDataSourceImpl(
    private val articleDAO: ArticleDAO
): LocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }

    override fun getSavedArticles(): Flow<List<Article>> {
        return articleDAO.getAllArticles()
    }
}