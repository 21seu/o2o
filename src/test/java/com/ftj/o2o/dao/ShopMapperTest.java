package com.ftj.o2o.dao;

import com.ftj.o2o.BaseTest;
import com.ftj.o2o.entity.Area;
import com.ftj.o2o.entity.PersonInfo;
import com.ftj.o2o.entity.Shop;
import com.ftj.o2o.entity.ShopCategory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class ShopMapperTest extends BaseTest {

    @Autowired
    private ShopMapper shopMapper;

    @Test
    @Ignore //忽略不执行这个方法
    public void insertShop() {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setPhone("test");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int effectedNum = shopMapper.insertShop(shop);
        assertEquals(1, effectedNum);
    }

    @Test
    public void updateShop() {
        Shop shop = new Shop();
        shop.setShopId(1L);
        shop.setShopDesc("测试描述");
        shop.setShopAddr("测试地址");
        shop.setLastEditTime(new Date());
        assertEquals(1, shopMapper.updateShop(shop));
    }
}