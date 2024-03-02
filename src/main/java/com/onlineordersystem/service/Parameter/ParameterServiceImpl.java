package com.onlineordersystem.service.Parameter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlineordersystem.entity.Parameter;
import com.onlineordersystem.repository.ParameterRepo;

public class ParameterServiceImpl implements ParameterService {

    @Autowired
    ParameterRepo parameterRepo;

    @Override
    public List<Parameter> getParameter(Long parentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getParameter'");
    }

    @Override
    public String addParameter(Parameter param) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addParameter'");
    }

    @Override
    public String updateParameter(Long parentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateParameter'");
    }

    @Override
    public String deleteParameter(Long parentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteParameter'");
    }
    
}
