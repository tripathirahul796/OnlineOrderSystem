package com.onlineordersystem.onlineordersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineordersystem.onlineordersystem.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository <Product, Integer>{
    
}
