package com.enable.pos.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Product extends AbstractEntity {
    private Long supplier_id;

    private String brand_name;
    private String model_number;
    private String description;
    private boolean isTaxable;
    private boolean isActive;
    private String created;
    private String updated;



    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getModel_number() {
        return model_number;
    }

    public void setModel_number(String model_number) {
        this.model_number = model_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTaxable() {
        return isTaxable;
    }

    public void setTaxable(boolean taxable) {
        isTaxable = taxable;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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
