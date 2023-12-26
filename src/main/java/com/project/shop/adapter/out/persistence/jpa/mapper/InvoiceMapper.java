package com.project.shop.adapter.out.persistence.jpa.mapper;

import com.project.shop.domain.Invoice;

public class InvoiceMapper {

    public static Invoice entityToDomain(final com.project.shop.adapter.out.persistence.jpa.entity.Invoice invoice) {
        final Invoice invoiceDom = new Invoice();
        invoiceDom.setId(invoice.getId());
        invoiceDom.setUuid(invoice.getUuid());
        invoiceDom.setIdentifier(invoice.getIdentifier());
        return invoiceDom;
    }

    public static com.project.shop.adapter.out.persistence.jpa.entity.Invoice domainToEntity(final Invoice invoiceDom) {
        final com.project.shop.adapter.out.persistence.jpa.entity.Invoice invoice = new com.project.shop.adapter.out.persistence.jpa.entity.Invoice();
        invoice.setId(invoiceDom.getId());
        invoice.setUuid(invoiceDom.getUuid());
        invoice.setIdentifier(invoiceDom.getIdentifier());
        return invoice;
    }
}
