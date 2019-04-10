package edu.wctc.simple.Model;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements ProductsDao {

    final String DB_URL = "jdbc:derby:ShopDB";

    public List<Products> getAllProducts() {
        List<Products> item;

        item = ShopDBAction.outputProducts(DB_URL);

        return item;
    }
    public Products getSingleProducts(int itemNum) {
        Products item=null;



        return item;
    }

    @Override
    public void addToCart(Products products) {
            ShopDBAction.addToCart(DB_URL, products.getpID());
    }

    @Override
    public List<Products> getCart() {
        return null;
    }
}

