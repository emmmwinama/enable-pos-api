package com.enable.pos.models;

import javax.persistence.Entity;

@Entity
public class PurchaseOrderDetail extends AbstractEntity{
    private Long purchase_order_id;
    private Long product_id;
    private Float quantity;
    private Float line_total;
    private boolean isTaxable;
    private String created;
    private String updated;

    public Long getPurchase_order_id() {
        return purchase_order_id;
    }

    public void setPurchase_order_id(Long purchase_order_id) {
        this.purchase_order_id = purchase_order_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getLine_total() {
        return line_total;
    }

    public void setLine_total(Float line_total) {
        this.line_total = line_total;
    }

    public boolean isTaxable() {
        return isTaxable;
    }

    public void setTaxable(boolean taxable) {
        isTaxable = taxable;
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
