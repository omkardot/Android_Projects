package com.example.mvvm_roomdb

import androidx.lifecycle.LiveData

class faqsRepository(private val faqsDAO: faqsDAO) {

    fun getfaqs():LiveData<List<faqs>>{
        return faqsDAO.getfaqs()
    }
    suspend fun insertfaqs(faqs: faqs){
        return faqsDAO.insertFaq(faqs)
    }
}