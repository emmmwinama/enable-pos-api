package com.enable.pos.repositories;

import com.enable.pos.models.PurchaseOrder;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Long> {
}
