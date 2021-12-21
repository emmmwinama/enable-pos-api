package com.enable.pos.models;

import javax.persistence.Entity;

@Entity
public class CustomerHistory extends AbstractEntity{
    private Long customer_id;
    private Long invoice_id;
    private Float balance;
    private String created;
    private String updated;

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Long invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
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
