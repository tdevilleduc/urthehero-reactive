package com.tdevilleduc.urthehero.reactive.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI createApiInfo(final SwaggerApiInfoProperties.ApiInfoProperties properties) {
        OpenAPI openAPI =  new OpenAPI()
                .info(new Info()
                        .title(properties.getTitle())
                        .description(properties.getDescription())
                        .version(properties.getVersion())
                        .license(new License()
                                .name(properties.getLicense())
                                .url(properties.getLicenseUrl())));

        final SwaggerApiInfoProperties.ApiInfoProperties.Contact contact = properties.getContact();
        if (contact != null) {
            openAPI.getInfo().contact(new Contact()
                    .name(properties.getContact().getName())
                    .url(properties.getContact().getUrl())
                    .email(properties.getContact().getEmail()));
        }

        return openAPI;
    }
}
