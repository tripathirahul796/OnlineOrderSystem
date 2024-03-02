package com.onlineordersystem.onlineordersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineordersystem.onlineordersystem.entity.Parameter;

public interface ParameterRepo extends JpaRepository <Parameter,Integer> {
    
}
