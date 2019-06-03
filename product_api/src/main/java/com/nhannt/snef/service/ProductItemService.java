package com.nhannt.snef.service;

import com.nhannt.snef.model.ProductItem;
import com.nhannt.snef.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductItemService {

    @Autowired
    ProductItemRepository repository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<ProductItem> getAll(){
        return  repository.findAll();
    }


}
