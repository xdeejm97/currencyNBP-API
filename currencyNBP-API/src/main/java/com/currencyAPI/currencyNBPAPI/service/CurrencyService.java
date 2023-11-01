package com.currencyAPI.currencyNBPAPI.service;

import com.currencyAPI.currencyNBPAPI.model.GoldDto;
import com.currencyAPI.currencyNBPAPI.webClientNBP.currency.CurrencyClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CurrencyService {

    private final CurrencyClient currencyClient;



    public GoldDto getCurrency() {
        return currencyClient.getGoldPrice("cenyzlota");
    }
}
