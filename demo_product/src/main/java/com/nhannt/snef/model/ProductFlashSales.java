package com.nhannt.snef.model;

import javax.persistence.*;

@Entity
@Table(name = "productflashsales")
public class ProductFlashSales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productflashsalesid")
    private int productflashsalesid;

    @Column(name = "discount")
    private int discount;

    @Column(name = "startdate")
    private String startdate;

    @Column(name = "enddate")
    private String enddate;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "productitemid")
    private int productitemid;

    @Column(name = "accountid")
    private int accountid;

    public ProductFlashSales() {
    }

    public ProductFlashSales(int discount, String startdate, String enddate, int quantity, int productitemid, int accountid) {
        this.discount = discount;
        this.startdate = startdate;
        this.enddate = enddate;
        this.quantity = quantity;
        this.productitemid = productitemid;
        this.accountid = accountid;
    }

    public int getProductflashsalesid() {
        return productflashsalesid;
    }

    public void setProductflashsalesid(int productflashsalesid) {
        this.productflashsalesid = productflashsalesid;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductitemid() {
        return productitemid;
    }

    public void setProductitemid(int productitemid) {
        this.productitemid = productitemid;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }
}
