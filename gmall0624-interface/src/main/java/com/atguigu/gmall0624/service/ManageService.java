package com.atguigu.gmall0624.service;

import com.atguigu.gmall0624.bean.*;

import java.util.List;

public interface ManageService {
    /**
     * 查询所有一级分类
     * @return
     */
    List<BaseCatalog1> getCatalog1();

    /**
     * 根据id查询所有的二级分类
     * @param baseCatalog2
     * @return
     */
    List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2);
    /**
     * 根据id查询所有的三级分类
     * @param baseCatalog3
     * @return
     */
    List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3);

    /**
     * 根据属性查询平台属性数据
     * @param catalog3Id
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(String catalog3Id);

    /**
     * 添加平台属性值
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 通过attrId查询平台属性值集合
     * @param attrId
     * @return
     */
    List<BaseAttrValue> getAttrValueList(String attrId);

    /**
     * 通过平台属性attrId 查询平台属性对象
     * @param attrId
     * @return
     */
    BaseAttrInfo getAtterInfo(String attrId);

    /**
     * 查询列表
     * @return
     */
    List<SpuInfo> getSpuList();

    List<BaseSaleAttr> getBaseSaleAttrList();

    void saveSpuInfo(SpuInfo spuInfo);

    /**
     * 遍历spu图片
     * @param spuImage
     * @return
     */
    List<SpuImage> getSpuImageList(SpuImage spuImage);



    /**
     * 销售属性回显
     * @param spuId
     * @return
     */
    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);

    /**
     * 大保存
     * @param skuInfo
     */
    void saveSkuInfo(SkuInfo skuInfo);
}
