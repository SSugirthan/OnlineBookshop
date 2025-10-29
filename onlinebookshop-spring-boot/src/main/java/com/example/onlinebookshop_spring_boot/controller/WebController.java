package com.example.onlinebookshop_spring_boot.controller;

import com.example.onlinebookshop_spring_boot.models.OnlineBookShop;
import com.example.onlinebookshop_spring_boot.repository.OnlineBookShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")
public class WebController {

    @Autowired
    private OnlineBookShopRepository bookRepository;

    // GET - Get all books
    @GetMapping
    public List<OnlineBookShop> getAllBooks() {
        return bookRepository.findAll();
    }

    // POST - Add a new book
    @PostMapping
    public OnlineBookShop createBook(@RequestBody OnlineBookShop book) {
        return bookRepository.save(book);
    }

    // GET - Get a single book by ID
    @GetMapping("/{id}")
    public OnlineBookShop getBookById(@PathVariable Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // PUT - Update a book by ID
    @PutMapping("/{id}")
    public OnlineBookShop updateBook(@PathVariable Long id, @RequestBody OnlineBookShop bookDetails) {
        OnlineBookShop book = bookRepository.findById(id).orElse(null);
        if (book != null) {
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            book.setIsbn(bookDetails.getIsbn());
            book.setPrice(bookDetails.getPrice());
            return bookRepository.save(book);
        }
        return null;
    }

    // DELETE - Delete a book by ID
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "Book deleted successfully!";
    }
}
