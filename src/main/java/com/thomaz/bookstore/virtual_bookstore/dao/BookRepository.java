package com.thomaz.bookstore.virtual_bookstore.dao;

import com.thomaz.bookstore.virtual_bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
