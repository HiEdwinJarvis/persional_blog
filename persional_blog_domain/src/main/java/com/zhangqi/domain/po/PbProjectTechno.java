package com.zhangqi.domain.po;

public class PbProjectTechno {
    private Integer pbProjecttechnoid;

    private String pbProjecttechnoname;

    private Integer pbProjectid;

    private String pbProjecttechnodesc;

    public PbProjectTechno(Integer pbProjecttechnoid, String pbProjecttechnoname, Integer pbProjectid, String pbProjecttechnodesc) {
        this.pbProjecttechnoid = pbProjecttechnoid;
        this.pbProjecttechnoname = pbProjecttechnoname;
        this.pbProjectid = pbProjectid;
        this.pbProjecttechnodesc = pbProjecttechnodesc;
    }

    public PbProjectTechno() {
        super();
    }

    public Integer getPbProjecttechnoid() {
        return pbProjecttechnoid;
    }

    public void setPbProjecttechnoid(Integer pbProjecttechnoid) {
        this.pbProjecttechnoid = pbProjecttechnoid;
    }

    public String getPbProjecttechnoname() {
        return pbProjecttechnoname;
    }

    public void setPbProjecttechnoname(String pbProjecttechnoname) {
        this.pbProjecttechnoname = pbProjecttechnoname == null ? null : pbProjecttechnoname.trim();
    }

    public Integer getPbProjectid() {
        return pbProjectid;
    }

    public void setPbProjectid(Integer pbProjectid) {
        this.pbProjectid = pbProjectid;
    }

    public String getPbProjecttechnodesc() {
        return pbProjecttechnodesc;
    }

    public void setPbProjecttechnodesc(String pbProjecttechnodesc) {
        this.pbProjecttechnodesc = pbProjecttechnodesc == null ? null : pbProjecttechnodesc.trim();
    }
}