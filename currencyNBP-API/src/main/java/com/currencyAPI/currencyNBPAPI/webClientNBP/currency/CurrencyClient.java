package com.currencyAPI.currencyNBPAPI.webClientNBP.currency;

import com.currencyAPI.currencyNBPAPI.model.GoldDto;
import com.currencyAPI.currencyNBPAPI.webClientNBP.dto.OpenCenaCenaDto;
import com.currencyAPI.currencyNBPAPI.webClientNBP.dto.OpenGoldGoldDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;

@Component
public class CurrencyClient {

    private RestTemplate restTemplate = new RestTemplate();

    private final String NBP_API = "http://api.nbp.pl/api/";


    public void getGoldPrice(){
        ResponseEntity<List<OpenCenaCenaDto>> cenaResponse = restTemplate.exchange(NBP_API + "cenyzlota",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<OpenCenaCenaDto>>() {
                });
        List<OpenCenaCenaDto> rates = cenaResponse.getBody();
        rates.forEach(System.out::println);

    }

}
