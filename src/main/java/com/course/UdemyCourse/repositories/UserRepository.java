package com.course.UdemyCourse.repositories;

import com.course.UdemyCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
