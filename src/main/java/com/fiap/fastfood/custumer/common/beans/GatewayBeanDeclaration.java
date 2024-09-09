package com.fiap.fastfood.custumer.common.beans;

import com.fiap.fastfood.custumer.common.interfaces.datasource.SpringDataMongoCustomerRepository;
import com.fiap.fastfood.custumer.common.interfaces.gateway.CustomerGateway;
import com.fiap.fastfood.custumer.communication.gateway.CustomerGatewayImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayBeanDeclaration {
    @Bean
    public CustomerGateway customerGateway(SpringDataMongoCustomerRepository repository) {
        return new CustomerGatewayImpl(repository);
    }
}
