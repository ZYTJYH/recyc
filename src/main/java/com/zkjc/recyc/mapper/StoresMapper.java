package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.enums.EmployeeKindEnum;
import com.zkjc.recyc.enums.EmployeeStatusEnum;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface StoresMapper {

    @Select("SELECT * FROM Store")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "longitude", column = "longitude"),
            @Result(property = "latitude", column = "latitude"),
            @Result(property = "workStatus", column = "work_status",javaType = EmployeeStatusEnum.class),
            @Result(property = "kind", column = "kind",javaType = EmployeeKindEnum.class)
    })
    List<PositionEntity> getAll();

    @Select("SELECT * FROM Store WHERE employee_id=#{employeeId} AND update_time>=#{startDay} AND update_time<=#{endDay} order by update_time asc")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "longitude", column = "longitude"),
            @Result(property = "latitude", column = "latitude"),
            @Result(property = "workStatus", column = "work_status",javaType = EmployeeStatusEnum.class),
            @Result(property = "kind", column = "kind",javaType = EmployeeKindEnum.class)
    })
    List<PositionEntity> getOne(String employeeId, Date startDay,Date endDay);

    @Insert("INSERT INTO Store(employee_id,update_time,longitude,latitude,work_status,kind) VALUES(#{employeeId},#{updateTime},#{longitude},#{latitude},#{workStatus},#{kind})")
    void insert(PositionEntity position);

//    @Update("UPDATE Positions SET update_time=#{updateTime},longitude=#{longitude},latitude=#{latitude},work_status=#{workStatus},kind=#{kind} WHERE employee_id =#{employeeId}")
//    void update(PositionEntity position);
//
//    @Delete("DELETE FROM Positions WHERE employee_id =#{employeeId}")
//    void delete(String employeeId);
}
