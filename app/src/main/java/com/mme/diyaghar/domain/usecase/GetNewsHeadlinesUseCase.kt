package com.mme.diyaghar.domain.usecase

import com.mme.diyaghar.data.model.APIResponse
import com.mme.diyaghar.data.util.Resource
import com.mme.diyaghar.domain.repository.Repository


class GetNewsHeadlinesUseCase(private val newsRepository: Repository) {

    suspend fun execute(country : String, page : Int): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines(country, page)
    }

}