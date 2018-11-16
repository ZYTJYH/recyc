package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.enums.EmployeeKindEnum;
import com.zkjc.recyc.enums.EmployeeStatusEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface PositionsMapper {



    @Select("SELECT * FROM Positions")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "longitude", column = "longitude"),
            @Result(property = "latitude", column = "latitude"),
            @Result(property = "workStatus", column = "work_status",javaType = EmployeeStatusEnum.class),
            @Result(property = "kind", column = "kind",javaType = EmployeeKindEnum.class)
    })
    List<PositionEntity> getAll();

    @Select("SELECT * FROM Positions WHERE employee_id=#{employeeId}")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "longitude", column = "longitude"),
            @Result(property = "latitude", column = "latitude"),
            @Result(property = "workStatus", column = "work_status",javaType = EmployeeStatusEnum.class),
            @Result(property = "kind", column = "kind",javaType = EmployeeKindEnum.class)
    })
    PositionEntity getOne(String employeeId);

    @Insert("INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES(#{employeeId},#{updateTime},#{longitude},#{latitude},#{workStatus},#{kind})")
    void insert(PositionEntity position);

    @Update("UPDATE Positions SET update_time=#{updateTime},longitude=#{longitude},latitude=#{latitude},work_status=#{workStatus},kind=#{kind} WHERE employee_id =#{employeeId}")
    void update(PositionEntity position);

    @Delete("DELETE FROM Positions WHERE employee_id =#{employeeId}")
    void delete(String employeeId);
}
