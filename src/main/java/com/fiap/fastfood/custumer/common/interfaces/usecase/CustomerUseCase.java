package com.fiap.fastfood.custumer.common.interfaces.usecase;

import com.fiap.fastfood.custumer.core.entity.Customer;
import com.fiap.fastfood.custumer.exceptions.custom.EntityNotFoundException;

public interface CustomerUseCase {

    Customer createCustomer(Customer customer);

    Customer getCustomerByCpf(String cpf) throws EntityNotFoundException;

    void deleteCustomer(String customerId);
}
