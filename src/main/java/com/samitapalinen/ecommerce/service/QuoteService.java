package com.samitapalinen.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import com.samitapalinen.ecommerce.model.Quote;

public class QuoteService {
    private List<Quote> quotes = new ArrayList<>();

    public void addQuote(Quote quote){
        quotes.add(quote);
    }

    public List<Quote> getQuotes(){
        return quotes;
    }
}
