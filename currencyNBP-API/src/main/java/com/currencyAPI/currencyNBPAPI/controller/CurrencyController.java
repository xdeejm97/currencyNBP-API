package com.currencyAPI.currencyNBPAPI.controller;

import com.currencyAPI.currencyNBPAPI.dto.OpenGoldGoldDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class CurrencyController {


    private RestTemplate restTemplate = new RestTemplate();

    private final String NBP_API = "http://api.nbp.pl/api/";

    @GetMapping("/cenyzlota") // czy zostawić tak z rest template czy bardziej w logike biznesowa
    public ResponseEntity<List<OpenGoldGoldDto>> getGoldData(){

        ResponseEntity<List<OpenGoldGoldDto>> dataResponse = restTemplate.exchange(NBP_API + "cenyzlota",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<OpenGoldGoldDto>>() {
                });

        List<OpenGoldGoldDto> goldResponse = dataResponse.getBody();


        if (goldResponse.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            log.info(String.valueOf(goldResponse));
            return new ResponseEntity<>(goldResponse, HttpStatus.OK);
        }


    }
    @GetMapping("/exchange/USD-PLN")
    public void getCurrencyPrice(){
    }

}
