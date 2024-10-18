package com.springboot.rupalpaulgspr.introduction;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.name",havingValue = "chocolate")

public class ChocolateSyrup implements SyrupInterface{
    public String getSyrupType(){
        return "Chocolate Syrup";
    }
}
