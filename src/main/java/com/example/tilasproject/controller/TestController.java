package com.example.tilasproject.controller;

import com.example.tilasproject.pojo.Result;
import com.example.tilasproject.pojo.UserLogin;
import com.example.tilasproject.service.LoginService;
import io.jsonwebtoken.Claims;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/login")


    public Result login(
            @RequestBody UserLogin userLogin){
        UserLogin u = loginService.LoginCheck(userLogin.getUsername(),userLogin.getPassword());
        if(u != null){
            Map<String,Object> claims = new HashMap<>();
            claims.put("id",u.getId());
            claims.put(("username"),u.getUsername());
            claims.put("password",u.getPassword());
            String jwt = Jwts.builder()
                    .setClaims(claims)
                    .signWith(SignatureAlgorithm.HS256,"hekun")
                    .setExpiration(new Date(System.currentTimeMillis()+12*3600*1000))
                    .compact();
            return  Result.success(jwt);
        }
        else return  Result.error("error");
    }

    @PostMapping("/checklogin")
    public  Result jwtLogin(@RequestBody String jwt){
        System.out.println(jwt);
        Claims claims = Jwts.parser()
                .setSigningKey("hekun")
                .parseClaimsJws(jwt)
                .getBody();
        String username = (String) claims.get("username");
        String password = (String) claims.get("password");
        UserLogin u = loginService.LoginCheck(username,password);
        if(u != null){
            return Result.success();
        }
        else return  Result.error("error");
    }
}
