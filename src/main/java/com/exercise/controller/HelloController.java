package com.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qianzc
 * @crateDate 2019/5/6 0006 14:44
 */
@Controller
public class HelloController {

    @GetMapping(value = "hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
}
