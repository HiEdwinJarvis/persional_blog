package com.zhangqi.admin.services.interfaceImp;

import com.zhangqi.admin.dao.PbCategoryMapper;
import com.zhangqi.admin.services.CategoryService;

import com.zhangqi.domain.po.PbCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private PbCategoryMapper pbcategoryMapper;
    public ArrayList<PbCategory> selectAll() {
        return pbcategoryMapper.selectAll();
    }
}
