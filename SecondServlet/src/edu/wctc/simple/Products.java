package edu.wctc.simple;

public class Products {
    private String pName, disc;
    private double price;
    public Products(String pName, String disc, double price){
        this.pName = pName;
        this.disc = disc;
        this.price = price;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
