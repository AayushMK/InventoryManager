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
public class Salesman {
    private int sn;
    private String organization_name;
    private String address;
    private String discount_rate;
    private String credit_limit;
    private String phone_number;
    
    private String pan_number;
    public Salesman(int sn, String organization_name, String address, String discount_rate, String credit_limit, String phone_number, String pan_number) {
        this.sn = sn;
        this.organization_name = organization_name;
        this.address = address;
        this.discount_rate = discount_rate;
        this.credit_limit = credit_limit;
        this.phone_number = phone_number;
        this.pan_number = pan_number;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public String getPan_number() {
        return pan_number;
    }

    public void setPan_number(String pan_number) {
        this.pan_number = pan_number;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDiscount_rate() {
        return discount_rate;
    }

    public void setDiscount_rate(String discount_rate) {
        this.discount_rate = discount_rate;
    }

    public String getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(String credit_limit) {
        this.credit_limit = credit_limit;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
}
