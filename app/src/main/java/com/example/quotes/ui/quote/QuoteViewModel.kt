package com.example.quotes.ui.quote

import androidx.lifecycle.ViewModel
import com.example.quotes.data.Quote
import com.example.quotes.data.QuoteRepository

class QuoteViewModel (private val quoteRepository: QuoteRepository): ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes();

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote);
}