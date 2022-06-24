package com.example.SpringBootMybatis.Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

// TODO: 2022/6/25  
//必须和数据库名称保持一致
public class User {
    private String id;
    private String name;
    private String age;
    private String email;
}
