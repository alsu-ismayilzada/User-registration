package com.example.demo.config;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(
                new Info()
                        .title("Alsu Ismayilzade terefinden yazilib")
                        .version("0.0.1")
                        .contact(
                                new Contact()
                                        .url("www.hoogle.com")
                                        .email("ismayilzadealsu@gmail.com")
                                        .name("Alsu Ismayilzade")
                        )

        );
    }



}