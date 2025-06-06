package com.mods.orderservice.controller;

import com.mods.orderservice.entities.Book;
import com.mods.orderservice.entities.EnrichedBook;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class EnrichedBookController {

    private static final String BOOKS_URL = "http://localhost:8080/books/{isbn}";
    private static final String OL_API = "https://openlibrary.org/isbn/{isbn}.json";
    private final WebClient rest;

    @GetMapping("/books/{isbn}")
    public Mono<ResponseEntity<EnrichedBook>> get(@PathVariable("isbn")
                                                  String isbn) {
        var book = rest.get().uri(BOOKS_URL, isbn).retrieve().
                bodyToMono(Book.class);
        var library = rest.get().uri(OL_API, isbn).retrieve().
                bodyToMono(Map.class);
        var enriched = enrich(book, library);
        return enriched.map(ResponseEntity::ok).onErrorResume(this::handleError);
    }

    private Mono<ResponseEntity<EnrichedBook>> handleError(Throwable ex) {
        if (ex instanceof RestClientResponseException rex) {
            return Mono.just(ResponseEntity.status(rex.getStatusCode()).build());
        }
        return Mono.just(ResponseEntity.internalServerError().build());
    }
    private Mono<EnrichedBook> enrich(Mono<Book> book, Mono<Map> ol) {
        return Mono.zip(book, ol)
                .map((res) -> enrich(res.getT1(), res.getT2()));
    }
    private EnrichedBook enrich(Book book, Map ol) {
        var publishDate = extractPublishData(ol);
        return new EnrichedBook(book.getIsbn(), book.getTitle(), publishDate, Collections.singletonList(book.getAuthor()));
    }
    private String extractPublishData(Map json) {
        return (String) json.getOrDefault("publish_date", "");
    }
}
