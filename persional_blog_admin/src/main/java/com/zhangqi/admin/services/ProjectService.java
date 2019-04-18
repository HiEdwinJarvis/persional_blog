package com.zhangqi.admin.services;

import com.zhangqi.commons.dto.BaseResult;
import com.zhangqi.domain.po.PbInfo;
import com.zhangqi.domain.po.PbProject;

import java.util.ArrayList;

public interface ProjectService {
    public ArrayList<PbProject> AllProject();
    /*
    * 删除博客
    * */
    public void deleteProject(Integer key);
    /*
    * 查询所有二级标签
    * */

    public BaseResult save(PbProject project);
    public PbInfo selectBykey(Integer projectKey);
    public int update(PbProject project);
}


