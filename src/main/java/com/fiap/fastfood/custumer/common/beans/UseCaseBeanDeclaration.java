package com.fiap.fastfood.custumer.common.beans;

import com.fiap.fastfood.custumer.common.interfaces.gateway.CustomerGateway;
import com.fiap.fastfood.custumer.common.interfaces.usecase.CustomerUseCase;
import com.fiap.fastfood.custumer.core.usecase.CustomerUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanDeclaration {
    @Bean
    public CustomerUseCase customerUseCase(CustomerGateway customerGateway) {
        return new CustomerUseCaseImpl(customerGateway);
    }
}
