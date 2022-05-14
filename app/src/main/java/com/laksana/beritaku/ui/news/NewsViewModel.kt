package com.laksana.beritaku.ui.news

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.laksana.beritaku.models.NewsResponse
import com.laksana.beritaku.repository.NewsRepository
import com.laksana.beritaku.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {

    val news: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()

    init {
        getNews()
    }

    private fun getNews() = viewModelScope.launch {
        news.postValue(Resource.Loading())
        val response = newsRepository.getNews()
        news.postValue(handleBreakingNewsResponse(response))
    }

    private fun handleBreakingNewsResponse(response: Response<NewsResponse>) : Resource<NewsResponse> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }
}