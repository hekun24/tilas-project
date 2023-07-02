package com.example.tilasproject.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//@WebFilter(urlPatterns = "/*")
//public class LoginFilter implements Filter{
//
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, SecurityException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse resp = (HttpServletResponse) response;
//
//        String url = req.getRequestURI().toString();
//
//        if(url.contains("login")){
//            chain.doFilter(request,response);
//            return;
//        }
//
//        String jwt = req.getHeader("token");
//
//
//
//
//    }
//
//}
