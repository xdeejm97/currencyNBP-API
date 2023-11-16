package com.currencyAPI.currencyNBPAPI.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class OpenGoldGoldDto {

    private String data;
    private float cena;


    @Override
    public String toString() {
        return "OpenGoldGoldDto{" +
                "data='" + data + '\'' +
                ", cena złota=" + cena +
                '}';
    }
}
