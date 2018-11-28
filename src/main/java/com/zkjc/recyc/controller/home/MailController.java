package com.zkjc.recyc.controller.home;

import com.zkjc.recyc.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    MailService service;
    @GetMapping("/home/email")
    public void xx(){
        service.send();
    }
}
