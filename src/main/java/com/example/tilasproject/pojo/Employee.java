package com.example.tilasproject.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    private String username;
    private String password;
    private String name;
    private Integer gender;
    private String image;
    private Integer job;
    private Date entrydate;
    private Integer dept_id;
    private Date create_time;
    private Date update_time;
}
