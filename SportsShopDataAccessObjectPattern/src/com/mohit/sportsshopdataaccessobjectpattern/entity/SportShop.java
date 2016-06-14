/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.sportsshopdataaccessobjectpattern.entity;

/**
 *
 * @author Mohit
 */
public class SportShop {
    int id, numberOfProduct;
    String productName, price;
    boolean status;

    public SportShop() {
    }

    public SportShop(int id, int numberOfProduct, String productName, String price, boolean status) {
        this.id = id;
        this.numberOfProduct = numberOfProduct;
        this.productName = productName;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
