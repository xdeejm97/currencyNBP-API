package com.currencyAPI.currencyNBPAPI.service;

import com.currencyAPI.currencyNBPAPI.model.GoldDto;
import com.currencyAPI.currencyNBPAPI.webClientNBP.currency.CurrencyClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CurrencyService {

    private final CurrencyClient currencyClient;
    public void getCurrency() {
        currencyClient.getGoldPrice();
    }
}
