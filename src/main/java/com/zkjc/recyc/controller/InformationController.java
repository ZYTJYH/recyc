package com.zkjc.recyc.controller;

import com.zkjc.recyc.core.Result;
import com.zkjc.recyc.core.ResultGenerator;
import com.zkjc.recyc.entity.BossEntity;
import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.entity.UserEntity;
import com.zkjc.recyc.enums.EmployeeKindEnum;
import com.zkjc.recyc.enums.EmployeeStatusEnum;
import com.zkjc.recyc.mapper.BossMapper;
import com.zkjc.recyc.mapper.PositionMapper;
import com.zkjc.recyc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/information")
public class InformationController {

    @Autowired
    private PositionMapper positionMapper;
    @Autowired
    private BossMapper bossMapper;


    @RequestMapping(value = "/Positions",method = RequestMethod.GET)
    public Result getPositions() {
        List<PositionEntity> positions;
        try {
             positions = positionMapper.getAll();
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult(positions);
    }

    @RequestMapping(value = "/Positions",method = RequestMethod.POST)
    public Result insertPosition(@RequestParam("employeeId") String employeeId,
                                 @RequestParam("time") Date time,
                                 @RequestParam("longitude") Double longitude,
                                 @RequestParam("latitude") Double latitude,
                                 @RequestParam("workStatus") EmployeeStatusEnum workStatus,
                                 @RequestParam("bossId") String bossId,
                                 @RequestParam("information") String information,
                                 @RequestParam("kind") EmployeeKindEnum kind) {
        PositionEntity position=new PositionEntity(employeeId,time,longitude,latitude,workStatus,bossId,information,kind);
        try {
            positionMapper.insert(position);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Positions",method = RequestMethod.PUT)
    public Result updatePosition(@RequestParam("employeeId") String employeeId,
                                 @RequestParam("time") Date time,
                                 @RequestParam("longitude") Double longitude,
                                 @RequestParam("latitude") Double latitude,
                                 @RequestParam("workStatus") EmployeeStatusEnum workStatus,
                                 @RequestParam("bossId") String bossId,
                                 @RequestParam("information") String information,
                                 @RequestParam("kind") EmployeeKindEnum kind) {
        PositionEntity position=new PositionEntity(employeeId,time,longitude,latitude,workStatus,bossId,information,kind);
        try {
            positionMapper.update(position);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Positions",method = RequestMethod.DELETE)
    public Result deletePosition(@RequestParam("employeeId") String employeeId){
        try {
            positionMapper.delete(employeeId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }



    @RequestMapping(value = "/Bosses/{bossId}",method = RequestMethod.GET)
    public Result getBoss(@PathVariable("bossId") String bossId)
    {
        BossEntity boss;
        try{
            boss=bossMapper.getBoss(bossId);
         }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult(boss);
    }

    @RequestMapping(value = "/Bosses",method = RequestMethod.POST)
    public Result insertBoss(@RequestParam("bossId") String bossId,
                              @RequestParam("name") String name,
                              @RequestParam("phone") String phone)
    {
        BossEntity boss=new BossEntity(bossId,name,phone);
        try {
            bossMapper.insert(boss);
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
            bossMapper.delete(bossId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Bosses",method = RequestMethod.PUT)
    public Result updateBoss(@RequestParam("bossId") String bossId,
                             @RequestParam("name") String name,
                             @RequestParam("phone") String phone)
    {
        BossEntity boss=new BossEntity(bossId,name,phone);
        try {
            bossMapper.update(boss);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }



    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

}

