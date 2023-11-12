package com.currencyAPI.currencyNBPAPI.webClientNBP.dto;

import lombok.Getter;
import lombok.ToString;

@Getter

public class OpenDataDataDto {
    private String data;


    @Override
    public String toString() {
        return "OpenDataDataDto{" +
                "data= '" + data + '\'' +
                '}';
    }
}
