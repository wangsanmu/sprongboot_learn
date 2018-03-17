package com.wangsen.learn1.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wangsen.learn1.entity.TbUser;
import com.wangsen.learn1.service.TbUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author wangsen
 * @data 2018/3/10 13:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TbUserControllerTest {
    

    @Autowired
    private TbUserService tbUserService;

    @Test
    public void getAllUser() {
       List<TbUser> tbUserList =  tbUserService.selectList(new EntityWrapper<TbUser>());
       System.out.println(tbUserList.size());

       //测试分页
       Page<TbUser> tbUserPage =  tbUserService.selectPage(new Page<TbUser>(1,2));
        System.out.println(tbUserPage.getRecords());
    }

    @Test
    public void addUser() {

    }
}