package com.zkjc.recyc.controller;


import com.zkjc.recyc.core.Result;
import com.zkjc.recyc.core.ResultGenerator;
import com.zkjc.recyc.entity.CarEntity;
import com.zkjc.recyc.mapper.CarsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/information")
public class CarsController {
    @Autowired
    private CarsMapper carsMapper;



    @RequestMapping(value = "/Cars",method = RequestMethod.GET)
    public Result getCars()
    {
        List<CarEntity> cars;
        try{
            cars= carsMapper.getAll();
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult(cars);
    }

    @RequestMapping(value = "/Cars/{employeeId}",method = RequestMethod.GET)
    public Result getCar(@PathVariable("employeeId") String employeeId)
    {
        CarEntity car;
        try{
            car= carsMapper.getOne(employeeId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult(car);
    }

    @RequestMapping(value = "/Cars",method = RequestMethod.POST)
    public Result insertCar(@RequestParam("employeeId") String employeeId,
                            @RequestParam("carName") String carName,
                            @RequestParam("phone") String phone,
                            @RequestParam("carNumber") String carKind,
                            @RequestParam("carType") String carType,
                            @RequestParam("kind") String kind,
                            @RequestParam("gender") String gender,
                            @RequestParam("age") int age,
                            @RequestParam("area") String area,
                            @RequestParam("bossId") String bossId)

    {
        CarEntity car=new CarEntity(employeeId,carName,phone,carKind,carType,kind,gender,age,area,bossId);
        try {
            carsMapper.insert(car);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Cars/{employeeId}",method = RequestMethod.DELETE)
    public Result deleteCar(@PathVariable("employeeId") String employeeId)
    {
        try {
            carsMapper.delete(employeeId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Cars",method = RequestMethod.PUT)
    public Result updateCar(@RequestParam("employeeId") String employeeId,
                            @RequestParam("carName") String carName,
                            @RequestParam("phone") String phone,
                            @RequestParam("carNumber") String carKind,
                            @RequestParam("carType") String carType,
                            @RequestParam("kind") String kind,
                            @RequestParam("gender") String gender,
                            @RequestParam("age") int age,
                            @RequestParam("area") String area,
                            @RequestParam("bossId") String bossId)

    {
        CarEntity car=new CarEntity(employeeId,carName,phone,carKind,carType,kind,gender,age,area,bossId);
        try {
            carsMapper.update(car);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult();
    }
}
