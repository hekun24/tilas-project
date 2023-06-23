package com.example.tilasproject.mapper;

import com.example.tilasproject.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("select * from dept")
    List<Dept>list();

    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into dept(name,create_time,update_time) values(#{name},#{create_time},#{update_time})")
    void add(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept searchById(Integer id);

    @Update("update dept set name=#{name},create_time,update_time=#{update_time} where id = #{id}")
    void update(Dept dept);
}
