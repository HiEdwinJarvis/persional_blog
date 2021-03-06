package com.zhangqi.domain.po;

import org.hibernate.validator.constraints.Length;

public class PbProject {
    private Integer pbProjectid;

    private Integer pbOnecategoryid;

    private Integer pbTechnologyid;
    @Length(min = 1,max = 20,message = "标题字数得在1-20")
    private String pbProjectname;

    private String pbProjectpric;
    @Length(min = 1,message = "内容不得少于1个字")
    private String pbProjectdesc;

    public PbProject(Integer pbProjectid, Integer pbOnecategoryid, Integer pbTechnologyid, String pbProjectname, String pbProjectpric, String pbProjectdesc) {
        this.pbProjectid = pbProjectid;
        this.pbOnecategoryid = pbOnecategoryid;
        this.pbTechnologyid = pbTechnologyid;
        this.pbProjectname = pbProjectname;
        this.pbProjectpric = pbProjectpric;
        this.pbProjectdesc = pbProjectdesc;
    }

    public PbProject() {
        super();
    }

    public Integer getPbProjectid() {
        return pbProjectid;
    }

    public void setPbProjectid(Integer pbProjectid) {
        this.pbProjectid = pbProjectid;
    }

    public Integer getPbOnecategoryid() {
        return pbOnecategoryid;
    }

    public void setPbOnecategoryid(Integer pbOnecategoryid) {
        this.pbOnecategoryid = pbOnecategoryid;
    }

    public Integer getPbTechnologyid() {
        return pbTechnologyid;
    }

    public void setPbTechnologyid(Integer pbTechnologyid) {
        this.pbTechnologyid = pbTechnologyid;
    }

    public String getPbProjectname() {
        return pbProjectname;
    }

    public void setPbProjectname(String pbProjectname) {
        this.pbProjectname = pbProjectname == null ? null : pbProjectname.trim();
    }

    public String getPbProjectpric() {
        return pbProjectpric;
    }

    public void setPbProjectpric(String pbProjectpric) {
        this.pbProjectpric = pbProjectpric == null ? null : pbProjectpric.trim();
    }

    public String getPbProjectdesc() {
        return pbProjectdesc;
    }

    public void setPbProjectdesc(String pbProjectdesc) {
        this.pbProjectdesc = pbProjectdesc == null ? null : pbProjectdesc.trim();
    }
}