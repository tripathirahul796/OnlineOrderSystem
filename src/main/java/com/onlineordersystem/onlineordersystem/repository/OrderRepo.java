package com.onlineordersystem.onlineordersystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineordersystem.onlineordersystem.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository <Order, Integer> {

    List<Order> findByStatus(int status);
    
}
