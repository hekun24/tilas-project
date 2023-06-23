package com.example.tilasproject.controller;

import com.example.tilasproject.pojo.Dept;
import com.example.tilasproject.pojo.Result;
import com.example.tilasproject.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/depts")
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list(){
        List<Dept>deptList = deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        deptService.deleteById(id);
        return  Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept){
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result searchById(@PathVariable Integer id){
        Dept dept = deptService.searchById(id);
        return Result.success(dept);
    }

    @PutMapping("/depts")
    public  Result updateById(@RequestBody Dept dept){
        deptService.update(dept);
        return Result.success();
    }
}
