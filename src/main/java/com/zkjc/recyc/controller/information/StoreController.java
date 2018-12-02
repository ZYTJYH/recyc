package com.zkjc.recyc.controller.information;

import com.zkjc.recyc.core.Result;
import com.zkjc.recyc.core.ResultGenerator;
import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.enums.EmployeeKindEnum;
import com.zkjc.recyc.enums.EmployeeStatusEnum;
import com.zkjc.recyc.mapper.StoresMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/information")
public class StoreController {

    @Autowired
    private StoresMapper storesMapper;

    @RequestMapping(value = "/Stores",method = RequestMethod.GET)
    public Result getStores() {
        List<PositionEntity> stores;
        try {
            stores = storesMapper.getAll();
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult(stores);
    }


    @RequestMapping(value = "/Stores/{employeeId}",method = RequestMethod.GET)
    public Result getPosition(@PathVariable("employeeId") String employeeId,@RequestParam("startDay") Date startDay,@RequestParam("endDay")Date endDay){
        List<PositionEntity> stores;
        try {
            stores = storesMapper.getOne(employeeId,startDay,endDay);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult(stores);
    }

    @RequestMapping(value = "/Stores",method = RequestMethod.POST)
    public Result insertPosition(@RequestParam("employeeId") String employeeId,
                                 @RequestParam("updateTime") Date updateTime,
                                 @RequestParam("longitude") Double longitude,
                                 @RequestParam("latitude") Double latitude,
                                 @RequestParam("workStatus") EmployeeStatusEnum workStatus,
                                 @RequestParam("kind") EmployeeKindEnum kind) {
        PositionEntity store=new PositionEntity(employeeId,updateTime,longitude,latitude,workStatus,kind);
        try {
            storesMapper.insert(store);
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

