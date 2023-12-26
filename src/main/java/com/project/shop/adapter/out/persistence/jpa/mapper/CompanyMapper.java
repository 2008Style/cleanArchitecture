package com.project.shop.adapter.out.persistence.jpa.mapper;

import com.project.shop.domain.Company;

public class CompanyMapper {

    public static Company entityToDomain(final com.project.shop.adapter.out.persistence.jpa.entity.Company company){
        final Company companyDom = new Company();
        companyDom.setId(company.getId());
        companyDom.setUuid(company.getUuid());
        companyDom.setName(company.getName());
        return companyDom;
    }

    public static com.project.shop.adapter.out.persistence.jpa.entity.Company domainToEntity(final Company companyDom){
        final com.project.shop.adapter.out.persistence.jpa.entity.Company company = new com.project.shop.adapter.out.persistence.jpa.entity.Company();
        company.setId(companyDom.getId());
        company.setUuid(companyDom.getUuid());
        company.setName(companyDom.getName());
        return company;
    }
}
