package edu.wctc.simple.Model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static List<Products> stuff = new ArrayList<>();
    private int id = 1;
    public Inventory() {

        stuff.add(new Products(id++,"ShoeExtreme", "The Extreme shoe for Extreme People", 3.43));
        stuff.add(new Products(id++,"Thing Shirt", "The shirt with a thing on it.", 335.34));
        stuff.add(new Products(id++,"Super Tee", "The last Tee You will ever need", 1.11));
        stuff.add(new Products(id++,"Best Wife Beater", "Be the worst beater u can be in this best wife beater", 99.99));
    }

    public static List<Products> getProducts(){
        return stuff;
    }

    public List<Products> getAllProducts() {
        List<Products> item = new ArrayList<>();

        for(Products i: stuff) {
            item.add(i);
        }
        return item;
    }
    public Products getSingleProducts(int itemNum) {
        Products item=null;

        for(Products i: stuff) {
            if (i.getpID() == itemNum) {
                return i;
            }
        }
        return item;
    }
}

