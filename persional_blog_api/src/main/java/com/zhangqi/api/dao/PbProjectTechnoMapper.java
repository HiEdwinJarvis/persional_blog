package com.zhangqi.api.dao;

import com.zhangqi.domain.po.PbProjectTechno;

import java.util.ArrayList;

public interface PbProjectTechnoMapper {
    int deleteByPrimaryKey(Integer pbProjecttechnoid);

    int insert(PbProjectTechno record);

    int insertSelective(PbProjectTechno record);

    PbProjectTechno selectByPrimaryKey(Integer pbProjecttechnoid);

    int updateByPrimaryKeySelective(PbProjectTechno record);

    int updateByPrimaryKeyWithBLOBs(PbProjectTechno record);

    int updateByPrimaryKey(PbProjectTechno record);

    ArrayList<PbProjectTechno> selectAll();
}