package com.zhangqi.domain.po;

public class PbCategory {
    private Integer pbCategoryid;

    private Integer pbOnecategoryid;

    private String pbCategoryname;

    public PbCategory(Integer pbCategoryid, Integer pbOnecategoryid, String pbCategoryname) {
        this.pbCategoryid = pbCategoryid;
        this.pbOnecategoryid = pbOnecategoryid;
        this.pbCategoryname = pbCategoryname;
    }

    public PbCategory() {
        super();
    }

    public Integer getPbCategoryid() {
        return pbCategoryid;
    }

    public void setPbCategoryid(Integer pbCategoryid) {
        this.pbCategoryid = pbCategoryid;
    }

    public Integer getPbOnecategoryid() {
        return pbOnecategoryid;
    }

    public void setPbOnecategoryid(Integer pbOnecategoryid) {
        this.pbOnecategoryid = pbOnecategoryid;
    }

    public String getPbCategoryname() {
        return pbCategoryname;
    }

    public void setPbCategoryname(String pbCategoryname) {
        this.pbCategoryname = pbCategoryname == null ? null : pbCategoryname.trim();
    }
}