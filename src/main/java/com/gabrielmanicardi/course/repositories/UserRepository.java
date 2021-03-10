package com.gabrielmanicardi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielmanicardi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
