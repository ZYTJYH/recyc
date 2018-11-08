package com.zkjc.recyc.service;

import com.zkjc.recyc.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService {

    @Autowired
    private SystemUserService systemUserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //根据用户名从数据库查询对应记录
        UserEntity systemUser = systemUserService.getUser(s);
        if (systemUser == null) {
            throw new UsernameNotFoundException("username is not exists");
        }
        return systemUser;
    }
}
