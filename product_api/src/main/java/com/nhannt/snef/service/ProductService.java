package com.nhannt.snef.service;

import com.nhannt.snef.model.Product;
import com.nhannt.snef.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductService {

    @Autowired
    ProductRepository productService;

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public List<Product> loadAll(){
        return  productService.findAll();
    }
}
