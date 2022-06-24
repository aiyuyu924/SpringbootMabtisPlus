package com.example.SpringBootMybatis.Controller;


import com.example.SpringBootMybatis.Pojo.UserLogin;
import com.example.SpringBootMybatis.Services.UserLoginServiceImpl;
import com.example.SpringBootMybatis.Utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {

    @Autowired
     UserLoginServiceImpl userLoginServiceImpl;

    @RequestMapping("/findAll")
    @ResponseBody
    public Result findAll(){
        List<UserLogin> userLogins = userLoginServiceImpl.queryAll();

        return Result.ok(userLogins);
    }


    @RequestMapping(value = "/findId",method = RequestMethod.GET)
    @ResponseBody
    public Result findId(String id){
        UserLogin userLogin = userLoginServiceImpl.queryId(id);
        return Result.ok(userLogin);
    }

    @RequestMapping(value = "/findName",method = RequestMethod.GET)
    @ResponseBody
    public Result findName(String name){
        UserLogin userLogin = userLoginServiceImpl.queryName(name);
        return Result.ok(userLogin);
    }


    @RequestMapping(value = "/findAge",method = RequestMethod.GET)
    @ResponseBody
    public Result findAge(String age){
        UserLogin userLogin = userLoginServiceImpl.queryAge(age);
        return Result.ok(userLogin);
    }



    @RequestMapping(value = "/findEmail",method = RequestMethod.GET)
    @ResponseBody
    public Result findEmail(String email){
        UserLogin userLogin = userLoginServiceImpl.queryEmail(email);
        return Result.ok(userLogin);
    }



    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result  add(UserLogin userLogin){
        return Result.ok(userLoginServiceImpl.add(userLogin));
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public Result Delete(){
        return Result.ok(userLoginServiceImpl.Delete());
    }

    @RequestMapping(value = "/deleteId",method = RequestMethod.GET)
    @ResponseBody
    public Result deleteId(String id){
        UserLogin userLogin =  userLoginServiceImpl.queryId(id);
        if (userLogin==null){
           return Result.fail();
        }
        return Result.ok(userLoginServiceImpl.deleteId(id));
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public Result Update(UserLogin userLogin){
//        UserLogin userLogin =  userLoginServiceImpl.queryId(id);
//        if (userLogin==null){
//            return Result.fail();
//        }
        return Result.ok(userLoginServiceImpl.updateId(userLogin));
    }




}
