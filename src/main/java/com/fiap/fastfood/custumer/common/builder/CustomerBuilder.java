package com.fiap.fastfood.custumer.common.builder;

import com.fiap.fastfood.custumer.common.dto.request.CreateCustomerRequest;
import com.fiap.fastfood.custumer.common.dto.response.CustomerResponse;
import com.fiap.fastfood.custumer.core.entity.Customer;
import com.fiap.fastfood.custumer.external.orm.CustomerORM;

public class CustomerBuilder {

    public static CustomerResponse fromDomainToResponse(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .createdAt(customer.getCreatedAt())
                .updatedAt(customer.getUpdatedAt())
                .address(customer.getAddress())
                .cpf(customer.getCpf())
                .email(customer.getEmail())
                .name(customer.getName())
                .phoneNumber(customer.getPhoneNumber())
                .build();
    }

    public static Customer fromOrmToDomain(CustomerORM orm) {
        return Customer.builder()
                .id(orm.getId())
                .createdAt(orm.getCreatedAt())
                .updatedAt(orm.getUpdatedAt())
                .address(orm.getAddress())
                .cpf(orm.getCpf())
                .email(orm.getEmail())
                .name(orm.getName())
                .phoneNumber(orm.getPhoneNumber())
                .build();
    }

    public static CustomerORM fromDomainToOrm(Customer customer) {
        return CustomerORM.builder()
                .id(customer.getId())
                .createdAt(customer.getCreatedAt())
                .updatedAt(customer.getUpdatedAt())
                .address(customer.getAddress())
                .cpf(customer.getCpf())
                .email(customer.getEmail())
                .name(customer.getName())
                .phoneNumber(customer.getPhoneNumber())
                .build();
    }

    public static Customer fromRequestToDomain(CreateCustomerRequest request) {
        return Customer.builder()
                .address(request.getAddress())
                .cpf(request.getCpf())
                .email(request.getEmail())
                .name(request.getName())
                .phoneNumber(request.getPhoneNumber())
                .build();
    }
}
