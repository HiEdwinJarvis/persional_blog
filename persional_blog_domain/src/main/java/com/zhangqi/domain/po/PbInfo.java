package com.zhangqi.domain.po;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class PbInfo {

    private Integer pbInfoid;

    private Integer pbCategoryid;
    @Length(min=1,max=20,message = "长度不在1-20")
    private String pbInfotitle;
    @Length(min=10, max=100, message = "长度不在6-100")
    private String pbInfobody;

    public PbInfo(Integer pbInfoid, Integer pbCategoryid, String pbInfotitle, String pbInfobody) {
        this.pbInfoid = pbInfoid;
        this.pbCategoryid = pbCategoryid;
        this.pbInfotitle = pbInfotitle;
        this.pbInfobody = pbInfobody;
    }

    public PbInfo() {
        super();
    }

    public Integer getPbInfoid() {
        return pbInfoid;
    }

    public void setPbInfoid(Integer pbInfoid) {
        this.pbInfoid = pbInfoid;
    }

    public Integer getPbCategoryid() {
        return pbCategoryid;
    }

    public void setPbCategoryid(Integer pbCategoryid) {
        this.pbCategoryid = pbCategoryid;
    }

    public String getPbInfotitle() {
        return pbInfotitle;
    }

    public void setPbInfotitle(String pbInfotitle) {
        this.pbInfotitle = pbInfotitle == null ? null : pbInfotitle.trim();
    }

    public String getPbInfobody() {
        return pbInfobody;
    }

    public void setPbInfobody(String pbInfobody) {
        this.pbInfobody = pbInfobody == null ? null : pbInfobody.trim();
    }
}