package com.atguigu.gmall0624.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0624.bean.*;
import com.atguigu.gmall0624.manage.mapper.*;
import com.atguigu.gmall0624.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {
    @Autowired
    BaseAttrInfoMapper baseAttrInfoMapper;

    @Autowired
    BaseAttrValueMapper baseAttrValueMapper;

    @Autowired
    BaseCatalog1Mapper baseCatalog1Mapper;

    @Autowired
    BaseCatalog2Mapper baseCatalog2Mapper;

    @Autowired
    BaseCatalog3Mapper baseCatalog3Mapper;
    @Override
    public List<BaseCatalog1> getCatalog1() {
        return baseCatalog1Mapper.selectAll();
    }

    @Override
    public List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2) {
        return baseCatalog2Mapper.select(baseCatalog2);
    }

    @Override
    public List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3) {
        return baseCatalog3Mapper.select(baseCatalog3);
    }

    @Override
    public List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo) {
        return baseAttrInfoMapper.select(baseAttrInfo);
    }

    @Override
    @Transactional
    public void saveAttrInfo(BaseAttrInfo baseAttrInfo) {

        if(baseAttrInfo.getId()!=null && baseAttrInfo.getId().length()>0){
            baseAttrInfoMapper.updateByPrimaryKeySelective(baseAttrInfo);

        }else {
            baseAttrInfoMapper.insertSelective(baseAttrInfo);
        }
        BaseAttrValue baseAttrValueDel = new BaseAttrValue();
        baseAttrValueDel.setAttrId(baseAttrInfo.getId());
        baseAttrValueMapper.delete(baseAttrValueDel);
        List<BaseAttrValue> attrValueList = baseAttrInfo.getAttrValueList();
        if(attrValueList!=null && attrValueList.size()>0){
            for (BaseAttrValue baseAttrValue : attrValueList) {
                baseAttrValue.setAttrId(baseAttrInfo.getId());
                baseAttrValueMapper.insertSelective(baseAttrValue);
            }
        }

    }

    @Override
    public List<BaseAttrValue> getAttrValueList(String attrId) {
        BaseAttrValue baseAttrValue = new BaseAttrValue();
        baseAttrValue.setAttrId(attrId);
        return baseAttrValueMapper.select(baseAttrValue);
    }

    @Override
    public BaseAttrInfo getAtterInfo(String attrId) {
        BaseAttrInfo baseAttrInfo = baseAttrInfoMapper.selectByPrimaryKey(attrId);
        baseAttrInfo.setAttrValueList(getAttrValueList(attrId));
        return baseAttrInfo;
    }


}
