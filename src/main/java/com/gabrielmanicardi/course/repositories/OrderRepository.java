package com.gabrielmanicardi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielmanicardi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
