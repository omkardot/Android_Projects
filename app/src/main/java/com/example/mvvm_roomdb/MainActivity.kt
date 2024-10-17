package com.example.mvvm_roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.mvvm_roomdb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var mainViewModel:viewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val Dao=faqsDatabase.getInstance(applicationContext).faqsDao()
        val faqsRepository=faqsRepository(Dao)
        mainViewModel=ViewModelProvider(this,viewModelFactory(faqsRepository)).get(viewModel::class.java)

        mainViewModel.getFaqs().observe(this) {
            binding.faqs = it.toString()
        }
        binding.btnAddQuote.setOnClickListener {
            mainViewModel.insertfaqs(faqs(1,"omkar","omkar"))
        }
    }
}