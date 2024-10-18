package com.springboot.rupalpaulgspr.introduction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker  {
    private FrostingInterface frosting;
    private SyrupInterface syrup;

    public CakeBaker(FrostingInterface frosting,SyrupInterface syrup){
        this.frosting=frosting;
        this.syrup=syrup;
    }
    public void bakeCake(){
        System.out.println("Baking cake with "+frosting.getFrostingtype()+" and "+syrup.getSyrupType());
    }
}
