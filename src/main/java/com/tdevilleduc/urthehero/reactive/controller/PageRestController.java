package com.tdevilleduc.urthehero.reactive.controller;

import com.tdevilleduc.urthehero.reactive.dao.PageRepository;
import com.tdevilleduc.urthehero.reactive.model.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/page")
@Slf4j
public class PageRestController {

    @Autowired
    private PageRepository pageRepository;

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Flux<Page> findAll() {
        return pageRepository.findAll();
    }

    @GetMapping(value = "/{pageId}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Mono<Page> findById(@PathVariable Integer pageId) {
        return pageRepository.findById(pageId).map(page -> {
            log.info("page {}", page.getId());
            return page;
        });
    }
}
