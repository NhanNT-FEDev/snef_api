package com.nhannt.snef.service;

import com.nhannt.snef.model.ProductFlashSales;
import com.nhannt.snef.repository.ProductFlashSalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductFlashSalesService {

    @Autowired
    ProductFlashSalesRepository repository;



    @RequestMapping(method = RequestMethod.GET, value = "/sales")
    public List<ProductFlashSales> getAllFlashSales(){

//        return repository.findAll();
        return repository.findAll();
    }


}
