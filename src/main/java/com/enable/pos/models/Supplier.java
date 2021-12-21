package com.enable.pos.models;

import javax.persistence.Entity;

@Entity
public class Supplier extends AbstractEntity{
    private String supplier_name;
    private String supplier_since;
    private String address_1;
    private String address_2;
    private String district;
    private String phone;
    private String email;
    private String website;
    private String created;
    private String updated;

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getSupplier_since() {
        return supplier_since;
    }

    public void setSupplier_since(String supplier_since) {
        this.supplier_since = supplier_since;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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
