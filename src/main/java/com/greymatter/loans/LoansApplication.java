package com.greymatter.loans;

import com.greymatter.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@OpenAPIDefinition(
        info = @Info(
                title = "Loans microservice REST API Documentation",
                description = "Greymatter bank Loans microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Jorge Garcia",
                        email = "jcgarciamed@gmail.com",
                        url = "https://www.greymatter.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.greymatter.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Greymatter bank Loans microservice REST API Documentation",
                url = "https://www.greymatter.com/swagger-ui.html"
        )
)
public class LoansApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
    }

}
