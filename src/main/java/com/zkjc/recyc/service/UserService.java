package com.zkjc.recyc.service;

import com.zkjc.recyc.entity.UserEntity;
import com.zkjc.recyc.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Component
public class UserService implements UserDetailsService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //根据用户名从数据库查询对应记录
        UserEntity user = usersMapper.getUser(s);
        if (user == null) {
            throw new UsernameNotFoundException("username is not exists");
        }
        return user;
    }
}
