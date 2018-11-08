package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.entity.UserEntity;
import com.zkjc.recyc.enums.EmployeeKindEnum;
import com.zkjc.recyc.enums.EmployeeStatusEnum;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


public interface PositionMapper {



    @Select("SELECT * FROM positions WHERE work_status='on'")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "time", column = "time"),
            @Result(property = "longitude", column = "longitude"),
            @Result(property = "latitude", column = "latitude"),
            @Result(property = "workStatus", column = "work_status",javaType = EmployeeStatusEnum.class),
            @Result(property = "bossId", column = "boss_id"),
            @Result(property = "information", column = "information"),
            @Result(property = "kind", column = "kind",javaType = EmployeeKindEnum.class)
    })
    List<PositionEntity> getAll();

    @Insert("INSERT INTO Positions(employee_id,time,longitude,latitude,work_status,boss_id,information,kind) VALUES(#{employeeId},#{time},#{longitude},#{latitude},#{workStatus},#{bossId},#{information},#{kind})")
    void insert(PositionEntity position);

    @Update("UPDATE Positions SET time=#{time},longitude=#{longitude},latitude=#{latitude},work_status=#{workStatus},boss_id=#{bossId},information=#{information},kind=#{kind} WHERE employee_id =#{employeeId}")
    void update(PositionEntity position);

    @Delete("DELETE FROM Positions WHERE employee_id =#{employeeId}")
    void delete(String employeeId);
}
