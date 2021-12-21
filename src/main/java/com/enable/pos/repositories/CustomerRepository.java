package com.enable.pos.repositories;

import com.enable.pos.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
