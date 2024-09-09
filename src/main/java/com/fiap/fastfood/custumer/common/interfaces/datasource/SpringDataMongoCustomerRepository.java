package com.fiap.fastfood.custumer.common.interfaces.datasource;

import com.fiap.fastfood.custumer.external.orm.CustomerORM;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataMongoCustomerRepository extends MongoRepository<CustomerORM, String> {

    CustomerORM findByCpf(String cpf);
}
