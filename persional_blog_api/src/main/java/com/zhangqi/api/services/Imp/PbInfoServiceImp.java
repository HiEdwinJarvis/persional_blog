package com.zhangqi.api.services.Imp;

import com.zhangqi.api.dao.PbInfoMapper;
import com.zhangqi.api.services.PbInfoService;
import com.zhangqi.domain.po.PbInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional(readOnly = true)
public class PbInfoServiceImp implements PbInfoService {

    @Autowired
    PbInfoMapper pbInfoMapper;
    @Override
    public ArrayList<PbInfo> selectAll() {
        return pbInfoMapper.selectAll();
    }
}
