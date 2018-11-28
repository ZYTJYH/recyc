package com.zkjc.recyc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    JavaMailSender jms;
    public void send(){
        //建立邮件消息
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //发送者
        for(int i=0;i<100;i++) {
            mainMessage.setFrom("zkjc_recyc@163.com");
            //接收者
            mainMessage.setTo("793360641@qq.com");
            //发送的标题
            mainMessage.setSubject("蒋老板测试程序");
            //发送的内容
            mainMessage.setText("hello world" + i);
            jms.send(mainMessage);
        }
    }
}
