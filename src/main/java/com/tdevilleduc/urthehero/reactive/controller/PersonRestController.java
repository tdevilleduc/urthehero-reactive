package com.tdevilleduc.urthehero.reactive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.Arrays;

@RestController
@RequestMapping(value = "/api/person")
public class PersonRestController {

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Flux<Integer> findAll() {
        return Flux.fromIterable(Arrays.asList(1, 2, 3));
    }
}
