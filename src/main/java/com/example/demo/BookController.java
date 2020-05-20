package com.example.demo;

import java.util.Date;
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

    @SuppressWarnings("deprecation")
	@GetMapping
    public List<Book> get() {
    	 List<Book> list = repository.findAll();
    	 Book book = new Book();
    	 book.withId(45);
    	 book.withName("Lary Sherokee" + new Date().toLocaleString());
    	 list.add(book);
    	 
        return list;
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Book request) {
        repository.save(request);
        return ResponseEntity.ok().build();
    }
}