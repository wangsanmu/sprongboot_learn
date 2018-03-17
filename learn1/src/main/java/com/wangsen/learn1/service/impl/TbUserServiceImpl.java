package com.wangsen.learn1.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.wangsen.learn1.entity.TbUser;
import com.wangsen.learn1.mapper.TbUserMapper;
import com.wangsen.learn1.service.TbUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户账户表 服务实现类
 * </p>
 *
 * @author wangsen
 * @since 2018-03-10
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public List<TbUser> getAllUser(TbUser user){
        return tbUserMapper.getAllUser(user);
    }

    @Override
    public TbUser selectUserRole(Map<String, Object> parameter) {
        return tbUserMapper.selectUserRole(parameter);
    }
}
