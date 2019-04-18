package com.zhangqi.admin.dao;

import com.zhangqi.domain.po.PbOnecategory;

public interface PbOnecategoryMapper {
    int deleteByPrimaryKey(Integer pbInfoid);

    int insert(PbOnecategory record);

    int insertSelective(PbOnecategory record);

    PbOnecategory selectByPrimaryKey(Integer pbInfoid);

    int updateByPrimaryKeySelective(PbOnecategory record);

    int updateByPrimaryKeyWithBLOBs(PbOnecategory record);

    int updateByPrimaryKey(PbOnecategory record);
}