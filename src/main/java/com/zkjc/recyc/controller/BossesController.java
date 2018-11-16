package com.zkjc.recyc.controller;

import com.zkjc.recyc.core.Result;
import com.zkjc.recyc.core.ResultGenerator;
import com.zkjc.recyc.entity.BossEntity;
import com.zkjc.recyc.mapper.BossesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/information")
public class BossesController {
    @Autowired
    private BossesMapper bossesMapper;

    @RequestMapping(value = "/Bosses/{bossId}",method = RequestMethod.GET)
    public Result getBoss(@PathVariable("bossId") String bossId)
    {
        BossEntity boss;
        try{
            boss= bossesMapper.getBoss(bossId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult(boss);
    }

    @RequestMapping(value = "/Bosses",method = RequestMethod.POST)
    public Result insertBoss(@RequestParam("bossId") String bossId,
                             @RequestParam("bossName") String bossName,
                             @RequestParam("phone") String phone,
                             @RequestParam("kind") String kind,
                             @RequestParam("gender") String gender,
                             @RequestParam("age") int age,
                             @RequestParam("area") String area)

    {
        BossEntity boss=new BossEntity(bossId,bossName,phone,kind,gender,age,area);
        try {
            bossesMapper.insert(boss);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Bosses/{bossId}",method = RequestMethod.DELETE)
    public Result deleteBoss(@PathVariable("bossId") String bossId)
    {
        try {
            bossesMapper.delete(bossId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Bosses",method = RequestMethod.PUT)
    public Result updateBoss(@RequestParam("bossId") String bossId,
                             @RequestParam("bossName") String bossName,
                             @RequestParam("phone") String phone,
                             @RequestParam("kind") String kind,
                             @RequestParam("gender") String gender,
                             @RequestParam("age") int age,
                             @RequestParam("area") String area)
    {
        BossEntity boss=new BossEntity(bossId,bossName,phone,kind,gender,age,area);
        try {
            bossesMapper.update(boss);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

}
