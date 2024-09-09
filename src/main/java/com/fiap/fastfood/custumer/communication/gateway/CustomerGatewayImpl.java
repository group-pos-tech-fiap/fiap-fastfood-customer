package com.fiap.fastfood.custumer.communication.gateway;

import com.fiap.fastfood.custumer.common.builder.CustomerBuilder;
import com.fiap.fastfood.custumer.common.interfaces.datasource.SpringDataMongoCustomerRepository;
import com.fiap.fastfood.custumer.common.interfaces.gateway.CustomerGateway;
import com.fiap.fastfood.custumer.core.entity.Customer;
import com.fiap.fastfood.custumer.exceptions.custom.EntityNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomerGatewayImpl implements CustomerGateway {

    private final SpringDataMongoCustomerRepository repository;

    public CustomerGatewayImpl(SpringDataMongoCustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        var orm = CustomerBuilder.fromDomainToOrm(customer);
        return CustomerBuilder.fromOrmToDomain(repository.save(orm));
    }

    @Override
    public Customer getCustomerByCpf(String cpf) throws EntityNotFoundException {
        var customer = repository.findByCpf(cpf);
        if (customer == null) {
            throw new EntityNotFoundException("CUSTOMER-ERROR-02", String.format("Customer with CPF %s not found", cpf));
        }
        return CustomerBuilder.fromOrmToDomain(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        repository.deleteById(id);
    }
}
