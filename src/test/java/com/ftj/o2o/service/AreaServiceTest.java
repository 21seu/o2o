package com.ftj.o2o.service;

import com.ftj.o2o.BaseTest;
import com.ftj.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class AreaServiceTest extends BaseTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void getAreaList() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals("西苑", areaList.get(0).getAreaName());
    }
}