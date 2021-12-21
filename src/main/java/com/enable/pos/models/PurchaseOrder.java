package com.enable.pos.models;

import javax.persistence.Entity;

@Entity
public class PurchaseOrder extends AbstractEntity{
    private String order_date;
    private Long supplier_id;
    private Float order_total;
    private Float tax_rate;
    private Float tax_amount;
    private Float grand_total;
    private boolean isPaid;
    private String created;
    private String updated;

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Float getOrder_total() {
        return order_total;
    }

    public void setOrder_total(Float order_total) {
        this.order_total = order_total;
    }

    public Float getTax_rate() {
        return tax_rate;
    }

    public void setTax_rate(Float tax_rate) {
        this.tax_rate = tax_rate;
    }

    public Float getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(Float tax_amount) {
        this.tax_amount = tax_amount;
    }

    public Float getGrand_total() {
        return grand_total;
    }

    public void setGrand_total(Float grand_total) {
        this.grand_total = grand_total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
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
