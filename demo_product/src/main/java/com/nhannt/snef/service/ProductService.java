package com.nhannt.snef.service;

import com.nhannt.snef.model.Product;
import com.nhannt.snef.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class ProductService {

    @Autowired
    ProductDAO proDao = new ProductDAO();

    @RequestMapping(method = RequestMethod.GET, path = "/GetProduct", produces = "application/json")
    public List<Product> getAllPro() throws SQLException, ClassNotFoundException {

        List<Product> getList = proDao.loadAllProduct();
        System.out.println(getList.size());
        return getList;
    }

}
