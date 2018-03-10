package com.wangsen.learn1.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wangsen.learn1.entity.TbUser;
import com.wangsen.learn1.handler.MyMetaObjectHandler;
import com.wangsen.learn1.service.TbUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户账户表 前端控制器
 * </p>
 *
 * @author wangsen
 * @since 2018-03-10
 */
@RestController
@RequestMapping("/user")
public class TbUserController {

    protected final static Logger logger = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Autowired
    private TbUserService tbUserService;

    @GetMapping(value = "/getAllUser")
    public List<TbUser> getAllUser(){
        logger.info("sdfs");
        return tbUserService.selectList(new EntityWrapper<TbUser>());
    }

    /**
     * 测试分页
     * @return
     */
    @GetMapping(value = "/getUserByPage")
    public Object getUserByPage(){
        Page<TbUser> tbUserPage =  tbUserService.selectPage(new Page<TbUser>(1,2));
        System.out.println(tbUserPage.getRecords());
        return  tbUserPage.getRecords();
    }
}

