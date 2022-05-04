package com.example.mvvmexample.domain

import com.example.mvvmexample.data.QuoteRepository
import com.example.mvvmexample.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository=QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>?{
        return repository.getAllQuotes()
    }
}