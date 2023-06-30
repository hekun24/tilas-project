package com.example.tilasproject.mapper;

import com.example.tilasproject.pojo.UserLogin;
import com.github.pagehelper.ISelect;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    @Select("select * from users where username = #{username} and password = #{password}")
    UserLogin LoginQuery(String username,String password);
}
