package com.example.mvvm_roomdb

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class viewModel(val faqsRepository: faqsRepository):ViewModel() {

fun getFaqs():LiveData<List<faqs>>{
    return faqsRepository.getfaqs()
}
    fun insertfaqs(faqs: faqs){
        viewModelScope.launch {
             faqsRepository.insertfaqs(faqs)
        }
    }
}