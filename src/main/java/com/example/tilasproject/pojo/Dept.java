package com.example.tilasproject.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Dept {
    private Integer id;
    private String name;
    private Date create_time;
    private Date update_time;
}
