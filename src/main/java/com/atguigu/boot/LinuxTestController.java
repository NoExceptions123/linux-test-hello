package com.atguigu.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @Pakage com.atguigu.boot
 * @auther 刘俸滔
 * @date 2022/9/18 14:07
 */
@RestController
@RequestMapping("/linux")
public class LinuxTestController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }
}
