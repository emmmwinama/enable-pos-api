package com.enable.pos.repositories;

import com.enable.pos.models.PriceHistory;
import org.springframework.data.repository.CrudRepository;

public interface PriceHistoryRepository extends CrudRepository<PriceHistory, Long> {
}
