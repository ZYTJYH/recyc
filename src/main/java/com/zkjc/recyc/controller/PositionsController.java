package com.zkjc.recyc.controller;

import com.zkjc.recyc.core.Result;
import com.zkjc.recyc.core.ResultGenerator;
import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.enums.EmployeeKindEnum;
import com.zkjc.recyc.enums.EmployeeStatusEnum;
import com.zkjc.recyc.mapper.PositionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/information")
public class PositionsController {

    @Autowired
    private PositionsMapper positionsMapper;

    @RequestMapping(value = "/Positions",method = RequestMethod.GET)
    public Result getPositions() {
        List<PositionEntity> positions;
        try {
             positions = positionsMapper.getAll();
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult(positions);
    }


    @RequestMapping(value = "/Positions/{employeeId}",method = RequestMethod.GET)
    public Result getPosition(@PathVariable("employeeId") String employeeId){
        PositionEntity positionEntity;
        try {
            positionEntity=positionsMapper.getOne(employeeId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult(positionEntity);
    }

    @RequestMapping(value = "/Positions",method = RequestMethod.POST)
    public Result insertPosition(@RequestParam("employeeId") String employeeId,
                                 @RequestParam("updateTime") Date updateTime,
                                 @RequestParam("longitude") Double longitude,
                                 @RequestParam("latitude") Double latitude,
                                 @RequestParam("workStatus") EmployeeStatusEnum workStatus,
                                 @RequestParam("kind") EmployeeKindEnum kind) {
        PositionEntity position=new PositionEntity(employeeId,updateTime,longitude,latitude,workStatus,kind);
        try {
            positionsMapper.insert(position);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Positions",method = RequestMethod.PUT)
    public Result updatePosition(@RequestParam("employeeId") String employeeId,
                                 @RequestParam("updateTime") Date updateTime,
                                 @RequestParam("longitude") Double longitude,
                                 @RequestParam("latitude") Double latitude,
                                 @RequestParam("workStatus") EmployeeStatusEnum workStatus,
                                 @RequestParam("kind") EmployeeKindEnum kind) {
        PositionEntity position=new PositionEntity(employeeId,updateTime,longitude,latitude,workStatus,kind);
        try {
            positionsMapper.update(position);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Positions/{employeeId}",method = RequestMethod.DELETE)
    public Result deletePosition(@PathVariable("employeeId") String employeeId){
        try {
            positionsMapper.delete(employeeId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult();
    }



    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


}

