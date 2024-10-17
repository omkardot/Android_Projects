package com.example.mvvm_roomdb

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class viewModelFactory(val faqsRepository: faqsRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModel(faqsRepository) as T
    }

}