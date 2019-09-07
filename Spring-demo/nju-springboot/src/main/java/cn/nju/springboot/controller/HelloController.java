package cn.nju.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Gu Yaming
 * @Description:
 * @Date:Create：in 2019/9/6 10:51
 * @Modified By：
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("show")
    public String test(){
        return "hello springboot";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
