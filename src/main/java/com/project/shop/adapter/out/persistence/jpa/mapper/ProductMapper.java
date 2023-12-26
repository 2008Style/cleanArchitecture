package com.project.shop.adapter.out.persistence.jpa.mapper;

import com.project.shop.domain.Product;

public class ProductMapper {

    public static Product entityToDomain(final com.project.shop.adapter.out.persistence.jpa.entity.Product product){
        final Product productDom = new Product();
        productDom.setId(product.getId());
        productDom.setUuid(product.getUuid());
        productDom.setName(product.getName());
        productDom.setDescription(product.getDescription());
        productDom.setPrice(product.getPrice());
        productDom.setRating(product.getRating());
        return productDom;
    }

    public static com.project.shop.adapter.out.persistence.jpa.entity.Product domainToEntity(final Product productDom){
        final com.project.shop.adapter.out.persistence.jpa.entity.Product product = new com.project.shop.adapter.out.persistence.jpa.entity.Product();
        product.setId(productDom.getId());
        product.setUuid(productDom.getUuid());
        product.setName(productDom.getName());
        product.setDescription(productDom.getDescription());
        product.setPrice(productDom.getPrice());
        product.setRating(productDom.getRating());
        return product;
    }
}
