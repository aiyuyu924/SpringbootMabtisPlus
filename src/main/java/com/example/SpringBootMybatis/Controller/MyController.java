package com.example.SpringBootMybatis.Controller;


import com.example.SpringBootMybatis.Pojo.User;
import com.example.SpringBootMybatis.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class MyController {

    @Autowired
     private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }


    @GetMapping("/findPage")
    public List<User> findPage(@RequestParam("page") Integer page,
                               @RequestParam("pageSize")Integer pageSize){
        return userService.findPage(page,pageSize);
    }



}
