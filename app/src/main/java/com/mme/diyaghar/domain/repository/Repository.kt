package com.mme.diyaghar.domain.repository

import com.mme.diyaghar.data.model.APIResponse
import com.mme.diyaghar.data.model.Article
import com.mme.diyaghar.data.util.Resource
import kotlinx.coroutines.flow.Flow


interface Repository {
    suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse>
    suspend fun saveNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>
}