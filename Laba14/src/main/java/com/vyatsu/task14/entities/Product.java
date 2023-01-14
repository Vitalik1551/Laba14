package com.vyatsu.task14.entities;

public class Product {
    private Long id;
    private String title;
    private int price;
    private int idcount=3;
    private int idcount2=4;
    private int flg=0;


    public long getIdcount(){
            idcount++;
        return idcount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(Long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
}
