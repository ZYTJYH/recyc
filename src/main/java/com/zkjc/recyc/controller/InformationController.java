package com.zkjc.recyc.controller;

import com.zkjc.recyc.entity.BossEntity;
import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.entity.UserEntity;
import com.zkjc.recyc.mapper.BossMapper;
import com.zkjc.recyc.mapper.PositionMapper;
import com.zkjc.recyc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/information")
public class InformationController {

    @Autowired
    private PositionMapper positionMapper;
    @Autowired
    private BossMapper bossMapper;


    @RequestMapping(value = "/getUsers",method = RequestMethod.GET)
    public List<PositionEntity> getPositions() {
        List<PositionEntity> positions=positionMapper.getAll();
        return positions;
    }

    @RequestMapping(value = "/getBoss",method = RequestMethod.GET)
    public BossEntity getBoss(@RequestParam(value="bossId") String bossId)
    {
        BossEntity boss=bossMapper.getBoss(bossId);
        return boss;
    }

}

