package com.example.tilasproject.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.tilasproject.mapper.EmployeeMapper;
import com.example.tilasproject.pojo.Employee;
import com.example.tilasproject.pojo.Result;
import com.example.tilasproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/emps")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public Result queryEmployeeList(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer gender,
            @RequestParam(required = false) Date begin,
            @RequestParam(required = false) Date end,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer pageSize) {
        return Result.success(employeeService.queryEmployeeListByPage(name, gender, begin, end, page, pageSize));
    }
}

