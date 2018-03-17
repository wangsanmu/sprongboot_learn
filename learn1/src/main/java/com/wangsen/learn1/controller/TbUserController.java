package com.wangsen.learn1.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.wangsen.learn1.common.EndecryptUtil;
import com.wangsen.learn1.common.Result;
import com.wangsen.learn1.entity.TbUser;
import com.wangsen.learn1.enums.LockEnum;
import com.wangsen.learn1.handler.MyMetaObjectHandler;
import com.wangsen.learn1.service.TbUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String getAllUser(){
        return "success";
    }

    /**
     * 测试分页
     * @return
     */
    @GetMapping(value = "/getUserByPage")
    public Object getUserByPage(){
        Page<TbUser> tbUserPage =  tbUserService.selectPage(
                new Page<TbUser>(1,2));
        System.out.println(tbUserPage.getRecords());
        return  tbUserPage.getRecords();
    }

    /**
     * 保存用户
     */
    @PostMapping(value = "/addUser")
    public Result addUser(@RequestParam(required = true) String uAccountName,@RequestParam(required = true) String uPassword){
        Result result = new Result();
        if(StringUtils.isNoneBlank(uAccountName) && StringUtils.isNoneBlank(uPassword)){
            //随机盐
            String salt = EndecryptUtil.getRadomSalt();
            //密码加密
            uPassword = EndecryptUtil.getEncryPassword("SHA",uPassword,salt,10);
            //保存用户
            TbUser tbUser = new TbUser();
            tbUser.setuAccountName(uAccountName);
            tbUser.setuPassword(uPassword);
            tbUser.setuCredentialsSalt(salt);
            tbUser.setuLocked(LockEnum.LOCK_OFF.getIndex());
            tbUserService.insert(tbUser);

        }else{
            result.setErrorMsg("用户名或者密码为空");
        }
        return  result;
    }
}

