package com.currencyAPI.currencyNBPAPI.webClientNBP.currency;

import com.currencyAPI.currencyNBPAPI.model.GoldDto;
import com.currencyAPI.currencyNBPAPI.webClientNBP.dto.OpenCenaCenaDto;
import com.currencyAPI.currencyNBPAPI.webClientNBP.dto.OpenDataDataDto;
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
import java.util.Map;

@Component
public class CurrencyClient {

    private RestTemplate restTemplate = new RestTemplate();

    private final String NBP_API = "http://api.nbp.pl/api/";


    public void getGoldPrice(){ // poczytać o response entity i czy da sie zrobić Mapę
        ResponseEntity<List<OpenCenaCenaDto>> priceResponse = restTemplate.exchange(NBP_API + "cenyzlota",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<OpenCenaCenaDto>>() {
                });
        List<OpenCenaCenaDto> rates = priceResponse.getBody();
        rates.forEach(System.out::println);

        ResponseEntity<List<OpenDataDataDto>> dataResponse = restTemplate.exchange(NBP_API + "cenyzlota",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<OpenDataDataDto>>() {
                });
        List<OpenDataDataDto> date = dataResponse.getBody();
        date.forEach(System.out::println);
    }
    public void getUSDPrice(){

//        ResponseEntity <> currencyUSDResponse = restTemplate.exchange();
        
    }

    /**
     * dodać inne waluty
     * dodać zwracanego json
     *
     * */



}
