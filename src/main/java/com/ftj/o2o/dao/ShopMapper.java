package com.ftj.o2o.dao;

import com.ftj.o2o.entity.Shop;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {

    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(@Param("shop") Shop shop);

    /**
     * 更新店铺信息
     * @param shop
     * @return
     */
    int updateShop(@Param("shop") Shop shop);
}
