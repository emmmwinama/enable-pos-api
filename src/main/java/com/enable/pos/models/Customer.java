package com.enable.pos.models;

import javax.persistence.Entity;

@Entity
public class Customer extends AbstractEntity{
    private String customer_name;
    private int is_company;
    private String customer_since;
    private String address_1;
    private String address_2;
    private String district;
    private String created;
    private String updated;

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getIs_company() {
        return is_company;
    }

    public void setIs_company(int is_company) {
        this.is_company = is_company;
    }

    public String getCustomer_since() {
        return customer_since;
    }

    public void setCustomer_since(String customer_since) {
        this.customer_since = customer_since;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
