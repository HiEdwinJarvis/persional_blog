package com.zhangqi.api.dao;

import com.zhangqi.domain.po.PbTechnology;

import java.util.ArrayList;

public interface PbTechnologyMapper {
    int deleteByPrimaryKey(Integer pbTechnologyid);

    int insert(PbTechnology record);

    int insertSelective(PbTechnology record);

    PbTechnology selectByPrimaryKey(Integer pbTechnologyid);

    int updateByPrimaryKeySelective(PbTechnology record);

    int updateByPrimaryKeyWithBLOBs(PbTechnology record);

    int updateByPrimaryKey(PbTechnology record);

    ArrayList<PbTechnology> sellectAll();
}