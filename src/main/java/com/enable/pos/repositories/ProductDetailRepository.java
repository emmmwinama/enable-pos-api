package com.enable.pos.repositories;

import com.enable.pos.models.ProductDetail;
import org.springframework.data.repository.CrudRepository;

public interface ProductDetailRepository extends CrudRepository<ProductDetail, Long> {
}
