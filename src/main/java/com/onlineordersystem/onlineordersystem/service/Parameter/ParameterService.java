package com.onlineordersystem.onlineordersystem.service.Parameter;

import java.util.List;

import com.onlineordersystem.onlineordersystem.entity.Parameter;

public interface ParameterService {
    List<Parameter> getParameter(Long parentId);
    String addParameter(Parameter param);
    String updateParameter(Long parentId);
    String deleteParameter(Long parentId);
 
}
