package com.wangsen.learn1.service;

import com.wangsen.learn1.entity.TbUser;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户账户表 服务类
 * </p>
 *
 * @author wangsen
 * @since 2018-03-10
 */
public interface TbUserService extends IService<TbUser> {

    /**
     * SDFSDF
     * @param user
     * @return
     */
    List<TbUser> getAllUser(TbUser user);

    /**
     * 获取用户
     */
    TbUser selectUserRole(Map<String, Object> parameter);
}
