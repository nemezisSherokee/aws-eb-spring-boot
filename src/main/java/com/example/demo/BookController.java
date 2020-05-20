package com.example.demo;

import java.util.Collection;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Book> get() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity post(@RequestBody Book request) {
        repository.save(request);
        return ResponseEntity.ok().build();
    }
}