package com.example.tilasproject.service.impl;


import com.example.tilasproject.mapper.EmployeeMapper;
import com.example.tilasproject.pojo.Employee;
import com.example.tilasproject.pojo.PageBean;
import com.example.tilasproject.service.EmployeeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;



@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public PageBean queryEmployeeListByPage(String name, Integer gender, Date begin, Date end, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Employee>emplist = employeeMapper.queryEmployee(name,gender,begin,end);
        Page<Employee> pagebean= (Page<Employee>)emplist;
        PageBean p = new PageBean(pagebean.getTotal(),pagebean.getResult());
        return p;
    }
}