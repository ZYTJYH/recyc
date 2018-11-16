package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.PersonEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PersonsMapper {
    @Select("SELECT * FROM Persons")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "personName", column = "person_name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "job", column = "job"),
            @Result(property = "kind", column = "kind"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "age", column = "age"),
            @Result(property = "area", column = "area"),
            @Result(property = "bossId", column = "boss_id")
    })
    List<PersonEntity> getAll();

    @Select("SELECT * FROM Persons WHERE employee_id =#{employeeId}")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "personName", column = "person_name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "job", column = "job"),
            @Result(property = "kind", column = "kind"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "age", column = "age"),
            @Result(property = "area", column = "area"),
            @Result(property = "bossId", column = "boss_id")
    })
    PersonEntity getOne(String employeeId);

    @Insert("INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES(#{employeeId},#{personName},#{phone},#{job},#{kind},#{gender},#{age},#{area},#{bossId})")
    void insert(PersonEntity bin);

    @Update("UPDATE Persons SET person_name=#{personName},phone=#{phone},job=#{job},kind=#{kind},gender=#{gender},age=#{age},area=#{area},boss_id=#{bossId}WHERE employee_id =#{employeeId}")
    void update(PersonEntity bin);

    @Delete("DELETE FROM Persons WHERE employee_id =#{employeeId}")
    void delete(String employeeId);
}
