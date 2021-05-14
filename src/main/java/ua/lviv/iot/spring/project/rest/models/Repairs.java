package ua.lviv.iot.spring.project.rest.models;

public class Repairs {
    private String brand;
    private Integer price;
    private String originCountryType;
    private String categoryType;
    private String producer;
    private int id;

    public Repairs(){

    }


    public Repairs(String brand, Integer price, String originCountryType, String categoryType, String producer) {
        this.brand = brand;
        this.price = price;
        this.originCountryType = originCountryType;
        this.categoryType = categoryType;
        this.producer = producer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getOriginCountryType() {
        return originCountryType;
    }

    public void setOriginCountryType(String originCountryType) {
        this.originCountryType = originCountryType;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
