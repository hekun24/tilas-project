package com.example.tilasproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;import com.example.tilasproject.pojo.Employee;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
@Mapper
public interface EmployeeMapper {
    List<Employee> queryEmployee(@Param("name") String name,
                                     @Param("gender") Integer gender,
                                     @Param("begin") Date begin,
                                     @Param("end") Date end);
}