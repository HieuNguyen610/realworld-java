package com.mods.orderservice.service;

import com.mods.orderservice.entities.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {
    Flux<Book> findAll();
    Mono<Book> create(Book book);
    Mono<Book> find(String isbn);
}
