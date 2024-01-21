package com.course.UdemyCourse.repositories;

import com.course.UdemyCourse.entities.Category;
import com.course.UdemyCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
