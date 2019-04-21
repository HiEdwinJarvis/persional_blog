package com.zhangqi.api.dao;

import com.zhangqi.domain.po.PbTool;

public interface PbToolMapper {
    int deleteByPrimaryKey(Integer pbToolid);

    int insert(PbTool record);

    int insertSelective(PbTool record);

    PbTool selectByPrimaryKey(Integer pbToolid);

    int updateByPrimaryKeySelective(PbTool record);

    int updateByPrimaryKeyWithBLOBs(PbTool record);

    int updateByPrimaryKey(PbTool record);
}