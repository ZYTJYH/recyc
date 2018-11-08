package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.BossEntity;
import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.entity.UserEntity;
import com.zkjc.recyc.enums.EmployeeStatusEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BossMapper {

    @Select("SELECT * FROM Bosses WHERE boss_id = #{bossId}")
    @Results({
            @Result(property = "bossId",  column = "boss_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone",column = "phone")
    })
    BossEntity getBoss(String bossId);


    @Insert("INSERT INTO Bosses(boss_id,name,phone) VALUES(#{bossId},#{name},#{phone})")
    void insert(BossEntity boss);

    @Update("UPDATE Bosses SET name=#{name},phone=#{phone} WHERE boss_id=#{bossId}")
    void update(BossEntity boss);

    @Delete("DELETE FROM Bosses WHERE boss_id =#{bossId}")
    void delete(String bossId);


}
