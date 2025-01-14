package com.thomaz.bookstore.virtual_bookstore.dao;

import com.thomaz.bookstore.virtual_bookstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
