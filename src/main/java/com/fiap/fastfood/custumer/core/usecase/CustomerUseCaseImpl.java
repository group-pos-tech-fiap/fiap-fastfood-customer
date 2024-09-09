package com.fiap.fastfood.custumer.core.usecase;

import com.fiap.fastfood.custumer.common.interfaces.gateway.CustomerGateway;
import com.fiap.fastfood.custumer.common.interfaces.usecase.CustomerUseCase;
import com.fiap.fastfood.custumer.core.entity.Customer;
import com.fiap.fastfood.custumer.exceptions.custom.EntityNotFoundException;

public class CustomerUseCaseImpl implements CustomerUseCase {

    private final CustomerGateway customerGateway;

    public CustomerUseCaseImpl(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerGateway.createCustomer(customer);
    }

    @Override
    public Customer getCustomerByCpf(String cpf) throws EntityNotFoundException {
        return customerGateway.getCustomerByCpf(cpf);
    }

    @Override
    public void deleteCustomer(String customerId) {
        customerGateway.deleteCustomer(customerId);
    }
}
