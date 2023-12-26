package com.project.shop.adapter.out.persistence.jpa.repository;

import com.project.shop.adapter.out.persistence.jpa.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
