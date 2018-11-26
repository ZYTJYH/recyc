package com.zkjc.recyc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/personMap")
public class PersonMapController {

    @GetMapping
    public String personMap() {
        return "personMap";
    }

}
