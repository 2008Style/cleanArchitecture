package com.project.shop.domain;

public class Purchase {

    private String uuid;

    private String identifier;


    public Purchase() {
    }

    public Purchase(String uuid, String identifier) {
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
