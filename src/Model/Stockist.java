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
public class Stockist {
    private String pan_number;
    private String name;
    private String organizations_name;
    private String phone_number;
    private String address;
    private float discount_rate;
    private int credit_limit;

    

    public String getPan_number() {
        return pan_number;
    }

    public void setPan_number(String pan_number) {
        this.pan_number = pan_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizations_name() {
        return organizations_name;
    }

    public void setOrganizations_name(String organizations_name) {
        this.organizations_name = organizations_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getDiscount_rate() {
        return discount_rate;
    }

    public void setDiscount_rate(float discount_rate) {
        this.discount_rate = discount_rate;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(int credit_limit) {
        this.credit_limit = credit_limit;
    }
    
    
    
    
}
