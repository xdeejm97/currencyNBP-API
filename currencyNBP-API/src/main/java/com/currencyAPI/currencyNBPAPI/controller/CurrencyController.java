package com.currencyAPI.currencyNBPAPI.controller;

import com.currencyAPI.currencyNBPAPI.dto.GoldDto;
import com.currencyAPI.currencyNBPAPI.dto.USD_PLN_Dto;
import com.currencyAPI.currencyNBPAPI.service.CurrencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/cenyzlota")
    public ResponseEntity<List<GoldDto>> getGoldData() {
        List<GoldDto> response = currencyService.getGoldData();
        return ResponseEntity.ok(response);

    }

    @GetMapping("/exchange/usd")
    public ResponseEntity<USD_PLN_Dto> getCurrencyPriceUSDPLN() {

        USD_PLN_Dto response = currencyService.getUSDPLNExchangeData();
        return ResponseEntity.ok(response);

    }

}
