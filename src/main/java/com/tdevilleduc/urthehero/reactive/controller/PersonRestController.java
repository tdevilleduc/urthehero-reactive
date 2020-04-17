package com.tdevilleduc.urthehero.reactive.controller;

import com.tdevilleduc.urthehero.reactive.model.Person;
import com.tdevilleduc.urthehero.reactive.service.TransactionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/person")
public class PersonRestController {

    @Autowired
    private TransactionalService transactionalService;

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Flux<Person> findAll() {
        return transactionalService.findAll();
    }

    @GetMapping(value = "/{login}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Mono<Person> findByLogin(@PathVariable String login) {
        return transactionalService.findByLogin(login);
    }

    @PutMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Mono<Person> findByLogin(@RequestBody Person person) {
        return transactionalService.save(person);
    }
}
