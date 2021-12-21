package com.enable.pos.repositories;

import com.enable.pos.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
