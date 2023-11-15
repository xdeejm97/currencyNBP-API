package com.currencyAPI.currencyNBPAPI.webClientNBP.currency;

import com.currencyAPI.currencyNBPAPI.webClientNBP.dto.OpenGoldGoldDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Slf4j
public class CurrencyClient {

    private RestTemplate restTemplate = new RestTemplate();

    private final String NBP_API = "http://api.nbp.pl/api/";


//    public void getGoldPrice() { // poczytać o response entity i czy da sie zrobić Mapę
//        ResponseEntity<List<OpenCenaCenaDto>> priceResponse = restTemplate.exchange(NBP_API + "cenyzlota",
//                HttpMethod.GET, null, new ParameterizedTypeReference<List<OpenCenaCenaDto>>() {
//                });
//        List<OpenCenaCenaDto> rates = priceResponse.getBody();
//        rates.forEach(System.out::println);
//
//        ResponseEntity<List<OpenDataDataDto>> dataResponse = restTemplate.exchange(NBP_API + "cenyzlota",
//                HttpMethod.GET, null, new ParameterizedTypeReference<List<OpenDataDataDto>>() {
//                });
//        List<OpenDataDataDto> date = dataResponse.getBody();
//        date.forEach(System.out::println);
//    }

    public ResponseEntity<List<OpenGoldGoldDto>> getGoldDate() {
        ResponseEntity<List<OpenGoldGoldDto>> dataResponse = restTemplate.exchange(NBP_API + "cenyzlota",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<OpenGoldGoldDto>>() {
                });
        List<OpenGoldGoldDto> dateList = dataResponse.getBody();

        if (dateList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            log.info(String.valueOf(dateList));
            return new ResponseEntity<>(dateList, HttpStatus.OK);
        }

    }

    public void getUSDPrice() {

//        ResponseEntity <> currencyUSDResponse = restTemplate.exchange();

    }

    /**
     * dodać inne waluty
     * dodać zwracanego json
     *
     * */


}
