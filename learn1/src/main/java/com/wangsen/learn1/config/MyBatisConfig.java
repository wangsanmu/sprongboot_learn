package com.wangsen.learn1.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author wangsen
 * @data 2018/3/8 19:22
 */
@Configuration
@MapperScan("com.wangsen.learn1.mapper*")
public class MyBatisConfig {

    private Logger logger = LoggerFactory.getLogger(MyBatisConfig.class);

    @Autowired
    @Qualifier("druidDataSource")
    private DataSource dataSource;


    /**
     *	 mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        page.setLocalPage(true);
        return page;
    }


    /**
     * SQL执行效率插件
     */
    @Bean
    @Profile({"dev","test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }


}
