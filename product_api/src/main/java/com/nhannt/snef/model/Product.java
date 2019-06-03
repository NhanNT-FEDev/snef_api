package com.nhannt.snef.model;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productid")
    private int productid;

    @Column(name = "productname")
    private String productname;

    @Column(name = "description")
    private String description;

    @Column(name = "picture")
    private String picture;

    @Column(name = "categoriesid")
    private int categoriesid;

    public Product(int productid, String productname, String description, String picture, int categoriesid) {
        this.productid = productid;
        this.productname = productname;
        this.description = description;
        this.picture = picture;
        this.categoriesid = categoriesid;
    }

    public Product() {
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getCategoriesid() {
        return categoriesid;
    }

    public void setCategoriesid(int categoriesid) {
        this.categoriesid = categoriesid;
    }
}
