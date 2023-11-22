package com.currencyAPI.currencyNBPAPI.service;

import com.currencyAPI.currencyNBPAPI.dto.GoldDto;
import com.currencyAPI.currencyNBPAPI.dto.USD_PLN_Dto;

import java.util.List;

public interface CurrencyService {


    List<GoldDto> getGoldData();
    USD_PLN_Dto getUSDPLNExchangeData();

}
