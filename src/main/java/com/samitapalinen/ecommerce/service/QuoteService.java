package com.samitapalinen.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.samitapalinen.ecommerce.model.Quote;

@Service
public class QuoteService {
    private List<Quote> quotes = new ArrayList<>();

    public String addQuote(Quote quote) {
        try {
            quotes.add(quote);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Quote added";
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public Quote getQuoteById(int id) {
        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                return quote;
            }
        }
        return null;
    }

    public String updateQuote(int id, Quote updatedQuote)
    {
        int quoteListSize = quotes.size();
        for (int i = 0; i < quoteListSize; i++) {
            if (quotes.get(i).getId() == id) {
                updatedQuote.setId(id);
                quotes.set(i, updatedQuote);
                return "Quote updated";
            }
        }
        return "No quote found";
    }

    public String deleteQuote(int id) {
        int quoteListSize = quotes.size();
        for (int i = 0; i < quoteListSize; i++) {
            if (quotes.get(i).getId() == id) {
                quotes.remove(i);
                return "Quote deleted";
            }
        }
        return "No quote found";
    }
}
