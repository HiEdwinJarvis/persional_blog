package com.zhangqi.admin.dao;

import com.zhangqi.domain.po.PbInfo;

import java.util.ArrayList;

public interface PbInfoMapper {
    int deleteByPrimaryKey(Integer pbInfoid);

    int insert(PbInfo record);

    int insertSelective(PbInfo record);

    PbInfo selectByPrimaryKey(Integer pbInfoid);

    int updateByPrimaryKeySelective(PbInfo record);

    int updateByPrimaryKeyWithBLOBs(PbInfo record);

    int updateByPrimaryKey(PbInfo record);
    ArrayList<PbInfo> selectAll();
}