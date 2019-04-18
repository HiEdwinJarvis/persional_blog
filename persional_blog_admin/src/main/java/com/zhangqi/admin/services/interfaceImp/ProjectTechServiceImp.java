package com.zhangqi.admin.services.interfaceImp;

import com.zhangqi.admin.dao.PbProjectTechnoMapper;
import com.zhangqi.admin.services.ProjectTechService;
import com.zhangqi.domain.po.PbProjectTechno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ProjectTechServiceImp implements ProjectTechService {
    @Autowired
    PbProjectTechnoMapper pbProjectTechnoMapper;
    @Override
    public ArrayList<PbProjectTechno> selectAll() {
        return pbProjectTechnoMapper.selectAll();
    }
}
