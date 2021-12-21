package com.enable.pos.repositories;

import com.enable.pos.models.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
}
