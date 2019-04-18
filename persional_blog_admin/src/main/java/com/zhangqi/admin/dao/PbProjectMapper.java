package com.zhangqi.admin.dao;

import com.zhangqi.domain.po.PbProject;

import java.util.ArrayList;

public interface PbProjectMapper {
    int deleteByPrimaryKey(Integer pbProjectid);

    int insert(PbProject record);

    int insertSelective(PbProject record);

    PbProject selectByPrimaryKey(Integer pbProjectid);

    int updateByPrimaryKeySelective(PbProject record);

    int updateByPrimaryKeyWithBLOBs(PbProject record);

    int updateByPrimaryKey(PbProject record);
    ArrayList<PbProject> selectAll();
}