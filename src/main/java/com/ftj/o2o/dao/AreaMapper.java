package com.ftj.o2o.dao;

import com.ftj.o2o.entity.Area;

import java.util.List;

public interface AreaMapper {

    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queryArea();
}
