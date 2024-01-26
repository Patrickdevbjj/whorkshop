package com.course.UdemyCourse.repositories;

import com.course.UdemyCourse.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
