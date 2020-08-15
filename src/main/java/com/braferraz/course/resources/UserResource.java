package com.braferraz.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.braferraz.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
	User user = new User(1L, "Braian","braian@gmail.com","999999999","123123123");
	return ResponseEntity.ok().body(user);
	}
}
