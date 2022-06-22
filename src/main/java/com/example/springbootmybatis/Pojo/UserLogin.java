package com.example.springbootmybatis.Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLogin {
    private String id;
    private String name;
    private String age;
    private String email;
}
