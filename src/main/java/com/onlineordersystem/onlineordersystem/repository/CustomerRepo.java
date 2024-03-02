package com.onlineordersystem.onlineordersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineordersystem.onlineordersystem.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository <Customer, String> {
    
}
