package com.onlineordersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineordersystem.entity.Parameter;

public interface ParameterRepo extends JpaRepository <Parameter,Integer> {
    
}
