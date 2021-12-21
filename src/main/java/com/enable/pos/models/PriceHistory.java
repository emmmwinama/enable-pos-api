package com.enable.pos.models;

import javax.persistence.Entity;

@Entity
public class PriceHistory extends AbstractEntity{
    private Long product_id;
    private String price_date;
    private Float price_bought;
    private Float price_sold;
    private String created;
    private String updated;

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getPrice_date() {
        return price_date;
    }

    public void setPrice_date(String price_date) {
        this.price_date = price_date;
    }

    public Float getPrice_bought() {
        return price_bought;
    }

    public void setPrice_bought(Float price_bought) {
        this.price_bought = price_bought;
    }

    public Float getPrice_sold() {
        return price_sold;
    }

    public void setPrice_sold(Float price_sold) {
        this.price_sold = price_sold;
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
