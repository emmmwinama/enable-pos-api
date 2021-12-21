package com.enable.pos.repositories;

import com.enable.pos.models.InvoiceDetail;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDetailRepository extends CrudRepository<InvoiceDetail, Long> {
}
