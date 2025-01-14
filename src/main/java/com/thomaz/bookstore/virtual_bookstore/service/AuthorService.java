package com.thomaz.bookstore.virtual_bookstore.service;

import com.thomaz.bookstore.virtual_bookstore.dao.AuthorRepository;
import com.thomaz.bookstore.virtual_bookstore.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAll(){
        return authorRepository.findAll();
    }
    public Optional<Author> findById(Long id){
        return authorRepository.findById(id);
    }
    public Author save(Author author){
        return authorRepository.save(author);
    }
    public void deleteById(Long id){
        authorRepository.deleteById(id);
    }

}
