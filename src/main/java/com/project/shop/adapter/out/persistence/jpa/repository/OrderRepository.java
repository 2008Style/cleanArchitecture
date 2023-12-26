package com.project.shop.adapter.out.persistence.jpa.repository;

import com.project.shop.adapter.out.persistence.jpa.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
