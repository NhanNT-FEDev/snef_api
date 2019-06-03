package com.nhannt.snef.model;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "product_item")
public class ProductItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productitemid")
    private int productitemid;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private float price;

    @Column(name = "productitemname")
    private String productitemname;

    @Column(name = "expireddate")
    private Timestamp expireddate;

    @Column(name = "accountid")
    private  int accountid;

    @Column(name = "productid")
    private int productid;

    public ProductItem() {
    }

    public ProductItem(int productitemid ,int quantity, float price, String productitemname, Timestamp expireddate, int accountid, int productid) {
        this.productitemid = productitemid;
        this.quantity = quantity;
        this.price = price;
        this.productitemname = productitemname;
        this.expireddate = expireddate;
        this.accountid = accountid;
        this.productid = productid;
    }

    public int getProductitemid() {
        return productitemid;
    }

    public void setProductitemid(int productitemid) {
        this.productitemid = productitemid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductitemname() {
        return productitemname;
    }

    public void setProductitemname(String productitemname) {
        this.productitemname = productitemname;
    }

    public Timestamp getExpireddate() {
        return expireddate;
    }

    public void setExpireddate(Timestamp expireddate) {
        this.expireddate = expireddate;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }
}
