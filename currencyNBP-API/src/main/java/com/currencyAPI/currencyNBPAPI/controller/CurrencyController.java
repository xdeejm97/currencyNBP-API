package com.currencyAPI.currencyNBPAPI.controller;

import com.currencyAPI.currencyNBPAPI.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CurrencyController {


    private final CurrencyService currencyService;

    @GetMapping("/cenyzlota")
    public void getGoldPrice(){
        currencyService.getGoldPrice();
    }
    @GetMapping("/exchange/USD-PLN")
    public void getCurrencyPrice(){
        currencyService.getCurrencyUSDPrice();
    }

}
