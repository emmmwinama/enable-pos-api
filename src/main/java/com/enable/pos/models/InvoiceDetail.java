package com.enable.pos.models;

import javax.persistence.Entity;

@Entity
public class InvoiceDetail extends AbstractEntity{
    private Long invoice_id;
    private Long product_id;
    private int quantity;
    private Float line_total;
    private boolean isTaxable;
    private String created;
    private String updated;

    public Long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Long invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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
