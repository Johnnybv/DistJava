package edu.wctc.simple.Model;

public class Products {
    private String pName, disc;
    private double price;
    private int pID;
    public Products(int id, String pName, String disc, double price){
        this.pID = id;
        this.pName = pName;
        this.disc = disc;
        this.price = price;
    }

    public int getpID(){
        return pID;
    }

    public void setpID(int id){
        this.pID = id;
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
