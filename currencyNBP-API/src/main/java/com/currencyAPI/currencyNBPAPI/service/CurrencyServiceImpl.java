package com.currencyAPI.currencyNBPAPI.service;

import com.currencyAPI.currencyNBPAPI.dto.GoldDto;
import com.currencyAPI.currencyNBPAPI.dto.USD_PLN_Dto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class CurrencyServiceImpl implements CurrencyService{

    private final RestTemplate restTemplate;

    private final String NBP_API = "http://api.nbp.pl/api/";

    public CurrencyServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<GoldDto> getGoldData() {
        ResponseEntity<List<GoldDto>> dataResponse = restTemplate.exchange(NBP_API + "cenyzlota",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<GoldDto>>() {
                });

        List<GoldDto> goldResponse = dataResponse.getBody();


        if (dataResponse.getStatusCode() == HttpStatus.OK) {
            log.info(String.valueOf(goldResponse));
            return dataResponse.getBody();
        } else {
            throw new RuntimeException("Failed to fetch data");
        }

    }

    @Override
    public USD_PLN_Dto getUSDPLNExchangeData() {
        ResponseEntity<USD_PLN_Dto> dataResponse = restTemplate.exchange(NBP_API + "exchangerates/rates/a/usd",
                HttpMethod.GET, null, new ParameterizedTypeReference<USD_PLN_Dto>() {
                });

        USD_PLN_Dto exchangeResponseUSDPLN = dataResponse.getBody();

        if (dataResponse.getStatusCode() == HttpStatus.OK) {
            log.info(String.valueOf(exchangeResponseUSDPLN));
            return dataResponse.getBody();
        } else {
            throw new RuntimeException("Failed to fetch data");
        }
    }
}
