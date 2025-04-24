package com.payu.CatalogueManagement.controller;

import com.payu.CatalogueManagement.entity.Book;
import com.payu.CatalogueManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return service.findAll();
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return service.save(book);
    }

    @PutMapping("/updateBook/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return service.update(id, book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.delete(id);
    }

}
