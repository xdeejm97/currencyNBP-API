package com.currencyAPI.currencyNBPAPI.controller;

import com.currencyAPI.currencyNBPAPI.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/currency")
@RequiredArgsConstructor
public class CurrencyController {


    private final CurrencyService currencyService;

    @GetMapping("/goldPrice")
    public String getGoldPrice(){
        currencyService.getCurrency();
        return null;
    }
    @GetMapping("/")
    public String getCurrencyPrice(){

        return null;
    }

}
