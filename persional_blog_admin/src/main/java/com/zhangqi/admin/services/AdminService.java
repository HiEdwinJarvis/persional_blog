package com.zhangqi.admin.services;

import com.zhangqi.domain.po.PbUser;

public interface AdminService {
    PbUser login(String username, String password);
}
