package com.atguigu.gmall0624.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0624.bean.UserInfo;
import com.atguigu.gmall0624.service.UserInfoService;
import com.atguigu.gmall0624.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUserInfo(UserInfo userInfo) {

    }

    @Override
    public void delUserInfo(UserInfo userInfo) {

    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {

    }
}
