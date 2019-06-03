package com.nhannt.snef.repository;

import com.nhannt.snef.model.ProductFlashSales;
import org.springframework.data.jpa.repository.JpaRepository;




public interface ProductFlashSalesRepository extends JpaRepository<ProductFlashSales, Integer> {

//    @Query("SELECT p.productflashsalesid, p.discount, p.startdate, p.enddate, p.quantity, p.productitemid, p.accountid FROM dbo.productflashsales p")
//    List<ProductFlashSales> loadAllProductSales();
}
