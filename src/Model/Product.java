/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author light
 */
public class Product {
    private int product_id;
    private String batch_number;
    private String product_name;
    private float price_rate;
    private String expiry_date;

    public int getProduct_id() {
        return product_id;
    }

    public String getBatch_number() {
        return batch_number;
    }

    public String getProduct_name() {
        return product_name;
    }

    public float getPrice_rate() {
        return price_rate;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setBatch_number(String batch_number) {
        this.batch_number = batch_number;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setPrice_rate(float price_rate) {
        this.price_rate = price_rate;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }
    
    
    
}
