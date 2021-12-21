package com.enable.pos.repositories;

import com.enable.pos.models.CustomerHistory;
import org.springframework.data.repository.CrudRepository;

public interface CustomerHistoryRepository extends CrudRepository<CustomerHistory, Long> {
}
