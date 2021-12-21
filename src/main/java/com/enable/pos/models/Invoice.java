package com.enable.pos.models;

import javax.persistence.Entity;

@Entity
public class Invoice extends AbstractEntity{
    private String date;
    private Long customer_id;
    private Float invoice_total;
    private Float sales_tax_rate;
    private Float sales_tax_amount;
    private Float grand_total;
    private boolean isPaid;
    private String created;
    private String updated;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Float getInvoice_total() {
        return invoice_total;
    }

    public void setInvoice_total(Float invoice_total) {
        this.invoice_total = invoice_total;
    }

    public Float getSales_tax_rate() {
        return sales_tax_rate;
    }

    public void setSales_tax_rate(Float sales_tax_rate) {
        this.sales_tax_rate = sales_tax_rate;
    }

    public Float getSales_tax_amount() {
        return sales_tax_amount;
    }

    public void setSales_tax_amount(Float sales_tax_amount) {
        this.sales_tax_amount = sales_tax_amount;
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
