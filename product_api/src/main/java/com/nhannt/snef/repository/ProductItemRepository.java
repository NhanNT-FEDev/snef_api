package com.nhannt.snef.repository;

import com.nhannt.snef.model.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Integer> {

//    @Query("select * from ")
//    List<ProductItem> findAll();
}
