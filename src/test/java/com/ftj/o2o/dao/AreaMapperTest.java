package com.ftj.o2o.dao;

import com.ftj.o2o.BaseTest;
import com.ftj.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

import java.util.List;

public class AreaMapperTest extends BaseTest {

    @Autowired
    private AreaMapper areaMapper;

    @Test
    public void testQueryArea() {
        List<Area> areasList = areaMapper.queryArea();
        assertEquals(2, areasList.size());
    }
}