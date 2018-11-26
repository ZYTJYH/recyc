package com.zkjc.recyc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addInformation")
public class AddInformationController {
    @GetMapping
    public String home() {
        return "addInformation";
    }
}
