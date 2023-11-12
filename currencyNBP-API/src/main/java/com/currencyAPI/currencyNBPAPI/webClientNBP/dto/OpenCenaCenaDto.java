package com.currencyAPI.currencyNBPAPI.webClientNBP.dto;

import lombok.Getter;
import lombok.ToString;

@Getter

public class OpenCenaCenaDto {

     private float cena;

     @Override
     public String toString() {
          return "OpenCenaCenaDto{" +
                  "cena= " + cena +  " PLN/g" +
                  '}';
     }
}
