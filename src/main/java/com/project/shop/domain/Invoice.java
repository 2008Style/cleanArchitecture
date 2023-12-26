package com.project.shop.domain;

public class Invoice {

    private Long id;

    private String uuid;

    private String identifier;


    public Invoice() {
    }

    public Invoice(Long id, String uuid, String identifier) {
        this.id = id;
        this.uuid = uuid;
        this.identifier = identifier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
