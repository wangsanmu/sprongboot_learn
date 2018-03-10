package com.wangsen.learn1.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

import static org.junit.Assert.*;

/**
 * @author wangsen
 * @data 2018/3/8 20:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisConfigTest {

    @Resource
    private DataSource dataSource;

    @Test
    public void druidDataSource() {
        System.out.println("俩");
    }
}