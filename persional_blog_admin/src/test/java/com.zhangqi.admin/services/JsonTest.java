package com.zhangqi.admin.services;


import com.zhangqi.admin.dao.PbProjectMapper;
import com.zhangqi.commons.util.JSONArray;
import com.zhangqi.domain.po.PbInfo;
import com.zhangqi.domain.po.PbProject;
import com.zhangqi.domain.po.PbProjectTechno;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springContext.xml", "classpath:springContext-druid.xml", "classpath:springContext-mybaits.xml","classpath:mybatis.xml"})
public class JsonTest {
@Autowired
ProjectTechService projectTechService;
    @Test
    public void json(){
        PbProject pb = new PbProject();
        pb.setPbProjectid(1);
        pb.setPbProjectname("张三");
        pb.setPbTechnologyid(3);
        JSONArray json = new JSONArray();

        System.out.println(json.beanToJson(pb));
    }
@Test
    public void pbProjectTechno(){
    ArrayList<PbProjectTechno> list = projectTechService.selectAll();
    for(PbProjectTechno value:list){
        System.out.println(value);
    }
    System.out.println(JSONArray.listToJson(list));
}
@Autowired
BlogService blogService;

    @Test
    public void find() {


        PbInfo pbInfo = blogService.selectBykey(3);

        System.out.println(JSONArray.beanToJson(pbInfo));
    }

    @Autowired
    PbProjectMapper pbProjectMapper;

    @Test
    public void addproject() {
        PbProject pbProject = new PbProject();
        pbProject.setPbProjectname("test");
        pbProject.setPbOnecategoryid(2);
        pbProject.setPbProjectdesc("test hello");
        pbProject.setPbProjectpric("sdfsfsdfs");
        System.out.println(pbProjectMapper.insert(pbProject));

    }

}
