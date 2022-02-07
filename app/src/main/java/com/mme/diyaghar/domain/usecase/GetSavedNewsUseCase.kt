package com.mme.diyaghar.domain.usecase

import com.mme.diyaghar.data.model.Article
import com.mme.diyaghar.domain.repository.Repository
import kotlinx.coroutines.flow.Flow


class GetSavedNewsUseCase(private val repository: Repository) {
    fun execute(): Flow<List<Article>> {
        return  repository.getSavedNews()
    }
}