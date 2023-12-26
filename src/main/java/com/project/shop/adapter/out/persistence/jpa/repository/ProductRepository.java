package com.project.shop.adapter.out.persistence.jpa.repository;

import com.project.shop.adapter.out.persistence.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
