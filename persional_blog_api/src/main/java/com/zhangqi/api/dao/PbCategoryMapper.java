package com.zhangqi.api.dao;



import com.zhangqi.domain.po.PbCategory;

import java.util.ArrayList;

public interface PbCategoryMapper {
    int deleteByPrimaryKey(Integer pbCategoryid);

    int insert(PbCategory record);

    int insertSelective(PbCategory record);

    PbCategory selectByPrimaryKey(Integer pbCategoryid);

    int updateByPrimaryKeySelective(PbCategory record);

    int updateByPrimaryKey(PbCategory record);

    ArrayList<PbCategory> selectAll();
}