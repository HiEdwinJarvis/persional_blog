package com.zhangqi.api.dao;

import com.zhangqi.domain.po.PbProfile;

public interface PbProfileMapper {
    int deleteByPrimaryKey(Integer pbProfileid);

    int insert(PbProfile record);

    int insertSelective(PbProfile record);

    PbProfile selectByPrimaryKey(Integer pbProfileid);

    int updateByPrimaryKeySelective(PbProfile record);

    int updateByPrimaryKeyWithBLOBs(PbProfile record);

    int updateByPrimaryKey(PbProfile record);
}