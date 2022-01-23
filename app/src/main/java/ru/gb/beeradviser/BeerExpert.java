package ru.gb.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if(color.equals("dark")){
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        } else if(color.equals("Light")) {
            brands.add("Жигули");
            brands.add("Балтика");
        }else{
            brands.add("Gueness");
            brands.add("Балтика тёмное");
        }
        return brands;
    }
}
