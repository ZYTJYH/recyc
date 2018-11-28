package com.zkjc.recyc.controller.information;

import com.zkjc.recyc.core.Result;
import com.zkjc.recyc.core.ResultGenerator;
import com.zkjc.recyc.entity.PersonEntity;
import com.zkjc.recyc.mapper.PersonsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/information")
public class PersonsController {
    @Autowired
    private PersonsMapper personsMapper;

    @RequestMapping(value = "/Persons",method = RequestMethod.GET)
    public Result getPersons()
    {
        List<PersonEntity> persons;
        try{
            persons= personsMapper.getAll();
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult(persons);
    }

    @RequestMapping(value = "/Persons/{employeeId}",method = RequestMethod.GET)
    public Result getPerson(@PathVariable("employeeId") String employeeId)
    {
        PersonEntity person;
        try{
            person=personsMapper.getOne(employeeId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult(person);
    }

    @RequestMapping(value = "/Persons",method = RequestMethod.POST)
    public Result insertPerson(@RequestParam("employeeId") String employeeId,
                            @RequestParam("personName") String personName,
                            @RequestParam("phone") String phone,
                            @RequestParam("job") String job,
                            @RequestParam("kind") String kind,
                            @RequestParam("gender") String gender,
                            @RequestParam("age") int age,
                            @RequestParam("area") String area,
                            @RequestParam("bossId") String bossId)

    {
        PersonEntity person=new PersonEntity(employeeId,personName,phone,job,kind,gender,age,area,bossId);
        try {
            personsMapper.insert(person);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Persons/{employeeId}",method = RequestMethod.DELETE)
    public Result deletePerson(@PathVariable("employeeId") String employeeId)
    {
        try {
            personsMapper.delete(employeeId);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult("失败");
        }
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/Persons/{employeeId}",method = RequestMethod.PUT)
    public Result updatePerson(@PathVariable("employeeId") String employeeId,
                            @RequestParam("personName") String personName,
                            @RequestParam("phone") String phone,
                            @RequestParam("job") String job,
                            @RequestParam("kind") String kind,
                            @RequestParam("gender") String gender,
                            @RequestParam("age") int age,
                            @RequestParam("area") String area,
                            @RequestParam("bossId") String bossId)

    {
        PersonEntity person=new PersonEntity(employeeId,personName,phone,job,kind,gender,age,area,bossId);
        try {
            personsMapper.update(person);
        }catch (Exception e)
        {
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult();
    }
}
