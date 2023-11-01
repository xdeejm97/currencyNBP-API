package com.currencyAPI.currencyNBPAPI.webClientNBP.currency;

import com.currencyAPI.currencyNBPAPI.model.GoldDto;
import com.currencyAPI.currencyNBPAPI.webClientNBP.dto.OpenGoldGoldDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CurrencyClient {

    private RestTemplate restTemplate = new RestTemplate();

    private final String NBP_API = "http://api.nbp.pl/api/";


    public GoldDto getGoldPrice(String goldPrice){
        OpenGoldGoldDto openGoldGoldDto = restTemplate.getForObject(NBP_API + goldPrice, OpenGoldGoldDto.class);

        return GoldDto.builder()
//                .date(openGoldGoldDto.getData())
                .price(openGoldGoldDto.getCena())
                .build();
    }

}
