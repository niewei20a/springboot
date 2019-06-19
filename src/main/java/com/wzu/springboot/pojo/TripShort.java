package com.wzu.springboot.pojo;

public class TripShort {
    private int id;
    private String title;
    private String stitle;
    private String city;
    private float price;
    private String picture;

    public TripShort() {
    }

    public TripShort(int id, String title,String stitle, String city, float price, String picture) {
        this.id = id;
        this.title = title;
        this.stitle = stitle;
        this.city = city;
        this.price = price;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "TripShort{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", stitle='" + stitle + '\'' +
                ", city='" + city + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                '}';
    }

    public String getStitle() {
        return stitle;
    }

    public void setStitle(String stitle) {
        this.stitle = stitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
