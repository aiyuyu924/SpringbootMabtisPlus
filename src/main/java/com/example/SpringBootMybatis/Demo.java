package com.example.SpringBootMybatis;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pojo")
public class Demo {

    @RequestMapping("/zq")
    public String zq(){
        return "123";
    }
}
