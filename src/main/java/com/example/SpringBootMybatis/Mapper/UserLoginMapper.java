package com.example.SpringBootMybatis.Mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.SpringBootMybatis.Pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserLoginMapper extends BaseMapper<User> {

}
