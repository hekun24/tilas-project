package com.example.tilasproject.service;


import com.example.tilasproject.pojo.Dept;

import java.util.Date;
import java.util.List;

public interface DeptService {

    List<Dept> list();
    void deleteById(Integer id);

    void add(Dept dept);

    Dept searchById(Integer id);

    void update(Dept dept);
}
