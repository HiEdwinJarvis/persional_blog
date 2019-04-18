package com.zhangqi.admin.services.interfaceImp;

import com.zhangqi.admin.dao.PbProjectMapper;
import com.zhangqi.admin.services.ProjectService;
import com.zhangqi.commons.dto.BaseResult;
import com.zhangqi.domain.po.PbInfo;
import com.zhangqi.domain.po.PbProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ProjectServiceImp implements ProjectService {
    @Autowired
    PbProjectMapper pbProjectMapper;
    public ArrayList<PbProject> AllProject() {
        ArrayList<PbProject> projectlist =  pbProjectMapper.selectAll();
        return projectlist;
    }

    public void deleteProject(Integer key) {

    }

    public BaseResult save(PbProject project) {
        return null;
    }

    public PbInfo selectBykey(Integer projectKey) {
        return null;
    }

    public int update(PbProject project) {
        return 0;
    }
}
