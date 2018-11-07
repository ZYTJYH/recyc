package com.zkjc.recyc.controller;

import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.entity.UserEntity;
import com.zkjc.recyc.mapper.PositionMapper;
import com.zkjc.recyc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private PositionMapper positionMapper;


    @GetMapping
    public String home() {
        return "home";
    }

    @RequestMapping("/getUsers")
    public List<PositionEntity> getPositions() {
        List<PositionEntity> positions=positionMapper.getAll();
        return positions;
    }

}

