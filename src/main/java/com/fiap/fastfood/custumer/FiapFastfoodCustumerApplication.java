package com.fiap.fastfood.custumer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Fast Food CUSTOMER - FIAP", description = "Microservico responsavel pelos dados de cliente", version = "v1"))
public class FiapFastfoodCustumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FiapFastfoodCustumerApplication.class, args);
    }

}
