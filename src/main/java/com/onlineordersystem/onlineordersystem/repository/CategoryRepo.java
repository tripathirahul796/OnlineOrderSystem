package com.onlineordersystem.onlineordersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineordersystem.onlineordersystem.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
    
}
