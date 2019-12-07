package com.atguigu.gmall0624.service;

import com.atguigu.gmall0624.bean.UserAddress;

import java.util.List;

public interface UserAddressService {

    List<UserAddress> findUserAddressAll(UserAddress userAddress);
}
