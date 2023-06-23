package com.example.tilasproject.service.impl;

import com.example.tilasproject.mapper.DeptMapper;
import com.example.tilasproject.pojo.Dept;
import com.example.tilasproject.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceimpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return  deptMapper.list();
    }

    @Override
    public void deleteById(Integer id){ deptMapper.deleteById(id);}

    @Override
    public void add(Dept dept){ deptMapper.add(dept);}

    @Override
    public Dept searchById(Integer id){return deptMapper.searchById(id);}

    @Override
    public void update(Dept dept){deptMapper.update(dept);}
}
