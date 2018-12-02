package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


public interface UsersMapper {

//    @Select("SELECT * FROM users")
//    @Results({
//            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
//            @Result(property = "nickName", column = "nick_name")
//    })
//    List<UserEntity> getAll();
//
    @Select("SELECT * FROM Users WHERE username = #{username}")
    @Results({
            @Result(property = "username",  column = "username"),
            @Result(property = "password", column = "password"),
    })
    UserEntity getUser(String username);

    @Insert("INSERT INTO Users(username,password) VALUES(#{username}, #{password})")
    void insert(UserEntity user);
//
//    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
//    void update(UserEntity user);
//
//    @Delete("DELETE FROM users WHERE id =#{id}")
//    void delete(Long id);

}
