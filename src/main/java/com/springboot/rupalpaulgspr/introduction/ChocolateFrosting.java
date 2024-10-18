package com.springboot.rupalpaulgspr.introduction;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.name",havingValue = "chocolate")
public class ChocolateFrosting implements FrostingInterface{
    public String getFrostingtype(){
        return "Chocolate Frosting";
    }
}
