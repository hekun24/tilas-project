package com.example.tilasproject.service;

import com.example.tilasproject.pojo.UserLogin;

public interface LoginService {
    UserLogin LoginCheck(String username, String password);
}
