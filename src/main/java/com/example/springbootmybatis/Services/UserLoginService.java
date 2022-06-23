package com.example.springbootmybatis.Services;

import com.example.springbootmybatis.Pojo.UserLogin;

import java.util.List;


public interface UserLoginService {

    //查询
     List<UserLogin> queryAll();

    //根据id查询用户数据
     UserLogin queryId(String id);

    //根据name查询用户数据
     UserLogin queryName(String name);

    //根据age查询用户数据
     UserLogin queryAge(String age);

    //根据email查询用户数据
     UserLogin queryEmail(String email);

     //添加数据
     int add(UserLogin userLogin);

     //删除全部
    UserLogin Delete();
    //根据id删除
    //boolean deleteId(String id);
    int deleteId(String id);

    //根据id修改
    int UpdateId(String id);
}
