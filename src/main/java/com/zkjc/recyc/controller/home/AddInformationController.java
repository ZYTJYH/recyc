package com.zkjc.recyc.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/addInformation")
public class AddInformationController {
    @GetMapping
    public String addInformation() {
        return "addInformation";
    }
}
