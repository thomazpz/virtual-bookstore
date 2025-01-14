package com.thomaz.bookstore.virtual_bookstore.rest;

import com.thomaz.bookstore.virtual_bookstore.entity.Book;
import com.thomaz.bookstore.virtual_bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.findAll();
    }


    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        book.setId(id);
        return bookService.save(book);
    }

    @DeleteMapping("{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteById(id);
    }
}
