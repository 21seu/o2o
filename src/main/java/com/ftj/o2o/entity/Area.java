package com.ftj.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * 区域信息实体类
 * @author ftj
 */
@Data
public class Area {

    //ID
    private Integer areaId;
    //名称
    private String areaName;
    //权重
    private Integer priority;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;
}
