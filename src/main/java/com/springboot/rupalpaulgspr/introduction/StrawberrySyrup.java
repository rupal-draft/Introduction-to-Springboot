package com.springboot.rupalpaulgspr.introduction;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.name",havingValue = "strawberry")

public class StrawberrySyrup implements SyrupInterface{
    public String getSyrupType(){
        return "Strawberry Syrup";
    }
}
