package com.laksana.beritaku.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.laksana.beritaku.repository.NewsRepository
import com.laksana.beritaku.ui.news.NewsViewModel

class NewsViewModelProviderFactory(
    private val newsRepository: NewsRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}