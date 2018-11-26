package com.zkjc.recyc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/virtual")
public class VirtualController {

    @GetMapping
    public String home() {
        return "virtual";
    }
}

