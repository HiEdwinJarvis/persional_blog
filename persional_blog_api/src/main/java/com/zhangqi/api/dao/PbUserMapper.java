package com.zhangqi.api.dao;

import com.zhangqi.domain.po.PbUser;

public interface PbUserMapper {
    int deleteByPrimaryKey(Integer pbUserid);

    int insert(PbUser record);

    int insertSelective(PbUser record);

    PbUser selectByPrimaryKey(Integer pbUserid);

    int updateByPrimaryKeySelective(PbUser record);

    int updateByPrimaryKey(PbUser record);

    PbUser selectByUsername(String pbUsername);
}