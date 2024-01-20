package com.course.UdemyCourse.repositories;

import com.course.UdemyCourse.entities.Order;
import com.course.UdemyCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
