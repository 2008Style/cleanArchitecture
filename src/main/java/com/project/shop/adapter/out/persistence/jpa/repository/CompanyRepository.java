package com.project.shop.adapter.out.persistence.jpa.repository;

import com.project.shop.adapter.out.persistence.jpa.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
