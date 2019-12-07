package com.atguigu.gmall0624.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0624.bean.UserAddress;
import com.atguigu.gmall0624.service.UserAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserAddressController {
    @Reference
    private UserAddressService userAddressService;
    @ResponseBody
    @RequestMapping("findUserAddressbyId")
    public List<UserAddress> findUserAddressbyId(UserAddress userAddress){
      return   userAddressService.findUserAddressAll(userAddress);
    }
}
