package com.zkjc.recyc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/selectHistory")
public class SelectHistoryController {
    @GetMapping
    public String home() {
        return "selectHistory";
    }
}
