package com.zhangqi.admin.services;

import com.zhangqi.commons.dto.BaseResult;
import com.zhangqi.domain.po.PbCategory;
import com.zhangqi.domain.po.PbInfo;

import java.util.ArrayList;

public interface BlogService {
    public ArrayList<PbInfo> ALLBlog();
    /*
    * 删除博客
    * */
    public void deleteBlog(Integer key);
    /*
    * 查询所有二级标签
    * */
    public ArrayList<PbCategory> selectAllCategory();
    public BaseResult save(PbInfo pbInfo);
    public PbInfo selectBykey(Integer pbIonfokey);
    public int update(PbInfo pbInfo);
}


