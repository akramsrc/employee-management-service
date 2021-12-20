package com.assignment.etisalat.examplewebservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition (info =
@Info(
        title = "Etisalat Assignment Web service",
        version = "v1",
        description = "Etisalat Assignment Web service having CRUD operations exposed via rest full apis for employees and departments",
        license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0\""),
        contact = @Contact(url = "https://www.linkedin.com/in/muhammad-akram-8922973b/", name = "Muhammad Akram", email = "m.akram321@gmail.com")
    )
    )
public class SwaggerConfiguration {

}
