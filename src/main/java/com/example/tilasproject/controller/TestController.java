package com.example.tilasproject.controller;

import com.example.tilasproject.pojo.Result;
import com.example.tilasproject.pojo.UserLogin;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestController {
    @PostMapping ("/login")
    public Result login(
            @RequestBody UserLogin userLogin){
        System.out.println("hello");
        System.out.println(userLogin.getUsername());
        System.out.println(userLogin.getPassword());
        return  Result.success();
    }
}
