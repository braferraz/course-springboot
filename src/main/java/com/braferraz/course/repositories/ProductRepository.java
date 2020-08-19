package com.braferraz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braferraz.course.entities.Category;
import com.braferraz.course.entities.Product;
import com.braferraz.course.entities.User;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
