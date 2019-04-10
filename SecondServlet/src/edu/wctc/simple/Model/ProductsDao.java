package edu.wctc.simple.Model;

import java.util.List;

public interface ProductsDao {
    public List<Products> getAllProducts();
    public Products getSingleProducts (int ProductID);
    public void addToCart(Products products);
    public List<Products> getCart();
}
