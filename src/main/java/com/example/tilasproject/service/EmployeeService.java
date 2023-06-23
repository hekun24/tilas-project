package com.example.tilasproject.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.tilasproject.pojo.Employee;
import com.example.tilasproject.pojo.PageBean;

import java.util.Date;
import java.util.List;

public interface EmployeeService {
    PageBean queryEmployeeListByPage(String name, Integer gender, Date begin, Date end, int page, int pageSize);
}