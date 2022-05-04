package com.example.mvvmexample.domain

import com.example.mvvmexample.data.model.QuoteModel
import com.example.mvvmexample.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    operator fun invoke():QuoteModel?{
        val quotes=QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()){
            val randomNumber=(0..quotes.size-1).random()
            return quotes[randomNumber]
        }
        return null
    }
}