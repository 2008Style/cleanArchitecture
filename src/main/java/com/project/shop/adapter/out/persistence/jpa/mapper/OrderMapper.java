package com.project.shop.adapter.out.persistence.jpa.mapper;

import com.project.shop.domain.Order;

public class OrderMapper {

    public static Order entityToDomain(final com.project.shop.adapter.out.persistence.jpa.entity.Order order) {
        final Order orderDom = new Order();
        orderDom.setId(order.getId());
        orderDom.setUuid(order.getUuid());
        orderDom.setIdentifier(order.getIdentifier());
        return orderDom;
    }

    public static com.project.shop.adapter.out.persistence.jpa.entity.Order domainToEntity(final Order orderDom) {
        final com.project.shop.adapter.out.persistence.jpa.entity.Order order = new com.project.shop.adapter.out.persistence.jpa.entity.Order();
        order.setId(orderDom.getId());
        order.setUuid(orderDom.getUuid());
        order.setIdentifier(orderDom.getIdentifier());
        return order;
    }
}
