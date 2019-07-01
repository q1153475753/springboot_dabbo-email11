package com.qf.logonweb.controller;

import com.qf.mailentity.User;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("lo")
public class EmailController {

    @RequestMapping("/lg")
    public String insert(User user) {
        return "logon";
    }

    @RequestMapping("/la")
    public String la(User user) {

        return null;
    }
}
