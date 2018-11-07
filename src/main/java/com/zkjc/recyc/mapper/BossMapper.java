package com.zkjc.recyc.mapper;

import com.zkjc.recyc.entity.BossEntity;
import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.entity.UserEntity;
import com.zkjc.recyc.enums.EmployeeStatusEnum;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BossMapper {

    @Select("SELECT * FROM Bosses WHERE boss_id = #{bossId}")
    @Results({
            @Result(property = "bossId",  column = "boss_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone",column = "phone")
    })
    public BossEntity getBoss(String bossId);
}
