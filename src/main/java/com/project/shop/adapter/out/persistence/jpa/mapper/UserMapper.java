package com.project.shop.adapter.out.persistence.jpa.mapper;

import com.project.shop.domain.User;

public class UserMapper {

    public static User entityToDomain(final com.project.shop.adapter.out.persistence.jpa.entity.User user) {
        final User userDom = new User();
        userDom.setId(user.getId());
        userDom.setUuid(user.getUuid());
        userDom.setName(user.getName());
        return userDom;
    }

    public static com.project.shop.adapter.out.persistence.jpa.entity.User domainToEntity(final User userDom) {
        final com.project.shop.adapter.out.persistence.jpa.entity.User user = new com.project.shop.adapter.out.persistence.jpa.entity.User();
        user.setId(userDom.getId());
        user.setUuid(userDom.getUuid());
        user.setName(userDom.getName());
        return user;
    }
}
