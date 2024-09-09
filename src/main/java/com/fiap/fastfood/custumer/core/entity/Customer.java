package com.fiap.fastfood.custumer.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String id;
    private String name;
    private String cpf;
    private String email;
    private String phoneNumber;
    private String address;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
}
