package com.tdevilleduc.urthehero.reactive.dao;

import com.tdevilleduc.urthehero.reactive.model.Person;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Person, Integer> {

    @Query("SELECT * FROM person")
    Flux<Person> findAll();

    @Query("SELECT * FROM person WHERE login = :login")
    Mono<Person> findByLogin(String login);

    @Query("SELECT * FROM person WHERE firstname LIKE :firstname")
    Flux<Person> findByFirstnameLike(String firstname);
}
