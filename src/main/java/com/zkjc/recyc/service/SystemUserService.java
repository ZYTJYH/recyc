package com.zkjc.recyc.service;

import com.zkjc.recyc.entity.UserEntity;
import com.zkjc.recyc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SystemUserService {

    @Autowired
    private UserMapper userMapper;

    public UserEntity getUser(String username) {
        return userMapper.getUser(username);
    }
}

