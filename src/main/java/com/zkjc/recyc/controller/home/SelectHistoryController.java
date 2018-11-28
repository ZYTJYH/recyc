package com.zkjc.recyc.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/selectHistory")
public class SelectHistoryController {
    @GetMapping
    public String selectHistory() {
        return "selectHistory";
    }
}
