package com.example.tilasproject.service.impl;

import com.example.tilasproject.mapper.LoginMapper;
import com.example.tilasproject.pojo.UserLogin;
import com.example.tilasproject.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceimpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public UserLogin LoginCheck(String username, String password) {
        return  loginMapper.LoginQuery(username, password);
    }

}
