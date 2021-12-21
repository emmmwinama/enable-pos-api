package com.enable.pos.repositories;

import com.enable.pos.models.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<Supplier, Long> {
}
