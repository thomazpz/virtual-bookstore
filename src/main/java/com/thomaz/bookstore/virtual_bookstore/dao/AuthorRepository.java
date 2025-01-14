package com.thomaz.bookstore.virtual_bookstore.dao;

import com.thomaz.bookstore.virtual_bookstore.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
