package com.tdevilleduc.urthehero.reactive.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${resource-uri}") String resourceUri;

    @Bean
    WebClient webClient() {
        return WebClient.builder()
                .baseUrl(this.resourceUri)
                .build();
    }
}