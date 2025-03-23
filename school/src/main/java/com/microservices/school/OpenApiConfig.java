package com.microservices.school;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Christelle",
                        email = "sobbinginmycupofcoffee@gmail.com",
                        url = "github.com/christelle10"
                ),
                description = "OpenApi documentation for a microservice demo app on student-school system",
                title = "OpenApi specification - christelle",
                version = "1.0",
                license = @License(
                        name = "Licence",
                        url = "https://some-url.com"
                ),
                termsOfService = "Terms of Service"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                )
        }
)
public class OpenApiConfig {
}
