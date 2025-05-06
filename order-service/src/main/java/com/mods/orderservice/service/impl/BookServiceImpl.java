package com.mods.orderservice.service.impl;

import com.mods.orderservice.entities.Book;
import com.mods.orderservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final Map<String, Book> books = new ConcurrentHashMap<>();


    @Override
    public Flux<Book> findAll() {
        books.put("1234", Book.builder()
                        .id(1234L)
                        .title("Effective Java")
                        .author("Joshua Bloch")
                        .isbn("1234")
                .build());
        books.put("12345", Book.builder()
                .id(1234L)
                .title("Effective Java")
                .author("Joshua Bloch")
                .isbn("1234")
                .build());
        books.put("123456", Book.builder()
                .id(1234L)
                .title("Effective Java")
                .author("Joshua Bloch")
                .isbn("1234")
                .build());
        books.put("123478", Book.builder()
                .id(1234L)
                .title("Effective Java")
                .author("Joshua Bloch")
                .isbn("1234")
                .build());
        books.put("12349", Book.builder()
                .id(1234L)
                .title("Effective Java")
                .author("Joshua Bloch")
                .isbn("1234")
                .build());
        books.put("12340", Book.builder()
                .id(1234L)
                .title("Effective Java")
                .author("Joshua Bloch")
                .isbn("1234")
                .build());
        return Flux.fromIterable(books.values()).delayElements(Duration.ofMillis(2_000));
    }

    @Override
    public Mono<Book> create(Book book) {
        books.put(book.getIsbn(), book);
        return Mono.just(book);
    }

    @Override
    public Mono<Book> find(String isbn) {

        return Mono.justOrEmpty(books.get(isbn));
    }
}
