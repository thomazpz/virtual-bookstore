package com.thomaz.bookstore.virtual_bookstore.rest;

import com.thomaz.bookstore.virtual_bookstore.entity.OrderItem;
import com.thomaz.bookstore.virtual_bookstore.service.OrderItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController {
    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.findAll();
    }

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.save(orderItem);
    }

    @PutMapping("/{id}")
    public OrderItem updateOrderItem(@PathVariable Long id, @RequestBody OrderItem orderItem) {
        orderItem.setId(id);
        return orderItemService.save(orderItem);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable Long id) {
        orderItemService.deleteById(id);
    }
}
