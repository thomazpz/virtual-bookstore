package com.thomaz.bookstore.virtual_bookstore.rest;

import com.thomaz.bookstore.virtual_bookstore.entity.Author;
import com.thomaz.bookstore.virtual_bookstore.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAllAuthors(){
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id){
        return authorService.findById(id).orElse(null);
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author){
        return authorService.save(author);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author author){
        author.setId(id);
        return authorService.save(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id){
        authorService.deleteById(id);
    }

}
