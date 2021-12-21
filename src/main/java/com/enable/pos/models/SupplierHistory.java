package com.enable.pos.models;

import javax.persistence.Entity;

@Entity
public class SupplierHistory extends AbstractEntity{
    private Long supplier_id;
    private String payment_date;
    private Long purchase_order_id;
    private Float payment_amount;
    private String balance_due;
    private boolean paidInFull;
    private String created;
    private String updated;

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public Long getPurchase_order_id() {
        return purchase_order_id;
    }

    public void setPurchase_order_id(Long purchase_order_id) {
        this.purchase_order_id = purchase_order_id;
    }

    public Float getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(Float payment_amount) {
        this.payment_amount = payment_amount;
    }

    public String getBalance_due() {
        return balance_due;
    }

    public void setBalance_due(String balance_due) {
        this.balance_due = balance_due;
    }

    public boolean isPaidInFull() {
        return paidInFull;
    }

    public void setPaidInFull(boolean paidInFull) {
        this.paidInFull = paidInFull;
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
