package com.example.SpringBootMybatis.Mapper;


import com.example.SpringBootMybatis.Pojo.UserLogin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserLoginMapper {
    //查询
     List<UserLogin> queryAll();

    //添加数据
     int add(UserLogin userLogin);

    //根据id查询用户数据
     UserLogin queryId(String id);

    //根据name查询用户数据
     UserLogin queryName(String name);

    //根据age查询用户数据
     UserLogin queryAge(String age);

    //根据email查询用户数据
     UserLogin queryEmail(String email);

     //删除所有数据
    UserLogin Delete();

    //根据id删除
    int deleteId(String id);

    //修改
    int updateId(UserLogin userLogin);

}
