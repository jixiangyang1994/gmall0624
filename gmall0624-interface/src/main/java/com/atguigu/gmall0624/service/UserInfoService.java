package com.atguigu.gmall0624.service;

import com.atguigu.gmall0624.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> findAll();

    void addUserInfo(UserInfo userInfo);

    void delUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);
}
