package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.BossEntity;
import org.apache.ibatis.annotations.*;

public interface BossesMapper {

    @Select("SELECT * FROM Bosses WHERE boss_id = #{bossId}")
    @Results({
            @Result(property = "bossId",  column = "boss_id"),
            @Result(property = "bossName", column = "boss_name"),
            @Result(property = "phone",column = "phone"),
            @Result(property = "kind",  column = "kind"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "age",column = "age"),
            @Result(property = "area",column = "area"),
    })
    BossEntity getBoss(String bossId);


    @Insert("INSERT INTO Bosses(boss_id,boss_name,phone,kind,gender,age,area) VALUES(#{bossId},#{bossName},#{phone},#{kind},#{gender},#{age},#{area})")
    void insert(BossEntity boss);

    @Update("UPDATE Bosses SET boss_name=#{bossName},phone=#{phone},kind=#{kind},gender=#{gender},age=#{age},area=#{area}) WHERE boss_id=#{bossId}")
    void update(BossEntity boss);

    @Delete("DELETE FROM Bosses WHERE boss_id =#{bossId}")
    void delete(String bossId);


}
