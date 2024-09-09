package com.fiap.fastfood.custumer.communication.controller;

import com.fiap.fastfood.custumer.common.builder.CustomerBuilder;
import com.fiap.fastfood.custumer.common.dto.request.CreateCustomerRequest;
import com.fiap.fastfood.custumer.common.dto.response.CustomerResponse;
import com.fiap.fastfood.custumer.common.interfaces.usecase.CustomerUseCase;
import com.fiap.fastfood.custumer.exceptions.custom.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerUseCase useCase;

    public CustomerController(CustomerUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping(value="/cpf/{cpf}")
    public ResponseEntity<CustomerResponse> getCustomerByCpf(@PathVariable String cpf) throws EntityNotFoundException {
        return ResponseEntity.ok(CustomerBuilder.fromDomainToResponse(useCase.getCustomerByCpf(cpf)));
    }

    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CreateCustomerRequest request) {
        return ResponseEntity.ok(CustomerBuilder.fromDomainToResponse(useCase.createCustomer(CustomerBuilder.fromRequestToDomain(request))));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id) {
        useCase.deleteCustomer(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
