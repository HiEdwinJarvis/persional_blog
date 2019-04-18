package com.zhangqi.domain.po;

import javax.validation.constraints.Pattern;

public class PbUser {
    private Integer pbUserid;

    private String pbUsername;

    private String pbUserpasswd;

    public PbUser(Integer pbUserid, String pbUsername, String pbUserpasswd) {
        this.pbUserid = pbUserid;
        this.pbUsername = pbUsername;
        this.pbUserpasswd = pbUserpasswd;
    }

    public PbUser() {
        super();
    }

    public Integer getPbUserid() {
        return pbUserid;
    }

    public void setPbUserid(Integer pbUserid) {
        this.pbUserid = pbUserid;
    }

    public String getPbUsername() {
        return pbUsername;
    }

    public void setPbUsername(String pbUsername) {
        this.pbUsername = pbUsername == null ? null : pbUsername.trim();
    }

    public String getPbUserpasswd() {
        return pbUserpasswd;
    }

    public void setPbUserpasswd(String pbUserpasswd) {
        this.pbUserpasswd = pbUserpasswd == null ? null : pbUserpasswd.trim();
    }
}