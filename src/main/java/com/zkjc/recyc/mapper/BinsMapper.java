package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.BinEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BinsMapper {
    @Select("SELECT * FROM Bins")
    @Results({
            @Result(property = "employeeId",  column = "employee_id"),
            @Result(property = "binName", column = "bin_name"),
            @Result(property = "currentV", column = "current_v"),
            @Result(property = "maxV", column = "max_v"),
            @Result(property = "area", column = "area"),
            @Result(property = "temperature", column = "temperature"),
            @Result(property = "bossId", column = "boss_id"),
    })
    List<BinEntity> getAll();

    @Insert("INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES(#{employeeId},#{binName},#{currentV},#{maxV},#{area},#{temperature},#{bossId})")
    void insert(BinEntity bin);

    @Update("UPDATE Bins SET bin_name=#{bin_name},current_v=#{currentV},max_v=#{maxV},area=#{area},temperature=#{temperature},boss_id=#{bossId} WHERE employee_id =#{employeeId}")
    void update(BinEntity bin);

    @Delete("DELETE FROM Bins WHERE employee_id =#{employeeId}")
    void delete(String employeeId);
}
