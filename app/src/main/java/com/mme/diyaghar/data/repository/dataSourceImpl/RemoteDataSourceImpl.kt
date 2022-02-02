package com.mme.diyaghar.data.repository.dataSourceImpl

import com.mme.diyaghar.data.api.APIService
import com.mme.diyaghar.data.model.APIResponse
import com.mme.diyaghar.data.repository.dataSource.RemoteDataSource
import retrofit2.Response

class RemoteDataSourceImpl(
    private val apiService: APIService
): RemoteDataSource {
    override suspend fun getTopHeadlines(country : String, page : Int): Response<APIResponse> {
        return apiService.getTopHeadlines(country, page)
    }
}