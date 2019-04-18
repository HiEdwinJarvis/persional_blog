package com.zhangqi.admin.services.interfaceImp;

import com.zhangqi.admin.dao.PbUserMapper;
import com.zhangqi.admin.services.AdminService;
import com.zhangqi.domain.po.PbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

@Service
@Transactional(readOnly = true)
public class AdminServiceImp implements AdminService {
@Autowired
private PbUserMapper userMapper;
    public PbUser login(String username, String password) {
        System.out.println("hello");
        PbUser user = userMapper.selectByUsername(username);
        System.out.println("world");


        if (user == null) {
            return null;
        } else {


            String md5 = DigestUtils.md5DigestAsHex(password.getBytes());
            System.out.println(md5);
            if (md5.equals(user.getPbUserpasswd())) {
                System.out.println("匹配成功");
                return user;

            }else {
                System.out.println("密码错误");
                return null;
            }
        }

    }
}
