package com.company.microservice2transaction;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
@OpenAPIDefinition(
        info = @Info(
                title = "Transaction Rest API",
                description = "MicroService",
                version = "v1"
        )
)
public class Microservice2TransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(Microservice2TransactionApplication.class, args);
    }

}
