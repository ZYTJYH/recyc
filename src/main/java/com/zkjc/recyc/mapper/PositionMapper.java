package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.entity.UserEntity;
import com.zkjc.recyc.enums.EmployeeStatusEnum;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

public interface PositionMapper {



    @Select("SELECT * FROM position WHERE status=1")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "time", column = "time"),
            @Result(property = "longitude", column = "longitude"),
            @Result(property = "latitude", column = "latitude"),
            @Result(property = "status", column = "status",javaType = EmployeeStatusEnum.class),
            @Result(property = "bossId", column = "boss"),
            @Result(property = "time", column = "time")
    })
    List<PositionEntity> getAll();

//    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
//    void insert(UserEntity user);
//
//    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
//    void update(UserEntity user);
//
//    @Delete("DELETE FROM users WHERE id =#{id}")
//    void delete(Long id);
}
