package com.atguigu.gmall0624.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0624.bean.UserAddress;
import com.atguigu.gmall0624.service.UserAddressService;
import com.atguigu.gmall0624.user.mapper.UserAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class UserAddressServiceImpl implements UserAddressService{
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserAddress> findUserAddressAll(UserAddress userAddress) {
        return userAddressMapper.select(userAddress);
    }
}
