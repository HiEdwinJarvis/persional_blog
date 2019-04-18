package com.zhangqi.admin.services.interfaceImp;


import com.zhangqi.admin.dao.PbCategoryMapper;
import com.zhangqi.admin.dao.PbInfoMapper;
import com.zhangqi.admin.services.BlogService;
import com.zhangqi.commons.dto.BaseResult;
import com.zhangqi.commons.validator.BeanValidator;
import com.zhangqi.domain.po.PbCategory;
import com.zhangqi.domain.po.PbInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
@Service
public class BlogServiceImp implements BlogService {
    @Autowired
    private PbInfoMapper pbInfoMapper;
    @Autowired
    private PbCategoryMapper pbcategoryMapper;
    @Transactional(readOnly = true)
    public ArrayList<PbInfo> ALLBlog() {
        System.out.println("services");
        ArrayList<PbInfo> list = pbInfoMapper.selectAll();
       System.out.println(list.get(0).getPbInfotitle());
        System.out.println("66");
       return list;
    }

    public void deleteBlog(Integer key) {
         pbInfoMapper.deleteByPrimaryKey(key);
    }

    public ArrayList<PbCategory> selectAllCategory() {
        ArrayList<PbCategory> list  = pbcategoryMapper.selectAll();
        return list;
    }

    public BaseResult save(PbInfo pbInfo) {
        String validator = BeanValidator.validator(pbInfo);
        if (validator != null) {
            return BaseResult.fail(validator);
        }

        // 验证通过
        else {
            pbInfoMapper.insert(pbInfo);
            // 新增


            return BaseResult.success("保存内容信息成功");
        }

    }

    public PbInfo selectBykey(Integer pbIonfokey) {
        PbInfo pbInfo = pbInfoMapper.selectByPrimaryKey(pbIonfokey);
        return pbInfo;
    }

    public int update(PbInfo pbInfo) {
        int flag = pbInfoMapper.updateByPrimaryKeyWithBLOBs(pbInfo);
        System.out.println(flag+"====更新返回值");
        if(flag ==1){
            return 200;
        }else{
            return 500;
        }

    }
}
