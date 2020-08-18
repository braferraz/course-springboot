package com.braferraz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braferraz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
