package com.hua.soapwebservice.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HuaConnection {
    @Autowired
    HuaClient client;

    @GetMapping("/connection")
    public void connection(){
        System.out.println(client.connect());
    }
}
