package com.zkjc.recyc.controller;

import com.zkjc.recyc.entity.UserEntity;
import com.zkjc.recyc.exception.UsernameIsExitedException;
import com.zkjc.recyc.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users", produces = "text/html;charset=UTF-8")
public class UserController {
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/signup")
    public String signUp(@RequestBody UserEntity user) {
        user.setPassword(user.getPassword());
        UserEntity bizUser = usersMapper.getUser(user.getUsername());
        if(null != bizUser){
            throw new UsernameIsExitedException("用户已经存在");
        }
        /*user.setPassword(DigestUtils.md5DigestAsHex((user.getPassword()).getBytes()));*/
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        usersMapper.insert(user);
        return "注册成功";
    }
}
