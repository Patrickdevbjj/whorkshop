package com.course.UdemyCourse.repositories;

import com.course.UdemyCourse.entities.Category;
import com.course.UdemyCourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
