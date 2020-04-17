package com.tdevilleduc.urthehero.reactive.service;

import com.tdevilleduc.urthehero.reactive.dao.PersonRepository;
import com.tdevilleduc.urthehero.reactive.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class TransactionalService {

    @Autowired
    private PersonRepository repository;

    /**
     * Saves the given {@link Person} unless its firstname is "Dave".
     *
     * @param customer must not be {@literal null}.
     * @return
     */
    @Transactional
    public Mono<Person> save(Person customer) {

        return repository.save(customer).map(it -> {
            return it;
//            if (it.firstname.equals("Dave")) {
//                throw new IllegalStateException();
//            } else {
//                return it;
//            }
        });
    }

    @Transactional
    public Flux<Person> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Mono<Person> findByLogin(String login) {
        return repository.findByLogin(login);
    }
}