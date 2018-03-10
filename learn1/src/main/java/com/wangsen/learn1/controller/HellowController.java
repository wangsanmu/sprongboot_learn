package com.wangsen.learn1.controller;

import com.wangsen.learn1.config.DruidConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangsen
 * @data 2018/3/8 19:06
 */
@RestController
public class HellowController {

    @Autowired
    private DruidConfig druidConfig;

    @GetMapping(value = {"/index"})
    public String HelloWorld(){
        return  "hellowWorlds";
//        return  druidConfig.getDriverClassName();
    }

}
