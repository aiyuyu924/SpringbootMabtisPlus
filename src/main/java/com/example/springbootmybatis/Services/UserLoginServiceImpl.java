package com.example.springbootmybatis.Services;

import com.example.springbootmybatis.Mapper.UserLoginMapper;
import com.example.springbootmybatis.Pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserLoginServiceImpl implements UserLoginService{

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Override
    public List<UserLogin> queryAll() {
        return userLoginMapper.queryAll();
    }

    @Override
    public int add(UserLogin userLogin) {
        return userLoginMapper.add(userLogin);
    }

    @Override
    public UserLogin Delete() {
        return userLoginMapper.Delete();
    }

    @Override
    public int deleteId(String id) {
        return userLoginMapper.deleteId(id);
    }

    @Override
    public int UpdateId(String id) {
        return userLoginMapper.UpdateId(id);
    }


    @Override
    public UserLogin queryId(String id) {
        return userLoginMapper.queryId(id);
    }

    @Override
    public UserLogin queryName(String name) {
        return userLoginMapper.queryName(name);
    }

    @Override
    public UserLogin queryAge(String age) {
        return userLoginMapper.queryAge(age);
    }

    @Override
    public UserLogin queryEmail(String email) {
        return userLoginMapper.queryEmail(email);
    }
}
