package com.thomaz.bookstore.virtual_bookstore.dao;

import com.thomaz.bookstore.virtual_bookstore.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
