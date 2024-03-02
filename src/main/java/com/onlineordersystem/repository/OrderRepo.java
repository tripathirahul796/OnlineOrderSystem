package com.onlineordersystem.repository;

import com.onlineordersystem.entity.Order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository <Order, Integer> {

    List<Order> findByStatus(int status);
    
}
