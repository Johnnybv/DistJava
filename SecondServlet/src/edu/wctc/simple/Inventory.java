package edu.wctc.simple;

import java.util.List;

public class Inventory {
    private static List<Products> stuff;
    private Inventory() {
        stuff.add(new Products("ShoeExtreme", "The Extreme shoe for Extreme People", 3.43));
        stuff.add(new Products("Thing Shirt", "The shirt with a thing on it.", 335.34));
        stuff.add(new Products("Super Tee", "The last Tee You will ever need", 1.11));
        stuff.add(new Products("Best Wife Beater", "Be the worst beater u can be in this best wife beater", 99.99));
    }

    public static List<Products> getProducts(){
        return stuff;
    }
}

