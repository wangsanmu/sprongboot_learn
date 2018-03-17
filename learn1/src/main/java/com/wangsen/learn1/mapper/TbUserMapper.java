package com.wangsen.learn1.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wangsen.learn1.entity.TbUser;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户账户表 Mapper 接口
 * </p>
 *
 * @author wangsen
 * @since 2018-03-10
 */
public interface TbUserMapper extends BaseMapper<TbUser> {

    List<TbUser> getAllUser(TbUser user);

    TbUser selectUserRole(Map<String, Object> parameter);
}
