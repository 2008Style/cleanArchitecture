package com.project.shop.domain;

public class Product {

    private String uuid;

    private String name;

    private String description;

    private Double price;

    private Double rating;

//    private Image mainImage;
//
//    private Set<Image> images;

//    private String brand;
//
//    private String model;
//
//    private Map<String, String> specifications;

    // TODO add more attributes


    public Product() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
