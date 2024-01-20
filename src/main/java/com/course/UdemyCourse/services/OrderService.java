package com.course.UdemyCourse.services;

import com.course.UdemyCourse.entities.Order;
import com.course.UdemyCourse.entities.User;
import com.course.UdemyCourse.repositories.OrderRepository;
import com.course.UdemyCourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
