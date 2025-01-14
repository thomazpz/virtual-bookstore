package com.thomaz.bookstore.virtual_bookstore.service;

import com.thomaz.bookstore.virtual_bookstore.dao.AuthorRepository;
import com.thomaz.bookstore.virtual_bookstore.dao.BookRepository;
import com.thomaz.bookstore.virtual_bookstore.entity.Author;
import com.thomaz.bookstore.virtual_bookstore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
