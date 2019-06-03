package com.nhannt.snef.repository;

import com.nhannt.snef.model.ProductFlashSales;
import org.springframework.data.jpa.repository.*;

import org.springframework.stereotype.Repository;


import java.util.*;

@Repository
public interface ProductFlashSalesRepository extends JpaRepository<ProductFlashSales, Integer>{

//    @Query("SELECT p FROM dbo.productitem p")
//    List<ProductFlashSales> findAllFlashSales();
}
