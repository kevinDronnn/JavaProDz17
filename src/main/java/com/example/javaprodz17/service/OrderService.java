package com.example.javaprodz17.service;

import com.example.javaprodz17.dto.OrderDto;
import com.example.javaprodz17.dto.ProductDto;

import java.util.List;

public interface OrderService {
    public List<OrderDto> getAllOrders();
    public OrderDto getOrderById(int id);
    public void addOrder(OrderDto orderDto);
    public void updateOrder(int id, OrderDto newOrder);
    public void deleteOrder(int id);
}
