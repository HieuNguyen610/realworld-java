package com.mods.orderservice.controller;

import com.mods.orderservice.entities.Book;
import com.mods.orderservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.spring6.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    public String findAll(Model model) {
        var books = new ReactiveDataDriverContextVariable(bookService.
                findAll(), 5);
        model.addAttribute("books", books);
        return "books/list";
    }

    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/bookss/{isbn}")
    public Mono<Book> findByIsbn(@PathVariable("isbn") String isbn) {
        return bookService.find(isbn);
    }

    @PostMapping("/books")
    public Mono<Book> createBook(@RequestBody Book book) {
        return bookService.create(book);
    }

}
