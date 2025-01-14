package com.thomaz.bookstore.virtual_bookstore.dao;

import com.thomaz.bookstore.virtual_bookstore.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
