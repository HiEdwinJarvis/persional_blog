package com.zhangqi.domain.po;

public class PbOnecategory {
    private Integer pbInfoid;

    private Integer pbCategoryid;

    private String pbInfotitle;

    private String pbInfobody;

    public PbOnecategory(Integer pbInfoid, Integer pbCategoryid, String pbInfotitle, String pbInfobody) {
        this.pbInfoid = pbInfoid;
        this.pbCategoryid = pbCategoryid;
        this.pbInfotitle = pbInfotitle;
        this.pbInfobody = pbInfobody;
    }

    public PbOnecategory() {
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