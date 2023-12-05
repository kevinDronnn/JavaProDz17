package com.example.javaprodz17.service;

import com.example.javaprodz17.dto.OrderDto;
import com.example.javaprodz17.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    List<OrderDto> orderDtoList;

    public OrderServiceImpl() {
        this.orderDtoList = new ArrayList<>();
    }

    @Override
    public List<OrderDto> getAllOrders() {
        return orderDtoList;
    }

    @Override
    public OrderDto getOrderById(int id) {
        return orderDtoList.get(id + 1);
    }

    @Override
    public void addOrder(OrderDto orderDto) {
        orderDtoList.add(orderDto);
    }

    @Override
    public void updateOrder(int id, OrderDto newOrder) {
        for (int i = 0; i < orderDtoList.size(); i++) {
            if (orderDtoList.get(i).getId() == id + 1) {
                orderDtoList.set(i, newOrder);
                break;
            }
        }
    }

    @Override
    public void deleteOrder(int id) {
        orderDtoList.remove(id + 1);
    }
}
