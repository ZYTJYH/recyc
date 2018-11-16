package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.CarEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CarsMapper {
    @Select("SELECT * FROM Cars")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "carName", column = "car_name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "carNumber", column = "car_number"),
            @Result(property = "carType", column = "car_type"),
            @Result(property = "kind", column = "kind"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "age", column = "age"),
            @Result(property = "area", column = "area"),
            @Result(property = "bossId", column = "boss_id")
    })
    List<CarEntity> getAll();

    @Select("SELECT * FROM Cars WHERE employee_id=#{employeeId}")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "carName", column = "car_name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "carNumber", column = "car_number"),
            @Result(property = "carType", column = "car_type"),
            @Result(property = "kind", column = "kind"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "age", column = "age"),
            @Result(property = "area", column = "area"),
            @Result(property = "bossId", column = "boss_id")
    })
    CarEntity getOne(String employeeId);

    @Insert("INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES(#{employeeId},#{carName},#{phone},#{carNumber},#{carType},#{kind},#{gender},#{age},#{area},#{bossId})")
    void insert(CarEntity bin);

    @Update("UPDATE Cars SET car_name=#{carName},phone=#{phone},car_number=#{carNumber},car_type=#{carType},kind=#{kind},gender=#{gender},age=#{age},area=#{area},boss_id=#{bossId} WHERE employee_id =#{employeeId}")
    void update(CarEntity bin);

    @Delete("DELETE FROM Cars WHERE employee_id =#{employeeId}")
    void delete(String employeeId);
}
