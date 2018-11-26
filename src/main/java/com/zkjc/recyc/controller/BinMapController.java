package com.zkjc.recyc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/binMap")
public class BinMapController {

    @GetMapping
    public String binMap() {
        return "binMap";
    }

}
