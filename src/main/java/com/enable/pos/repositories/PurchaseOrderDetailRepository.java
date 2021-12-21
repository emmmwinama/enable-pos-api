package com.enable.pos.repositories;

import com.enable.pos.models.PurchaseOrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderDetailRepository extends CrudRepository<PurchaseOrderDetail, Long> {

}
