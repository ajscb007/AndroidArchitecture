package com.mme.diyaghar.data.repository.dataSource

import com.mme.diyaghar.data.model.APIResponse
import retrofit2.Response

interface RemoteDataSource {

    suspend fun getTopHeadlines(country : String, page : Int):Response<APIResponse>

}