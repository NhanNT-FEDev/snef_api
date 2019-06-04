package com.nhannt.snef.service;

import com.nhannt.snef.model.ProductFlashSales;
import com.nhannt.snef.repository.ProductFlashSalesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class ProductFlashSalesService {

    @Autowired
    ProductFlashSalesDAO faSalesDAO = new ProductFlashSalesDAO();

    @RequestMapping(method = RequestMethod.GET, path = "/fs", produces = "application/json")
    public List<ProductFlashSales> getAllFS() throws SQLException, ClassNotFoundException{
        List<ProductFlashSales> rs = faSalesDAO.loadAllFS();
        System.out.println(rs.size());
        return rs;
    }


}
