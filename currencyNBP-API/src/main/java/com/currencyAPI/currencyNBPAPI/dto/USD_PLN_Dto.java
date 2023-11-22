package com.currencyAPI.currencyNBPAPI.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class USD_PLN_Dto {


    private String currency;
    private String code;
    private List rates;


}
