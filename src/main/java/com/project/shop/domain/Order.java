package com.project.shop.domain;

public class Order {

    private String uuid;

    private String identifier;


    public Order() {
    }

    public Order(String uuid, String identifier) {
        this.uuid = uuid;
        this.identifier = identifier;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
