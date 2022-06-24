package com.example.SpringBootMybatis.Services;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.SpringBootMybatis.Mapper.UserLoginMapper;
import com.example.SpringBootMybatis.Pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserLoginMapper userLoginMapper;


    public List<User> findAll(){
        return userLoginMapper.selectList(new LambdaQueryWrapper<>());
    }

    public  List<User> findPage(int current, int pageSize){
        Page<User> page =  new Page<>(current,pageSize);
        Page<User> userLoginPage = userLoginMapper.selectPage(page,new LambdaQueryWrapper<>());
        log.info("totle:{}",userLoginPage.getTotal());
        log.info("pages:{}",userLoginPage.getPages());
        return userLoginPage.getRecords();
    }
}
