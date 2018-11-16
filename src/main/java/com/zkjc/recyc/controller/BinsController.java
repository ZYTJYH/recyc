package com.zkjc.recyc.controller;


import com.zkjc.recyc.core.Result;
import com.zkjc.recyc.core.ResultGenerator;
import com.zkjc.recyc.entity.BinEntity;
import com.zkjc.recyc.mapper.BinsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/information")
public class BinsController {
    @Autowired
    private BinsMapper binsMapper;

    @RequestMapping(value = "/Bins",method = RequestMethod.GET)
    public Result getBins()
    {
        List<BinEntity> bins;
        try{
            bins= binsMapper.getAll();
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult(bins);
    }

    @RequestMapping(value = "/Bins/{employeeId}",method = RequestMethod.GET)
    public Result getBin(@PathVariable("employeeId") String employeeId)
    {
        BinEntity bin;
        try{
            bin= binsMapper.getOne(employeeId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult(bin);
    }

    @RequestMapping(value = "/Bins",method = RequestMethod.POST)
    public Result insertBin(@RequestParam("employeeId") String employeeId,
                            @RequestParam("binName") String binName,
                            @RequestParam("currentV") int currentV,
                            @RequestParam("maxV") int maxV,
                            @RequestParam("area") String area,
                            @RequestParam("temperature") double temperature,
                            @RequestParam("bossId") String bossId)

    {
        BinEntity bin=new BinEntity(employeeId,binName,currentV,maxV,area,temperature,bossId);
        try {
            binsMapper.insert(bin);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Bins/{employeeId}",method = RequestMethod.DELETE)
    public Result deleteBin(@PathVariable("employeeId") String employeeId)
    {
        try {
            binsMapper.delete(employeeId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Bins/{employeeId}",method = RequestMethod.PUT)
    public Result updateBin(@PathVariable("employeeId") String employeeId,
                            @RequestParam("binName") String binName,
                            @RequestParam("currentV") int currentV,
                            @RequestParam("maxV") int maxV,
                            @RequestParam("area") String area,
                            @RequestParam("temperature") double temperature,
                            @RequestParam("bossId") String bossId)

    {
        BinEntity bin=new BinEntity(employeeId,binName,currentV,maxV,area,temperature,bossId);
        try {
            binsMapper.update(bin);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult();
    }
}
