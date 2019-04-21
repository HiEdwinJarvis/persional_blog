package com.zhangqi.api.service;

import com.zhangqi.api.dao.PbInfoMapper;

import com.zhangqi.api.services.PbInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springContext.xml", "classpath:springContext-druid.xml", "classpath:springContext-mybaits.xml","classpath:mybatis.xml"})
public class PbInfoServiceImpTest {


    @Autowired
    PbInfoMapper pbm;

    @Autowired
    PbInfoService pbInfoService;

    @Test
    public void pb(){

        System.out.println(pbm.selectByPrimaryKey(3));
        pbInfoService.selectAll();
    }

}