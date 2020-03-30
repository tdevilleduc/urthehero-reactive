package com.tdevilleduc.urthehero.reactive.dao;

import com.tdevilleduc.urthehero.reactive.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class PageRepository {

    @Autowired
    private WebClient webClient;

    public Mono<Page> findById(Integer pageId) {
        return webClient
                .get()
                .uri("/pages/" + pageId)
                .retrieve()
                .bodyToMono(Page.class);
    }

    public Flux<Page> findAll() {
        return webClient
                .get()
                .uri("/pages/")
                .retrieve()
                .bodyToFlux(Page.class);
    }
}
