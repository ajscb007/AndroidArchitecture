package com.mme.diyaghar.domain.usecase

import com.mme.diyaghar.data.model.APIResponse
import com.mme.diyaghar.data.model.Article
import com.mme.diyaghar.data.util.Resource
import com.mme.diyaghar.domain.repository.Repository

class SaveNewsUseCase(private val newsRepository: Repository) {

    suspend fun execute(article: Article) = newsRepository.saveNews(article)

}