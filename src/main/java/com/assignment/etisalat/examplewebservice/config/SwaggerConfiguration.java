package com.assignment.etisalat.examplewebservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfiguration {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(apiInfo());
    }

    private Info apiInfo() {
        Info apiInfo = new Info()
                .title("Etisalat Assignment Web service")
                .description("Etisalat Assignment Web service having CRUD operations \" +\n" +
                        "                        \"exposed via rest full apis for employees and departments")
                .version("v1")
                .contact(new Contact()
                        .name("Muhammad Akram")
                        .email("m.akram321@gmail.com")
                        .url("https://www.linkedin.com/in/muhammad-akram-8922973b/"))
                .license(new License()
                        .name("Apache License Version 2.0")
                        .url("https://www.apache.org/licenses/LICENSE-2.0"));
        return apiInfo;
    }

}
