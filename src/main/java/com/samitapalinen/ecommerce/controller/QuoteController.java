package com.samitapalinen.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samitapalinen.ecommerce.model.Quote;
import com.samitapalinen.ecommerce.service.QuoteService;

@RestController
public class QuoteController {
    @Autowired
    QuoteService quoteService;

    @GetMapping("quotes")
    public List<Quote> getQuotes() {
        return quoteService.getQuotes();
    }

    @GetMapping("quotes/{id}")
    public Quote getQuoteById(@PathVariable int id) {
        return quoteService.getQuoteById(id);
    }

    @PostMapping("quote")
    public String addQuote(@RequestBody Quote quote) {
        return quoteService.addQuote(quote);
    }

    @PutMapping("quote/{id}")
    public String updateQuote(@PathVariable int id, @RequestBody Quote quote) {
        return quoteService.updateQuote(id, quote);
    }
}
